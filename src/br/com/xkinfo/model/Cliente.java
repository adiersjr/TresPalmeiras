package br.com.xkinfo.model;

import java.util.Calendar;

public class Cliente {
	private int id;
	private MunicipioIbge municipioIbge;
	private Estado estado;
	private Pais pais;
	private TipoDocumento tipoDocumento;
	private String cadastro;
	private String nome;
	private String cnpjCpf;
	private String documento;
	private String orgaoExpedidor;
	private Estado ufExpedidor;
	private String tituloEleitor;
	private Calendar dataNascimento;
	private String fone;
	private int ramal;
	private String foneComercial;
	private int ramalComercial;
	private String foneCelular;
	private String email;
	private String senha;
	private char sexo;
	private String nomePai;
	private String nomeMae;
	private String contato;
	private String nis;
	private Calendar dataEmissaoNis;
	private boolean aprovacaoNis;
	private Calendar dataProcessamento;
	private boolean pessoaJuridica;
	private Calendar dataCadastro;
	private Calendar dataAutoDeclaracao;
	private Calendar dataProc;
	private String usuario;
	private Calendar dataEnvioScs;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public MunicipioIbge getMunicipioIbge() {
		return municipioIbge;
	}
	public void setMunicipioIbge(MunicipioIbge municipioIbge) {
		this.municipioIbge = municipioIbge;
	}
	public Estado getEstado() {
		return estado;
	}
	public void setEstado(Estado estado) {
		this.estado = estado;
	}
	public Pais getPais() {
		return pais;
	}
	public void setPais(Pais pais) {
		this.pais = pais;
	}
	public TipoDocumento getTipoDocumento() {
		return tipoDocumento;
	}
	public void setTipoDocumento(TipoDocumento tipoDocumento) {
		this.tipoDocumento = tipoDocumento;
	}
	public String getCadastro() {
		return cadastro;
	}
	public void setCadastro(String cadastro) {
		this.cadastro = cadastro;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCnpjCpf() {
		return cnpjCpf;
	}
	public void setCnpjCpf(String cnpjCpf) {
		this.cnpjCpf = cnpjCpf;
	}
	public String getDocumento() {
		return documento;
	}
	public void setDocumento(String documento) {
		this.documento = documento;
	}
	public String getOrgaoExpedidor() {
		return orgaoExpedidor;
	}
	public void setOrgaoExpedidor(String orgaoExpedidor) {
		this.orgaoExpedidor = orgaoExpedidor;
	}
	public Estado getUfExpedidor() {
		return ufExpedidor;
	}
	public void setUfExpedidor(Estado ufExpedidor) {
		this.ufExpedidor = ufExpedidor;
	}
	public String getTituloEleitor() {
		return tituloEleitor;
	}
	public void setTituloEleitor(String tituloEleitor) {
		this.tituloEleitor = tituloEleitor;
	}
	public Calendar getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(Calendar dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public String getFone() {
		return fone;
	}
	public void setFone(String fone) {
		this.fone = fone;
	}
	public int getRamal() {
		return ramal;
	}
	public void setRamal(int ramal) {
		this.ramal = ramal;
	}
	public String getFoneComercial() {
		return foneComercial;
	}
	public void setFoneComercial(String foneComercial) {
		this.foneComercial = foneComercial;
	}
	public int getRamalComercial() {
		return ramalComercial;
	}
	public void setRamalComercial(int ramalComercial) {
		this.ramalComercial = ramalComercial;
	}
	public String getFoneCelular() {
		return foneCelular;
	}
	public void setFoneCelular(String foneCelular) {
		this.foneCelular = foneCelular;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public char getSexo() {
		return sexo;
	}
	public void setSexo(char sexo) {
		this.sexo = sexo;
	}
	public String getNomePai() {
		return nomePai;
	}
	public void setNomePai(String nomePai) {
		this.nomePai = nomePai;
	}
	public String getNomeMae() {
		return nomeMae;
	}
	public void setNomeMae(String nomeMae) {
		this.nomeMae = nomeMae;
	}
	public String getContato() {
		return contato;
	}
	public void setContato(String contato) {
		this.contato = contato;
	}
	public String getNis() {
		return nis;
	}
	public void setNis(String nis) {
		this.nis = nis;
	}
	public Calendar getDataEmissaoNis() {
		return dataEmissaoNis;
	}
	public void setDataEmissaoNis(Calendar dataEmissaoNis) {
		this.dataEmissaoNis = dataEmissaoNis;
	}
	public boolean isAprovacaoNis() {
		return aprovacaoNis;
	}
	public void setAprovacaoNis(boolean aprovacaoNis) {
		this.aprovacaoNis = aprovacaoNis;
	}
	public Calendar getDataProcessamento() {
		return dataProcessamento;
	}
	public void setDataProcessamento(Calendar dataProcessamento) {
		this.dataProcessamento = dataProcessamento;
	}
	public boolean isPessoaJuridica() {
		return pessoaJuridica;
	}
	public void setPessoaJuridica(boolean pessoaJuridica) {
		this.pessoaJuridica = pessoaJuridica;
	}
	public Calendar getDataCadastro() {
		return dataCadastro;
	}
	public void setDataCadastro(Calendar dataCadastro) {
		this.dataCadastro = dataCadastro;
	}
	public Calendar getDataAutoDeclaracao() {
		return dataAutoDeclaracao;
	}
	public void setDataAutoDeclaracao(Calendar dataAutoDeclaracao) {
		this.dataAutoDeclaracao = dataAutoDeclaracao;
	}
	public Calendar getDataProc() {
		return dataProc;
	}
	public void setDataProc(Calendar dataProc) {
		this.dataProc = dataProc;
	}
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public Calendar getDataEnvioScs() {
		return dataEnvioScs;
	}
	public void setDataEnvioScs(Calendar dataEnvioScs) {
		this.dataEnvioScs = dataEnvioScs;
	}
	public String getTipoCliente() {
		return tipoCliente;
	}
	public void setTipoCliente(String tipoCliente) {
		this.tipoCliente = tipoCliente;
	}
	private String tipoCliente;
}
