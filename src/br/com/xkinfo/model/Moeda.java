package br.com.xkinfo.model;

public class Moeda {

	private int id;
	private String moeda;
	private String descricao;
	private String nomeSingular;
	private String nomePlural;
	private String sigla;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getMoeda() {
		return moeda;
	}
	public void setMoeda(String moeda) {
		this.moeda = moeda;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getNomeSingular() {
		return nomeSingular;
	}
	public void setNomeSingular(String nomeSingular) {
		this.nomeSingular = nomeSingular;
	}
	public String getNomePlural() {
		return nomePlural;
	}
	public void setNomePlural(String nomePlural) {
		this.nomePlural = nomePlural;
	}
	public String getSigla() {
		return sigla;
	}
	public void setSigla(String sigla) {
		this.sigla = sigla;
	}
}
