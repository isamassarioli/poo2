/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import model.Paciente;
import model.TipoVacina;
import model.Vacina;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author jean_
 */

public class PacienteDAO {
    
    public PacienteDAO() {
        
    }
    
    public void inserir(Paciente pac) {
        // Inserir todos os dados de um Paciente no banco de dados       
        // Observe que o parâmetro é um objeto do tipo Paciente, 
        //   portanto você deverá ler de um Frame os dados, criar um objeto 
        //   do tipo Paciente e passar como parâmetro para essa função
        //
        // Se for COVID 1ª dose, inserir também a data agendada da segunda dose
        // Se não existir a data da Segunda Dose, então inserir null
        //
        // precisaDose2 -> recebe 0 (zero) quando NÃO precisar da segunda dose e
        //                 recebe 1 quando ainda precisar tomar a segunda dose
        String sql = "INSERT INTO Paciente (nomePaciente, cpf, dtDose1, dtDose2, precisaDose2, idVacina) "
                + "VALUES (?, ?, ?, ?, ?, ?)";

        try (Connection conn = ConexaoBD.getConexao();
                PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setString(1, pac.getNomePaciente());
            ps.setString(2, pac.getCpf());
            ps.setDate(3, toSqlDate(pac.getDataDose1()));

            if (pac.getDataDose2() == null) {
                ps.setNull(4, java.sql.Types.DATE);
            } else {
                ps.setDate(4, toSqlDate(pac.getDataDose2()));
            }

            ps.setInt(5, pac.getPrecisaDose2());
            ps.setInt(6, pac.getVacina().getIdVacina());
            ps.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao inserir paciente.", e);
        }
    }
    
    public void alterar(int id, java.util.Date dose2) {
        // Alterar a data da segunda dose do paciente identificado pelo parâmetro ID
        // Alterar também o campo precisaDose2 para 0 (zero)

        String sql = "UPDATE Paciente SET dtDose2 = ?, precisaDose2 = 0 WHERE idPaciente = ?";

        try (Connection conn = ConexaoBD.getConexao();
                PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setDate(1, toSqlDate(dose2));
            ps.setInt(2, id);

            int linhas = ps.executeUpdate();
            if (linhas == 0) {
                throw new RuntimeException("Paciente não encontrado para atualização da 2ª dose.");
            }
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao atualizar 2ª dose do paciente.", e);
        }
    }
    
    public Paciente pesquisarPorID(int id) {
        // Pesquisar no banco e retorna um objeto do tipo Paciente
        //    de acordo com o id do paciente
        
        Paciente pac = null;

        String sql = sqlBase() + " WHERE p.idPaciente = ?";

        try (Connection conn = ConexaoBD.getConexao();
                PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, id);

            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    pac = mapPaciente(rs);
                }
            }
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao pesquisar paciente por ID.", e);
        }
        
        return pac;
    }
    
    public List<Paciente> pesquisarSegundaDose(){
        // Pesquisar no banco e retornar, através de um List,
        //   todos os pacientes que precisam da segunda dose,
        //   ou seja, cujo campo precisaDose2 é igual a 1
        
        List<Paciente> lista = new ArrayList<>();

        String sql = sqlBase() + " WHERE p.precisaDose2 = 1 ORDER BY p.nomePaciente";

        try (Connection conn = ConexaoBD.getConexao();
                PreparedStatement ps = conn.prepareStatement(sql);
                ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                lista.add(mapPaciente(rs));
            }
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao pesquisar pacientes da 2ª dose.", e);
        }
        
        return lista;
   
    }
    
    
    public List<Paciente> pesquisarPorVacina(Vacina vacina){
        // Pesquisar no banco e retornar, através de um List,
        //   todos os pacientes que tomaram a vacina passanda pelo parâmetro.
   
        List<Paciente> lista = new ArrayList<>();

        String sql = sqlBase() + " WHERE v.idVacina = ? ORDER BY p.nomePaciente";

        try (Connection conn = ConexaoBD.getConexao();
                PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, vacina.getIdVacina());

            try (ResultSet rs = ps.executeQuery()) {
                while (rs.next()) {
                    lista.add(mapPaciente(rs));
                }
            }
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao pesquisar pacientes por vacina.", e);
        }
        
        return lista;
    }
        
    public List<Paciente> listar() {
        // Pesquisar no banco e retornar, através de um List,
        // todos os pacientes
        
        List<Paciente> lista = new ArrayList<>();

        String sql = sqlBase() + " ORDER BY p.idPaciente";

        try (Connection conn = ConexaoBD.getConexao();
                PreparedStatement ps = conn.prepareStatement(sql);
                ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                lista.add(mapPaciente(rs));
            }
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao listar pacientes.", e);
        }
        
        return lista;
        
    }

    private String sqlBase() {
        return "SELECT p.idPaciente, p.nomePaciente, p.cpf, p.dtDose1, p.dtDose2, p.precisaDose2, "
                + "v.idVacina, v.nomeVacina, v.qtdeDoses, "
                + "t.idTipoVacina, t.descricao "
                + "FROM Paciente p "
                + "INNER JOIN Vacina v ON v.idVacina = p.idVacina "
                + "INNER JOIN TipoVacina t ON t.idTipoVacina = v.idTipoVacina";
    }

    private Paciente mapPaciente(ResultSet rs) throws SQLException {
        TipoVacina tipoVacina = new TipoVacina(
                rs.getInt("idTipoVacina"),
                rs.getString("descricao")
        );

        Vacina vacina = new Vacina(
                rs.getInt("idVacina"),
                rs.getString("nomeVacina"),
                rs.getInt("qtdeDoses"),
                tipoVacina
        );

        Paciente paciente = new Paciente();
        paciente.setIdPaciente(rs.getInt("idPaciente"));
        paciente.setNomePaciente(rs.getString("nomePaciente"));
        paciente.setCpf(rs.getString("cpf"));

        java.sql.Date dose1 = rs.getDate("dtDose1");
        if (dose1 != null) {
            paciente.setDataDose1(new java.util.Date(dose1.getTime()));
        }

        java.sql.Date dose2 = rs.getDate("dtDose2");
        if (dose2 != null) {
            paciente.setDataDose2(new java.util.Date(dose2.getTime()));
        }

        paciente.setPrecisaDose2(rs.getInt("precisaDose2"));
        paciente.setVacina(vacina);
        return paciente;
    }

    private java.sql.Date toSqlDate(java.util.Date data) {
        if (data == null) {
            return null;
        }
        return new java.sql.Date(data.getTime());
    }
    
    
}

