package br.com.xkinfo.arrecadacao.model;

import java.util.Calendar;

public class ArrecadaG {
	private int id;
	private String codigoBarras;
	private Retorno retorno;
	private Banco banco;
	private Agencia agencia;
	private Calendar dataPagamento;
	private Calendar dataCredito;
	private Double valorFatura;
	private Double valorTarifa;
	private int nsr;
	private String codigoArrecadador;
	private String formaArrecadacao;
	private String reservado;
	private Double valorDiferenca;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCodigoBarras() {
		return codigoBarras;
	}
	public void setCodigoBarras(String codigoBarras) {
		this.codigoBarras = codigoBarras;
	}
	public Retorno getRetorno() {
		return retorno;
	}
	public void setRetorno(Retorno retorno) {
		this.retorno = retorno;
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
	public Calendar getDataPagamento() {
		return dataPagamento;
	}
	public void setDataPagamento(Calendar dataPagamento) {
		this.dataPagamento = dataPagamento;
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
	public Double getValorTarifa() {
		return valorTarifa;
	}
	public void setValorTarifa(Double valorTarifa) {
		this.valorTarifa = valorTarifa;
	}
	public int getNsr() {
		return nsr;
	}
	public void setNsr(int nsr) {
		this.nsr = nsr;
	}
	public String getCodigoArrecadador() {
		return codigoArrecadador;
	}
	public void setCodigoArrecadador(String codigoArrecadador) {
		this.codigoArrecadador = codigoArrecadador;
	}
	public String getFormaArrecadacao() {
		return formaArrecadacao;
	}
	public void setFormaArrecadacao(String formaArrecadacao) {
		this.formaArrecadacao = formaArrecadacao;
	}
	public String getReservado() {
		return reservado;
	}
	public void setReservado(String reservado) {
		this.reservado = reservado;
	}
	public Double getValorDiferenca() {
		return valorDiferenca;
	}
	public void setValorDiferenca(Double valorDiferenca) {
		this.valorDiferenca = valorDiferenca;
	}
	
}
