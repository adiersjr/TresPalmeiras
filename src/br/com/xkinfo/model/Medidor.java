package br.com.xkinfo.model;

import java.util.Calendar;

public class Medidor {

	private int id;
	private String ide;
	private Marca marca;
	private String numeroFabrica;
	private int hz;
	private String tipo;
	private String modelo;
	private int elemento;
	private int fios;
	private String rr;
	private int volts;
	private String amperes;
	private String kd;
	private int fmKwh;
	private int fmKw;
	private int notaFiscal;
	private Calendar dataNotaFiscal;
	private int numero;
	private Calendar dataImobilizado;
	private int anoFabricacao;
	private String tipoMedidor;
	private String usuario;
	private Calendar dataProcessamento;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getIde() {
		return ide;
	}
	public void setIde(String ide) {
		this.ide = ide;
	}
	public Marca getMarca() {
		return marca;
	}
	public void setMarca(Marca marca) {
		this.marca = marca;
	}
	public String getNumeroFabrica() {
		return numeroFabrica;
	}
	public void setNumeroFabrica(String numeroFabrica) {
		this.numeroFabrica = numeroFabrica;
	}
	public int getHz() {
		return hz;
	}
	public void setHz(int hz) {
		this.hz = hz;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public int getElemento() {
		return elemento;
	}
	public void setElemento(int elemento) {
		this.elemento = elemento;
	}
	public int getFios() {
		return fios;
	}
	public void setFios(int fios) {
		this.fios = fios;
	}
	public String getRr() {
		return rr;
	}
	public void setRr(String rr) {
		this.rr = rr;
	}
	public int getVolts() {
		return volts;
	}
	public void setVolts(int volts) {
		this.volts = volts;
	}
	public String getAmperes() {
		return amperes;
	}
	public void setAmperes(String amperes) {
		this.amperes = amperes;
	}
	public String getKd() {
		return kd;
	}
	public void setKd(String kd) {
		this.kd = kd;
	}
	public int getFmKwh() {
		return fmKwh;
	}
	public void setFmKwh(int fmKwh) {
		this.fmKwh = fmKwh;
	}
	public int getFmKw() {
		return fmKw;
	}
	public void setFmKw(int fmKw) {
		this.fmKw = fmKw;
	}
	public int getNotaFiscal() {
		return notaFiscal;
	}
	public void setNotaFiscal(int notaFiscal) {
		this.notaFiscal = notaFiscal;
	}
	public Calendar getDataNotaFiscal() {
		return dataNotaFiscal;
	}
	public void setDataNotaFiscal(Calendar dataNotaFiscal) {
		this.dataNotaFiscal = dataNotaFiscal;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public Calendar getDataImobilizado() {
		return dataImobilizado;
	}
	public void setDataImobilizado(Calendar dataImobilizado) {
		this.dataImobilizado = dataImobilizado;
	}
	public int getAnoFabricacao() {
		return anoFabricacao;
	}
	public void setAnoFabricacao(int anoFabricacao) {
		this.anoFabricacao = anoFabricacao;
	}
	public String getTipoMedidor() {
		return tipoMedidor;
	}
	public void setTipoMedidor(String tipoMedidor) {
		this.tipoMedidor = tipoMedidor;
	}
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public Calendar getDataProcessamento() {
		return dataProcessamento;
	}
	public void setDataProcessamento(Calendar dataProcessamento) {
		this.dataProcessamento = dataProcessamento;
	}
}
