package br.com.xkinfo.pessoa.model;

public class TipoDocumento {

	private int id;
	private String descricao;
	private boolean pessoal;
	
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
	public boolean isPessoal() {
		return pessoal;
	}
	public void setPessoal(boolean pessoal) {
		this.pessoal = pessoal;
	}
}