package br.com.xkinfo.cadastro.model;

public class Classificacao {

	private int id;
	private String chave;
	private char tipo;
	private char atividade;
	private char tipoFornecedor;
	private char fase;
	private char iluminacaoPublica;
	private String tarifa;
	private String descricaoClasse;
	private String descricaoAtividade;
	private String descricaoTipoFornecedor;
	private String descricaoFase;
	private String descricaoIluminacao;
	private String descricaoTarifa;
	private int aliquota;
	private boolean desativado;
	private String tn;
	private String tn_inf;
	private String tn_sup;
	private String subgrupo;
	private boolean padrao;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getChave() {
		return chave;
	}
	public void setChave(String chave) {
		this.chave = chave;
	}
	public char getTipo() {
		return tipo;
	}
	public void setTipo(char tipo) {
		this.tipo = tipo;
	}
	public char getAtividade() {
		return atividade;
	}
	public void setAtividade(char atividade) {
		this.atividade = atividade;
	}
	public char getTipoFornecedor() {
		return tipoFornecedor;
	}
	public void setTipoFornecedor(char tipoFornecedor) {
		this.tipoFornecedor = tipoFornecedor;
	}
	public char getFase() {
		return fase;
	}
	public void setFase(char fase) {
		this.fase = fase;
	}
	public char getIluminacaoPublica() {
		return iluminacaoPublica;
	}
	public void setIluminacaoPublica(char iluminacaoPublica) {
		this.iluminacaoPublica = iluminacaoPublica;
	}
	public String getTarifa() {
		return tarifa;
	}
	public void setTarifa(String tarifa) {
		this.tarifa = tarifa;
	}
	public String getDescricaoClasse() {
		return descricaoClasse;
	}
	public void setDescricaoClasse(String descricaoClasse) {
		this.descricaoClasse = descricaoClasse;
	}
	public String getDescricaoAtividade() {
		return descricaoAtividade;
	}
	public void setDescricaoAtividade(String descricaoAtividade) {
		this.descricaoAtividade = descricaoAtividade;
	}
	public String getDescricaoTipoFornecedor() {
		return descricaoTipoFornecedor;
	}
	public void setDescricaoTipoFornecedor(String descricaoTipoFornecedor) {
		this.descricaoTipoFornecedor = descricaoTipoFornecedor;
	}
	public String getDescricaoFase() {
		return descricaoFase;
	}
	public void setDescricaoFase(String descricaoFase) {
		this.descricaoFase = descricaoFase;
	}
	public String getDescricaoIluminacao() {
		return descricaoIluminacao;
	}
	public void setDescricaoIluminacao(String descricaoIluminacao) {
		this.descricaoIluminacao = descricaoIluminacao;
	}
	public String getDescricaoTarifa() {
		return descricaoTarifa;
	}
	public void setDescricaoTarifa(String descricaoTarifa) {
		this.descricaoTarifa = descricaoTarifa;
	}
	public int getAliquota() {
		return aliquota;
	}
	public void setAliquota(int aliquota) {
		this.aliquota = aliquota;
	}
	public boolean isDesativado() {
		return desativado;
	}
	public void setDesativado(boolean desativado) {
		this.desativado = desativado;
	}
	public String getTn() {
		return tn;
	}
	public void setTn(String tn) {
		this.tn = tn;
	}
	public String getTn_inf() {
		return tn_inf;
	}
	public void setTn_inf(String tn_inf) {
		this.tn_inf = tn_inf;
	}
	public String getTn_sup() {
		return tn_sup;
	}
	public void setTn_sup(String tn_sup) {
		this.tn_sup = tn_sup;
	}
	public String getSubgrupo() {
		return subgrupo;
	}
	public void setSubgrupo(String subgrupo) {
		this.subgrupo = subgrupo;
	}
	public boolean isPadrao() {
		return padrao;
	}
	public void setPadraop(boolean padrao) {
		this.padrao = padrao;
	}
}
