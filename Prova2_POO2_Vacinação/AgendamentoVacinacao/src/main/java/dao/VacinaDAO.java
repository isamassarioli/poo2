/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.Vacina;
import java.util.List;
import model.TipoVacina;

/**
 *
 * @author jean_
 */

public class VacinaDAO {
    
    public VacinaDAO() {
        
    }
  
    
    public List<Vacina> pesquisarVacinasPorTipo(int tipo){
        // Pesquisar no banco e retornar, através de um List,
        //   todas as vacinas do tipo especificado pelo parâmetro.
        // 1 -> COVID
        // 2 -> Outras
        
        List<Vacina> lista = new ArrayList<>();

        String sql = "SELECT v.idVacina, v.nomeVacina, v.qtdeDoses, t.idTipoVacina, t.descricao "
                + "FROM Vacina v "
                + "INNER JOIN TipoVacina t ON t.idTipoVacina = v.idTipoVacina "
                + "WHERE v.idTipoVacina = ? "
                + "ORDER BY v.nomeVacina";

        try (Connection conn = ConexaoBD.getConexao();
                PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, tipo);

            try (ResultSet rs = ps.executeQuery()) {
                while (rs.next()) {
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

                    lista.add(vacina);
                }
            }
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao pesquisar vacinas por tipo.", e);
        }
        
        return lista;
   
    }

    public List<Vacina> pesquisarPorVacina(int tipo) {
        return pesquisarVacinasPorTipo(tipo);
    }
        

}

