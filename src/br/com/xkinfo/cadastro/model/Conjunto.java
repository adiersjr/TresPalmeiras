package br.com.xkinfo.cadastro.model;

public class Conjunto {
	
	private String numero;
	private String descricao;
	private Double metaDic;
	private Double metaFic;
	private Double metaDec;
	private Double metaFec;
	private String localAtinge;
	private boolean ativo;
	
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public Double getMetaDic() {
		return metaDic;
	}
	public void setMetaDic(Double metaDic) {
		this.metaDic = metaDic;
	}
	public Double getMetaFic() {
		return metaFic;
	}
	public void setMetaFic(Double metaFic) {
		this.metaFic = metaFic;
	}
	public Double getMetaDec() {
		return metaDec;
	}
	public void setMetaDec(Double metaDec) {
		this.metaDec = metaDec;
	}
	public Double getMetaFec() {
		return metaFec;
	}
	public void setMetaFec(Double metaFec) {
		this.metaFec = metaFec;
	}
	public String getLocalAtinge() {
		return localAtinge;
	}
	public void setLocalAtinge(String localAtinge) {
		this.localAtinge = localAtinge;
	}
	public boolean isAtivo() {
		return ativo;
	}
	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}
}
