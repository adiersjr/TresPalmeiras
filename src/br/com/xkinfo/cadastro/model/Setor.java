package br.com.xkinfo.cadastro.model;

import java.util.Calendar;
import br.com.xkinfo.endereco.model.Municipio;

public class Setor {

	private int id;
	private String chave;
	private Municipio municipio;
	private String setor;
	private String descricao;
	private String ultimaFatura;
	private Calendar dataUltimaCalc;
	private Calendar dataUltimaExtFatura;
	private char localizacao;
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
	public Calendar getDataUltimaCalc() {
		return dataUltimaCalc;
	}
	public void setDataUltimaCalc(Calendar dataUltimaCalc) {
		this.dataUltimaCalc = dataUltimaCalc;
	}
	public Calendar getDataUltimaExtFatura() {
		return dataUltimaExtFatura;
	}
	public void setDataUltimaExtFatura(Calendar dataUltimaExtFatura) {
		this.dataUltimaExtFatura = dataUltimaExtFatura;
	}
	public char getLocalizacao() {
		return localizacao;
	}
	public void setLocalizacao(char localizacao) {
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
