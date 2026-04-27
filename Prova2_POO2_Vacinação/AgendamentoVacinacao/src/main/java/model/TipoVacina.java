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
public class TipoVacina {

	private int idTipoVacina;
	private String descricao;

	public TipoVacina() {
	}

	public TipoVacina(int idTipoVacina, String descricao) {
		this.idTipoVacina = idTipoVacina;
		this.descricao = descricao;
	}

	public int getIdTipoVacina() {
		return idTipoVacina;
	}

	public void setIdTipoVacina(int idTipoVacina) {
		this.idTipoVacina = idTipoVacina;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	@Override
	public String toString() {
		return descricao;
	}

}
