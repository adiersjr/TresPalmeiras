package br.com.xkinfo.pessoa.model;

public class Cargo {

	private int id;
	private String descricao;
	
	public String getDescricao() {
		return descricao;
	}
	public int getId() {
		return id;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public void setId(int id) {
		this.id = id;
	}
}