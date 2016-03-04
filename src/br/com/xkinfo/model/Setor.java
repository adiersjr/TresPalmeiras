package br.com.xkinfo.model;

import java.util.Calendar;

import br.com.xkinfo.pessoa.model.Municipio;

public class Setor {

	private int id;
	private String chave;
	private Municipio municipio;
	private String setor;
	private String descricao;
	private String ultimaFatura;
	private Calendar dataUltimaFatura;
	private Calendar dataUltimaExtFatura;
	private String localizacao;
	private String ultimaFaturaT;
	private Calendar dataUltimaCalCat;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getChave() {
		return chave;
	}
	public void setChave(String chave) {
		this.chave = chave;
	}
	public Municipio getMunicipio() {
		return municipio;
	}
	public void setMunicipio(Municipio municipio) {
		this.municipio = municipio;
	}
	public String getSetor() {
		return setor;
	}
	public void setSetor(String setor) {
		this.setor = setor;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getUltimaFatura() {
		return ultimaFatura;
	}
	public void setUltimaFatura(String ultimaFatura) {
		this.ultimaFatura = ultimaFatura;
	}
	public Calendar getDataUltimaFatura() {
		return dataUltimaFatura;
	}
	public void setDataUltimaFatura(Calendar dataUltimaFatura) {
		this.dataUltimaFatura = dataUltimaFatura;
	}
	public Calendar getDataUltimaExtFatura() {
		return dataUltimaExtFatura;
	}
	public void setDataUltimaExtFatura(Calendar dataUltimaExtFatura) {
		this.dataUltimaExtFatura = dataUltimaExtFatura;
	}
	public String getLocalizacao() {
		return localizacao;
	}
	public void setLocalizacao(String localizacao) {
		this.localizacao = localizacao;
	}
	public String getUltimaFaturaT() {
		return ultimaFaturaT;
	}
	public void setUltimaFaturaT(String ultimaFaturaT) {
		this.ultimaFaturaT = ultimaFaturaT;
	}
	public Calendar getDataUltimaCalCat() {
		return dataUltimaCalCat;
	}
	public void setDataUltimaCalCat(Calendar dataUltimaCalCat) {
		this.dataUltimaCalCat = dataUltimaCalCat;
	}
}
