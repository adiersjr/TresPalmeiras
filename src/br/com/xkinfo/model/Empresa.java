<<<<<<< Updated upstream
package br.com.xkinfo.model;

import java.util.Calendar;

import br.com.xkinfo.pessoa.model.Estado;
import br.com.xkinfo.pessoa.model.Municipio;

public class Empresa {

	private int id;
	private String razaoSocial;
	private String nomeFantasia;
	private Calendar dataImplantacao;
	private String inscricaoEstadual;
	private String cnpj;
	private String numeroJuntaComercial;
	private Calendar dataJuntaComercial;
	private String telefone;
	private String rua;
	private String numeroImovel;
	private Bairro bairro;
	private Estado estado;
	private Municipio municipio;
	private String responsavel;
	private String cargoResponsavel;
	private String cpfResponsavel;
	private String contador;
	private String cpfContador;
	private String crc;
	private String logo;  // no banco grava blob
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getRazaoSocial() {
		return razaoSocial;
	}
	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}
	public String getNomeFantasia() {
		return nomeFantasia;
	}
	public void setNomeFantasia(String nomeFantasia) {
		this.nomeFantasia = nomeFantasia;
	}
	public Calendar getDataImplantacao() {
		return dataImplantacao;
	}
	public void setDataImplantacao(Calendar dataImplantacao) {
		this.dataImplantacao = dataImplantacao;
	}
	public String getInscricaoEstadual() {
		return inscricaoEstadual;
	}
	public void setInscricaoEstadual(String inscricaoEstadual) {
		this.inscricaoEstadual = inscricaoEstadual;
	}
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	public String getNumeroJuntaComercial() {
		return numeroJuntaComercial;
	}
	public void setNumeroJuntaComercial(String numeroJuntaComercial) {
		this.numeroJuntaComercial = numeroJuntaComercial;
	}
	public Calendar getDataJuntaComercial() {
		return dataJuntaComercial;
	}
	public void setDataJuntaComercial(Calendar dataJuntaComercial) {
		this.dataJuntaComercial = dataJuntaComercial;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getRua() {
		return rua;
	}
	public void setRua(String rua) {
		this.rua = rua;
	}
	public String getNumeroImovel() {
		return numeroImovel;
	}
	public void setNumeroImovel(String numeroImovel) {
		this.numeroImovel = numeroImovel;
	}
	public Bairro getBairro() {
		return bairro;
	}
	public void setBairro(Bairro bairro) {
		this.bairro = bairro;
	}
	public Estado getEstado() {
		return estado;
	}
	public void setEstado(Estado estado) {
		this.estado = estado;
	}
	public Municipio getMunicipio() {
		return municipio;
	}
	public void setMunicipio(Municipio municipio) {
		this.municipio = municipio;
	}
	public String getResponsavel() {
		return responsavel;
	}
	public void setResponsavel(String responsavel) {
		this.responsavel = responsavel;
	}
	public String getCargoResponsavel() {
		return cargoResponsavel;
	}
	public void setCargoResponsavel(String cargoResponsavel) {
		this.cargoResponsavel = cargoResponsavel;
	}
	public String getCpfResponsavel() {
		return cpfResponsavel;
	}
	public void setCpfResponsavel(String cpfResponsavel) {
		this.cpfResponsavel = cpfResponsavel;
	}
	public String getContador() {
		return contador;
	}
	public void setContador(String contador) {
		this.contador = contador;
	}
	public String getCpfContador() {
		return cpfContador;
	}
	public void setCpfContador(String cpfContador) {
		this.cpfContador = cpfContador;
	}
	public String getCrc() {
		return crc;
	}
	public void setCrc(String crc) {
		this.crc = crc;
	}
	public String getLogo() {
		return logo;
	}
	public void setLogo(String logo) {
		this.logo = logo;
	}
}	
=======
package br.com.xkinfo.model;

import java.util.Calendar;

public class Empresa {

	private int id;
	private String razaoSocial;
	private String nomeFantasia;
	private Calendar dataImplantacao;
	private String inscricaoEstadual;
	private String cnpj;
	private String numeroJuntaComercial;
	private Calendar dataJuntaComercial;
	private String telefone;
	private String rua;
	private String numeroImovel;
	private String bairro;
	private Estado estado;
	private String municipio;
	private String responsavel;
	private String cargoResponsavel;
	private String cpfResponsavel;
	private String contador;
	private String cpfContador;
	private String logo;  // no banco grava blob
}	
>>>>>>> Stashed changes
