package br.com.xkinfo.model;

public class Municipio {

	private int id;
	private String nome;
	private String sigla;
	private String cep;
	private String codigoIbge;
	
	public String getCep() {
		return cep;
	}
	public String getCodigoIbge() {
		return codigoIbge;
	}
	public int getId() {
		return id;
	}
	public String getNome() {
		return nome;
	}
	public String getSigla() {
		return sigla;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	public void setCodigoIbge(String codigoIbge) {
		this.codigoIbge = codigoIbge;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setSigla(String sigla) {
		this.sigla = sigla;
	}
}
