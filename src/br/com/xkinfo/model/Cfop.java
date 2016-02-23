package br.com.xkinfo.model;

public class Cfop {

	private int id;
	private int numero;
	private String descricao;
	
	public String getDescricao() {
		return descricao;
	}
	public int getId() {
		return id;
	}
	public int getNumero() {
		return numero;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
}
