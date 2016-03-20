package br.com.xkinfo.arrecadacao.model;

import java.util.Calendar;

import br.com.xkinfo.cadastro.model.Cadastro;

public class ArrecadaB {
	private int id;
	private Cadastro cadastro;
	private Agencia agencia;
	private String contaCorrente;
	private Calendar dataAlteracao;
	private int nsr;
	private int codigoMovimentacao;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Cadastro getCadastro() {
		return cadastro;
	}
	public void setCadastro(Cadastro cadastro) {
		this.cadastro = cadastro;
	}
	public Agencia getAgencia() {
		return agencia;
	}
	public void setAgencia(Agencia agencia) {
		this.agencia = agencia;
	}
	public String getContaCorrente() {
		return contaCorrente;
	}
	public void setContaCorrente(String contaCorrente) {
		this.contaCorrente = contaCorrente;
	}
	public Calendar getDataAlteracao() {
		return dataAlteracao;
	}
	public void setDataAlteracao(Calendar dataAlteracao) {
		this.dataAlteracao = dataAlteracao;
	}
	public int getNsr() {
		return nsr;
	}
	public void setNsr(int nsr) {
		this.nsr = nsr;
	}
	public int getCodigoMovimentacao() {
		return codigoMovimentacao;
	}
	public void setCodigoMovimentacao(int codigoMovimentacao) {
		this.codigoMovimentacao = codigoMovimentacao;
	}
}
