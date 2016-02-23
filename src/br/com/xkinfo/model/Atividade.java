package br.com.xkinfo.model;

public class Atividade {

	private int id;
	private String descricao;
	private String grupoAneel;
	private int numero;
	private String epe;
	private GrupoAtividade grupoAtividade;
	
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
	public String getGrupoAneel() {
		return grupoAneel;
	}
	public void setGrupoAneel(String grupoAneel) {
		this.grupoAneel = grupoAneel;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getEpe() {
		return epe;
	}
	public void setEpe(String epe) {
		this.epe = epe;
	}
	public GrupoAtividade getGrupoAtividade() {
		return grupoAtividade;
	}
	public void setGrupoAtividade(GrupoAtividade grupoAtividade) {
		this.grupoAtividade = grupoAtividade;
	}
}
