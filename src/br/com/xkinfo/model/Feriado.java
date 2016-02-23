package br.com.xkinfo.model;

import java.util.Calendar;

public class Feriado {

	private int id;
	private String descricao;
	private Calendar dia;
	private String tipo;
	private Municipio municipio;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public Calendar getDia() {
		return dia;
	}
	public void setDia(Calendar dia) {
		this.dia = dia;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public Municipio getMunicipio() {
		return municipio;
	}
	public void setMunicipio(Municipio municipio) {
		this.municipio = municipio;
	}
}
