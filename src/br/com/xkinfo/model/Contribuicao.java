package br.com.xkinfo.model;

import java.util.Calendar;

import br.com.xkinfo.cadastro.model.Cadastro;
import br.com.xkinfo.cadastro.model.Taxa;

public class Contribuicao {
	
	private int id;
	private Cadastro cadastro;
	private Double valor;
	private Calendar data;
	private Taxa taxa;
	
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
	public Double getValor() {
		return valor;
	}
	public void setValor(Double valor) {
		this.valor = valor;
	}
	public Calendar getData() {
		return data;
	}
	public void setData(Calendar data) {
		this.data = data;
	}
	public Taxa getTaxa() {
		return taxa;
	}
	public void setTaxa(Taxa taxa) {
		this.taxa = taxa;
	}
}
