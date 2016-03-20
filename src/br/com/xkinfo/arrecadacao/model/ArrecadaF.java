package br.com.xkinfo.arrecadacao.model;

import java.util.Calendar;

import br.com.xkinfo.cadastro.model.Cadastro;

public class ArrecadaF {
	private Retorno retorno;
	private String fatura;
	private Cadastro cadastro;
	private Banco banco;
	private Agencia agencia;
	private String contaCorrrente;
	private Calendar dataVencimento;
	private Calendar dataCredito;
	private Double valorFatura;
	private String codigoBarras;
	private int codigoMovimentacao;
	private int nsr;
	private Calendar dataPagamento;
	public Retorno getRetorno() {
		return retorno;
	}
	public void setRetorno(Retorno retorno) {
		this.retorno = retorno;
	}
	public String getFatura() {
		return fatura;
	}
	public void setFatura(String fatura) {
		this.fatura = fatura;
	}
	public Cadastro getCadastro() {
		return cadastro;
	}
	public void setCadastro(Cadastro cadastro) {
		this.cadastro = cadastro;
	}
	public Banco getBanco() {
		return banco;
	}
	public void setBanco(Banco banco) {
		this.banco = banco;
	}
	public Agencia getAgencia() {
		return agencia;
	}
	public void setAgencia(Agencia agencia) {
		this.agencia = agencia;
	}
	public String getContaCorrrente() {
		return contaCorrrente;
	}
	public void setContaCorrrente(String contaCorrrente) {
		this.contaCorrrente = contaCorrrente;
	}
	public Calendar getDataVencimento() {
		return dataVencimento;
	}
	public void setDataVencimento(Calendar dataVencimento) {
		this.dataVencimento = dataVencimento;
	}
	public Calendar getDataCredito() {
		return dataCredito;
	}
	public void setDataCredito(Calendar dataCredito) {
		this.dataCredito = dataCredito;
	}
	public Double getValorFatura() {
		return valorFatura;
	}
	public void setValorFatura(Double valorFatura) {
		this.valorFatura = valorFatura;
	}
	public String getCodigoBarras() {
		return codigoBarras;
	}
	public void setCodigoBarras(String codigoBarras) {
		this.codigoBarras = codigoBarras;
	}
	public int getCodigoMovimentacao() {
		return codigoMovimentacao;
	}
	public void setCodigoMovimentacao(int codigoMovimentacao) {
		this.codigoMovimentacao = codigoMovimentacao;
	}
	public int getNsr() {
		return nsr;
	}
	public void setNsr(int nsr) {
		this.nsr = nsr;
	}
	public Calendar getDataPagamento() {
		return dataPagamento;
	}
	public void setDataPagamento(Calendar dataPagamento) {
		this.dataPagamento = dataPagamento;
	}
	
}
