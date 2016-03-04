package br.com.xkinfo.model;

import java.util.Calendar;

import br.com.xkinfo.pessoa.model.Estado;
import br.com.xkinfo.pessoa.model.Municipio;

public class Proprietario {

	private int id;
	private String nome;
	private String cnpjCpf;
	private String telefone;
	private Municipio municipio;
	private String endereco;
	private String obs;
	private String complemento;
	private Bairro bairro;
	private String cep;
	private String obs1;
	private Calendar dataProcessamento;
	private Estado estado;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCnpjCpf() {
		return cnpjCpf;
	}
	public void setCnpjCpf(String cnpjCpf) {
		this.cnpjCpf = cnpjCpf;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public Municipio getMunicipio() {
		return municipio;
	}
	public void setMunicipio(Municipio municipio) {
		this.municipio = municipio;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getObs() {
		return obs;
	}
	public void setObs(String obs) {
		this.obs = obs;
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
	public String getObs1() {
		return obs1;
	}
	public void setObs1(String obs1) {
		this.obs1 = obs1;
	}
	public Calendar getDataProcessamento() {
		return dataProcessamento;
	}
	public void setDataProcessamento(Calendar dataProcessamento) {
		this.dataProcessamento = dataProcessamento;
	}
	public Estado getEstado() {
		return estado;
	}
	public void setEstado(Estado estado) {
		this.estado = estado;
	}
}
