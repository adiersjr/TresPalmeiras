package br.com.xkinfo.arrecadacao.model;

import br.com.xkinfo.model.Bairro;
import br.com.xkinfo.pessoa.model.Estado;
import br.com.xkinfo.pessoa.model.Municipio;

public class Agencia {

	private int id;
	private Banco banco;
	private int numero;
	private String nome;
	private String convenioF;
	private String convenioG;
	private int nsr;
	private String digito;
	private String endereco;
	private String complemento;
	private Bairro bairro;
	private String cep;
	private Municipio municipio;
	private Estado estado;
	private String ddd;
	private String telefone;
	
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
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
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
	public String getDigito() {
		return digito;
	}
	public void setDigito(String digito) {
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
	public Bairro getBairro() {
		return bairro;
	}
	public void setBairro(Bairro bairro) {
		this.bairro = bairro;
	}
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	public Municipio getMunicipio() {
		return municipio;
	}
	public void setMunicipio(Municipio municipio) {
		this.municipio = municipio;
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
}
