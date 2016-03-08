package br.com.xkinfo.endereco.model;

public class Bairro {

	private int id;
	private String nome;
	private Municipio municipio;
	
	public int getId() {
		return id;
	}
	public Municipio getMunicipio() {
		return municipio;
	}
	public String getNome() {
		return nome;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setMunicipio(Municipio municipio) {
		this.municipio = municipio;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
}
