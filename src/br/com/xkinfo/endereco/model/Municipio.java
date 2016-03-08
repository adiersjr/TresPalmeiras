package br.com.xkinfo.endereco.model;

public class Municipio {

	private int id;
	private String nome;
	private Estado estado;
	private String cep;
	private String codigoIbge;
	private String prodist;
	
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
	public Estado getEstado() {
		return estado;
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
	public void setEstado(Estado estado) {
		this.estado = estado;
	}
	public String getProdist() {
		return prodist;
	}
	public void setProdist(String prodist) {
		this.prodist = prodist;
	}
}
