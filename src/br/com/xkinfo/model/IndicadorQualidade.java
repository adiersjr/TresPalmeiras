package br.com.xkinfo.model;

public class IndicadorQualidade {

	private int id;
	private Eta	eta;
	private String faturaRealizado;
	private String dataFatura;
	private Double turbidez;
	private Double fluor;
	private Double cloroResidual;
	private Double coliformes;
	private String vmpaTurbidez;
	private String vmpaFluor;
	private String vmpaCloro;
	private String vmpaColiforme;
	private Double ph;
	private Double cor;
	private String coliformeTotal;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Eta getEta() {
		return eta;
	}
	public void setEta(Eta eta) {
		this.eta = eta;
	}
	public String getFaturaRealizado() {
		return faturaRealizado;
	}
	public void setFaturaRealizado(String faturaRealizado) {
		this.faturaRealizado = faturaRealizado;
	}
	public String getDataFatura() {
		return dataFatura;
	}
	public void setDataFatura(String dataFatura) {
		this.dataFatura = dataFatura;
	}
	public Double getTurbidez() {
		return turbidez;
	}
	public void setTurbidez(Double turbidez) {
		this.turbidez = turbidez;
	}
	public Double getFluor() {
		return fluor;
	}
	public void setFluor(Double fluor) {
		this.fluor = fluor;
	}
	public Double getCloroResidual() {
		return cloroResidual;
	}
	public void setCloroResidual(Double cloroResidual) {
		this.cloroResidual = cloroResidual;
	}
	public Double getColiformes() {
		return coliformes;
	}
	public void setColiformes(Double coliformes) {
		this.coliformes = coliformes;
	}
	public String getVmpaTurbidez() {
		return vmpaTurbidez;
	}
	public void setVmpaTurbidez(String vmpaTurbidez) {
		this.vmpaTurbidez = vmpaTurbidez;
	}
	public String getVmpaFluor() {
		return vmpaFluor;
	}
	public void setVmpaFluor(String vmpaFluor) {
		this.vmpaFluor = vmpaFluor;
	}
	public String getVmpaCloro() {
		return vmpaCloro;
	}
	public void setVmpaCloro(String vmpaCloro) {
		this.vmpaCloro = vmpaCloro;
	}
	public String getVmpaColiforme() {
		return vmpaColiforme;
	}
	public void setVmpaColiforme(String vmpaColiforme) {
		this.vmpaColiforme = vmpaColiforme;
	}
	public Double getPh() {
		return ph;
	}
	public void setPh(Double ph) {
		this.ph = ph;
	}
	public Double getCor() {
		return cor;
	}
	public void setCor(Double cor) {
		this.cor = cor;
	}
	public String getColiformeTotal() {
		return coliformeTotal;
	}
	public void setColiformeTotal(String coliformeTotal) {
		this.coliformeTotal = coliformeTotal;
	}
}
