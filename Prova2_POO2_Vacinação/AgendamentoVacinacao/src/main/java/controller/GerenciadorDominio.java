/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.PacienteDAO;
import dao.VacinaDAO;
import java.util.Date;
import java.util.List;
import model.Paciente;
import model.Vacina;

/**
 *
 * @author jean_
 */
public class GerenciadorDominio {

	private final PacienteDAO pacienteDAO;
	private final VacinaDAO vacinaDAO;

	public GerenciadorDominio() {
		this.pacienteDAO = new PacienteDAO();
		this.vacinaDAO = new VacinaDAO();
	}

	public List<Vacina> pesquisarVacinasPorTipo(int tipo) {
		return vacinaDAO.pesquisarVacinasPorTipo(tipo);
	}

	public void inserirPaciente(Paciente paciente) {
		pacienteDAO.inserir(paciente);
	}

	public void registrarDose2(int idPaciente, Date dataDose2) {
		pacienteDAO.alterar(idPaciente, dataDose2);
	}

	public Paciente pesquisarPacientePorId(int idPaciente) {
		return pacienteDAO.pesquisarPorID(idPaciente);
	}

	public List<Paciente> listarPacientes() {
		return pacienteDAO.listar();
	}

	public List<Paciente> pesquisarPacientesDose2() {
		return pacienteDAO.pesquisarSegundaDose();
	}

	public List<Paciente> pesquisarPacientesPorVacina(Vacina vacina) {
		return pacienteDAO.pesquisarPorVacina(vacina);
	}
    
}






