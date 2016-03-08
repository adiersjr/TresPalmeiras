package br.com.xkinfo.endereco.model;

import br.com.xkinfo.model.Eta;

public class Rua {

	private int id;
	private TipoLogradouro tipoLogradouro;
	private Eta eta;
	private String nome;
	private String bairro;
	private Double valorLixo;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public TipoLogradouro getTipoLogradouro() {
		return tipoLogradouro;
	}
	public void setTipoLogradouro(TipoLogradouro tipoLogradouro) {
		this.tipoLogradouro = tipoLogradouro;
	}
	public Eta getEta() {
		return eta;
	}
	public void setEta(Eta eta) {
		this.eta = eta;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public Double getValorLixo() {
		return valorLixo;
	}
	public void setValorLixo(Double valorLixo) {
		this.valorLixo = valorLixo;
	}
}
