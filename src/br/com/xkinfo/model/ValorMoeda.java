package br.com.xkinfo.model;

import java.util.Calendar;

public class ValorMoeda {

	private int id;
	private String moedaData;
	private Moeda moeda;
	private Calendar dia;
	private Double valor;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getMoedaData() {
		return moedaData;
	}
	public void setMoedaData(String moedaData) {
		this.moedaData = moedaData;
	}
	public Moeda getMoeda() {
		return moeda;
	}
	public void setMoeda(Moeda moeda) {
		this.moeda = moeda;
	}
	public Calendar getDia() {
		return dia;
	}
	public void setDia(Calendar dia) {
		this.dia = dia;
	}
	public Double getValor() {
		return valor;
	}
	public void setValor(Double valor) {
		this.valor = valor;
	}
}
