package br.com.xkinfo.pessoa.model;

public class Estado {

	private int id;
	private String nome;
	private String sigla;
	private Pais pais;
	private String codigoIbge;
	
	public int getId() {
		return id;
	}
	public String getNome() {
		return nome;
	}
	public Pais getPais() {
		return pais;
	}
	public String getSigla() {
		return sigla;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setPais(Pais pais) {
		this.pais = pais;
	}
	public void setSigla(String sigla) {
		this.sigla = sigla;
	}
	public String getCodigoIbge() {
		return codigoIbge;
	}
	public void setCodigoIbge(String codigoIbge) {
		this.codigoIbge = codigoIbge;
	}
}
