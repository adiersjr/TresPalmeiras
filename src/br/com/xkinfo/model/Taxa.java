package br.com.xkinfo.model;

import br.com.xkinfo.cadastro.model.SituacaoCadastro;

public class Taxa {

	private int id;
	private int numero;
	private String descricao;
	private String sinal;
	private String listaOs;
	private String fiscal;
	private String icms;
	private String taxado;
	private String mostraOs;
	private String reclama;
	private int prioridade;
	private Double valor1;
	private Double valor2;
	private Double valor3;
	private Double valor4;
	private String extenso;
	private String extenso1;
	private String extenso2;
	private String extenso3;
	private String contribuicao;
	private SituacaoCadastro situacaoCadastro;
	private boolean imprimir;
	private String observacao;
	private String unidade;
	private String classeSped;
	private boolean codigo;
	private int parcelas;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getSinal() {
		return sinal;
	}
	public void setSinal(String sinal) {
		this.sinal = sinal;
	}
	public String getListaOs() {
		return listaOs;
	}
	public void setListaOs(String listaOs) {
		this.listaOs = listaOs;
	}
	public String getFiscal() {
		return fiscal;
	}
	public void setFiscal(String fiscal) {
		this.fiscal = fiscal;
	}
	public String getIcms() {
		return icms;
	}
	public void setIcms(String icms) {
		this.icms = icms;
	}
	public String getTaxado() {
		return taxado;
	}
	public void setTaxado(String taxado) {
		this.taxado = taxado;
	}
	public String getMostraOs() {
		return mostraOs;
	}
	public void setMostraOs(String mostraOs) {
		this.mostraOs = mostraOs;
	}
	public String getReclama() {
		return reclama;
	}
	public void setReclama(String reclama) {
		this.reclama = reclama;
	}
	public int getPrioridade() {
		return prioridade;
	}
	public void setPrioridade(int prioridade) {
		this.prioridade = prioridade;
	}
	public Double getValor1() {
		return valor1;
	}
	public void setValor1(Double valor1) {
		this.valor1 = valor1;
	}
	public Double getValor2() {
		return valor2;
	}
	public void setValor2(Double valor2) {
		this.valor2 = valor2;
	}
	public Double getValor3() {
		return valor3;
	}
	public void setValor3(Double valor3) {
		this.valor3 = valor3;
	}
	public Double getValor4() {
		return valor4;
	}
	public void setValor4(Double valor4) {
		this.valor4 = valor4;
	}
	public String getExtenso() {
		return extenso;
	}
	public void setExtenso(String extenso) {
		this.extenso = extenso;
	}
	public String getExtenso1() {
		return extenso1;
	}
	public void setExtenso1(String extenso1) {
		this.extenso1 = extenso1;
	}
	public String getExtenso2() {
		return extenso2;
	}
	public void setExtenso2(String extenso2) {
		this.extenso2 = extenso2;
	}
	public String getExtenso3() {
		return extenso3;
	}
	public void setExtenso3(String extenso3) {
		this.extenso3 = extenso3;
	}
	public String getContribuicao() {
		return contribuicao;
	}
	public void setContribuicao(String contribuicao) {
		this.contribuicao = contribuicao;
	}
	public SituacaoCadastro getSituacaoCadastro() {
		return situacaoCadastro;
	}
	public void setSituacaoCadastro(SituacaoCadastro situacaoCadastro) {
		this.situacaoCadastro = situacaoCadastro;
	}
	public boolean isImprimir() {
		return imprimir;
	}
	public void setImprimir(boolean imprimir) {
		this.imprimir = imprimir;
	}
	public String getObservacao() {
		return observacao;
	}
	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}
	public String getUnidade() {
		return unidade;
	}
	public void setUnidade(String unidade) {
		this.unidade = unidade;
	}
	public String getClasseSped() {
		return classeSped;
	}
	public void setClasseSped(String classeSped) {
		this.classeSped = classeSped;
	}
	public boolean isCodigo() {
		return codigo;
	}
	public void setCodigo(boolean codigo) {
		this.codigo = codigo;
	}
	public int getParcelas() {
		return parcelas;
	}
	public void setParcelas(int parcelas) {
		this.parcelas = parcelas;
	}
}
