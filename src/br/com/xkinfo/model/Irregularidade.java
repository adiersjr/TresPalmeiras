package br.com.xkinfo.model;

public class Irregularidade {

	private int id;
	private String descricao;
	private String ordem;
	private String notifica;
	private String os;
	private String media;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getOrdem() {
		return ordem;
	}
	public void setOrdem(String ordem) {
		this.ordem = ordem;
	}
	public String getNotifica() {
		return notifica;
	}
	public void setNotifica(String notifica) {
		this.notifica = notifica;
	}
	public String getOs() {
		return os;
	}
	public void setOs(String os) {
		this.os = os;
	}
	public String getMedia() {
		return media;
	}
	public void setMedia(String media) {
		this.media = media;
	}
}
