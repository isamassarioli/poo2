/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author jean_
 */
public class Vacina {

	private int idVacina;
	private String nomeVacina;
	private int qtdeDoses;
	private TipoVacina tipoVacina;

	public Vacina() {
	}

	public Vacina(int idVacina, String nomeVacina, int qtdeDoses, TipoVacina tipoVacina) {
		this.idVacina = idVacina;
		this.nomeVacina = nomeVacina;
		this.qtdeDoses = qtdeDoses;
		this.tipoVacina = tipoVacina;
	}

	public int getIdVacina() {
		return idVacina;
	}

	public void setIdVacina(int idVacina) {
		this.idVacina = idVacina;
	}

	public String getNomeVacina() {
		return nomeVacina;
	}

	public void setNomeVacina(String nomeVacina) {
		this.nomeVacina = nomeVacina;
	}

	public int getQtdeDoses() {
		return qtdeDoses;
	}

	public void setQtdeDoses(int qtdeDoses) {
		this.qtdeDoses = qtdeDoses;
	}

	public TipoVacina getTipoVacina() {
		return tipoVacina;
	}

	public void setTipoVacina(TipoVacina tipoVacina) {
		this.tipoVacina = tipoVacina;
	}

	@Override
	public String toString() {
		return nomeVacina;
	}

}
