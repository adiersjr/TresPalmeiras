package br.com.xkinfo.model;

public class MunicipioIbge {
	
	private int id;
	private String situacao;
	private String nome;
	private String observacao;
	private char amazonia;
	private char fronteira;
	private char capital;
	private Estado estado;
	private String anoInstalacao;
	private String anoExtincao;
	private String sucessor;
	private Float latitude;
	private Float longitude;
	private Float altitude;
	private Float area;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getSituacao() {
		return situacao;
	}
	public void setSituacao(String situacao) {
		this.situacao = situacao;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getObservacao() {
		return observacao;
	}
	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}
	public char getAmazonia() {
		return amazonia;
	}
	public void setAmazonia(char amazonia) {
		this.amazonia = amazonia;
	}
	public char getFronteira() {
		return fronteira;
	}
	public void setFronteira(char fronteira) {
		this.fronteira = fronteira;
	}
	public char getCapital() {
		return capital;
	}
	public void setCapital(char capital) {
		this.capital = capital;
	}
	public Estado getEstado() {
		return estado;
	}
	public void setEstado(Estado estado) {
		this.estado = estado;
	}
	public String getAnoInstalacao() {
		return anoInstalacao;
	}
	public void setAnoInstalacao(String anoInstalacao) {
		this.anoInstalacao = anoInstalacao;
	}
	public String getAnoExtincao() {
		return anoExtincao;
	}
	public void setAnoExtincao(String anoExtincao) {
		this.anoExtincao = anoExtincao;
	}
	public String getSucessor() {
		return sucessor;
	}
	public void setSucessor(String sucessor) {
		this.sucessor = sucessor;
	}
	public Float getLatitude() {
		return latitude;
	}
	public void setLatitude(Float latitude) {
		this.latitude = latitude;
	}
	public Float getLongitude() {
		return longitude;
	}
	public void setLongitude(Float longitude) {
		this.longitude = longitude;
	}
	public Float getAltitude() {
		return altitude;
	}
	public void setAltitude(Float altitude) {
		this.altitude = altitude;
	}
	public Float getArea() {
		return area;
	}
	public void setArea(Float area) {
		this.area = area;
	}
}
