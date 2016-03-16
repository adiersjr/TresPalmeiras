package br.com.xkinfo.arrecadacao.model;

import br.com.xkinfo.endereco.model.Estado;

public class Agencia {

	private int id;
	private String chave;
	private Banco banco;
	private String numero;
	private String nome;
	private String convenioF;
	private String convenioG;
	private int nsr;
	private char digito;
	private String endereco;
	private String complemento;
	private String bairro;
	private String cep;
	private String municipio;
	private Estado estado;
	private String ddd;
	private String telefone;
	public Agencia() {
		// TODO Auto-generated constructor stub
	}
	public Agencia(String nome) {
		this.nome = nome;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Banco getBanco() {
		return banco;
	}
	public void setBanco(Banco banco) {
		this.banco = banco;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getConvenioF() {
		return convenioF;
	}
	public void setConvenioF(String convenioF) {
		this.convenioF = convenioF;
	}
	public String getConvenioG() {
		return convenioG;
	}
	public void setConvenioG(String convenioG) {
		this.convenioG = convenioG;
	}
	public int getNsr() {
		return nsr;
	}
	public void setNsr(int nsr) {
		this.nsr = nsr;
	}
	public char getDigito() {
		return digito;
	}
	public void setDigito(char digito) {
		this.digito = digito;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getComplemento() {
		return complemento;
	}
	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	public Estado getEstado() {
		return estado;
	}
	public void setEstado(Estado estado) {
		this.estado = estado;
	}
	public String getDdd() {
		return ddd;
	}
	public void setDdd(String ddd) {
		this.ddd = ddd;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getChave() {
		return chave;
	}
	public void setChave(String chave) {
		this.chave = chave;
	}
	public String getMunicipio() {
		return municipio;
	}
	public void setMunicipio(String municipio) {
		this.municipio = municipio;
	}
	@Override
	public String toString() {
		return getNome();
	}
}
