package br.com.xkinfo.model;

public class Banco {

	private int id;
	private int numero;
	private String telefone;
	private String nome;
	private String iniciais;
	private String convenio;
	private Double tarifaF;
	private String ccCredito;
	private String convenioG;
	private Double tarigaG;
	private int nsr;
	private int diasG;
	private int diasF;
	private boolean debito;
	
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
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getIniciais() {
		return iniciais;
	}
	public void setIniciais(String iniciais) {
		this.iniciais = iniciais;
	}
	public String getConvenio() {
		return convenio;
	}
	public void setConvenio(String convenio) {
		this.convenio = convenio;
	}
	public Double getTarifaF() {
		return tarifaF;
	}
	public void setTarifaF(Double tarifaF) {
		this.tarifaF = tarifaF;
	}
	public String getCcCredito() {
		return ccCredito;
	}
	public void setCcCredito(String ccCredito) {
		this.ccCredito = ccCredito;
	}
	public String getConvenioG() {
		return convenioG;
	}
	public void setConvenioG(String convenioG) {
		this.convenioG = convenioG;
	}
	public Double getTarigaG() {
		return tarigaG;
	}
	public void setTarigaG(Double tarigaG) {
		this.tarigaG = tarigaG;
	}
	public int getNsr() {
		return nsr;
	}
	public void setNsr(int nsr) {
		this.nsr = nsr;
	}
	public int getDiasG() {
		return diasG;
	}
	public void setDiasG(int diasG) {
		this.diasG = diasG;
	}
	public int getDiasF() {
		return diasF;
	}
	public void setDiasF(int diasF) {
		this.diasF = diasF;
	}
	public boolean isDebito() {
		return debito;
	}
	public void setDebito(boolean debito) {
		this.debito = debito;
	}
}
