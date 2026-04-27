/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Date;

/**
 *
 * @author jean_
 */
public class Paciente {

	private int idPaciente;
	private String nomePaciente;
	private String cpf;
	private Date dataDose1;
	private Date dataDose2;
	private int precisaDose2;
	private Vacina vacina;

	public Paciente() {
	}

	public Paciente(int idPaciente, String nomePaciente, String cpf, Date dataDose1, Date dataDose2, int precisaDose2, Vacina vacina) {
		this.idPaciente = idPaciente;
		this.nomePaciente = nomePaciente;
		this.cpf = cpf;
		this.dataDose1 = dataDose1;
		this.dataDose2 = dataDose2;
		this.precisaDose2 = precisaDose2;
		this.vacina = vacina;
	}

	public int getIdPaciente() {
		return idPaciente;
	}

	public void setIdPaciente(int idPaciente) {
		this.idPaciente = idPaciente;
	}

	public String getNomePaciente() {
		return nomePaciente;
	}

	public void setNomePaciente(String nomePaciente) {
		this.nomePaciente = nomePaciente;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Date getDataDose1() {
		return dataDose1;
	}

	public void setDataDose1(Date dataDose1) {
		this.dataDose1 = dataDose1;
	}

	public Date getDataDose2() {
		return dataDose2;
	}

	public void setDataDose2(Date dataDose2) {
		this.dataDose2 = dataDose2;
	}

	public int getPrecisaDose2() {
		return precisaDose2;
	}

	public void setPrecisaDose2(int precisaDose2) {
		this.precisaDose2 = precisaDose2;
	}

	public Vacina getVacina() {
		return vacina;
	}

	public void setVacina(Vacina vacina) {
		this.vacina = vacina;
	}

}
