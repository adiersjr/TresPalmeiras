package br.com.xkinfo.cadastro.model;

import java.util.Calendar;
import br.com.xkinfo.arrecadacao.model.Agencia;
import br.com.xkinfo.endereco.model.Bairro;
import br.com.xkinfo.endereco.model.Estado;
import br.com.xkinfo.endereco.model.Municipio;
import br.com.xkinfo.endereco.model.Pais;
import br.com.xkinfo.endereco.model.Rua;
import br.com.xkinfo.model.SituacaoCadastro;
import br.com.xkinfo.model.Vencimento;
import br.com.xkinfo.pessoa.model.Cliente;

public class Cadastro {

	private int id;
	private Proprietario proprietario;
	private Contribuicao contribuicao;
	private SituacaoCadastro situacaoCadastro;
	private Classificacao classificacao;
	private Agencia agencia;
	private Bairro bairro;
	private Rua rua;
	private Setor setor;
	private Atividade atividade;
	private String instal;
	private String casa;
	private String apto;
	private String contaBanco;
	private String medKwh;
	private String medKvar;
	private Double fMultKwh;
	private Double fMultKvar;
	private Double fatorPotencia;
	private Double leitura;
	private Double leituraDesligado;
	private Calendar dataLig;
	private Calendar dataDeslig;
	private Double roteiro;
	private String livro;
	private Double kwhContratado;
	private String vip;
	private String dv;
	private String retencao;
	private String isentaEct;
	private String lampada;
	private String localiz;
	private String comple;
	private String ramal;
	private Double metragem;
	private String digMed;
	private String voltagem;
	private String multa;
	private String desconto;
	private Double cargaInstalada;
	private Double leituraKvarKqh;
	private String obs;
	private Double disjuntor;
	private String lacreKwh;
	private String lacreKvarh;
	private String digMedKvarh;
	private String lacre1;
	private String lacre2;
	private String lacre3;
	private String consProx;
	private Double frente;
	private String tensao;
	private String tributos;
	private String faseRede;
	private String ie;
	private String orgaoExpedidor;
	private String outroDocumento;
	private String nome;
	private Calendar dataNascimento;
	private String foneResidencial;
	private String foneComercial;
	private String foneCelular;
	private String email;
	private String cpfCnpj;
	private String senha;
	private Vencimento vencimento;
	private int consumoExtra;
	private Calendar dataTroca;
	private String mensagem;
	private String br_Hxl;
	private String tipo;
	private String tensaoNominal;
	private int ram_Numero;
	private String alimentador;
	private int rota;
	private String diaVencimento;
	private String sexo;
	private String tituloEleitor;
	private Estado estado;
	private Municipio municipio;
	private Pais pais;
	private String ieAuxiliar;
	private int ramalRural;
	private int ramalComercial;
	private String nomePai;
	private String nomeMae;
	private String contato;
	private Calendar dataCadastro;
	private Cliente cliente;
	private Calendar dataUltimaVistoria;
	private Calendar dataInclusao;
	private Calendar dataEnvioScs;
	private int nreCoRes;
	private int nreCoCom;
	private int nreCoInd;
	private int nreCoPp;
	private String tarRes;
	private String tarCom;
	private String tarInd;
	private String tarPp;
	private String mesFat;
	private String anoFat;
	private String isentaLixo;
	private String lacrado;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Proprietario getProprietario() {
		return proprietario;
	}
	public void setProprietario(Proprietario proprietario) {
		this.proprietario = proprietario;
	}
	public Contribuicao getContribuicao() {
		return contribuicao;
	}
	public void setContribuicao(Contribuicao contribuicao) {
		this.contribuicao = contribuicao;
	}
	public SituacaoCadastro getSituacaoCadastro() {
		return situacaoCadastro;
	}
	public void setSituacaoCadastro(SituacaoCadastro situacaoCadastro) {
		this.situacaoCadastro = situacaoCadastro;
	}
	public Classificacao getClassificacao() {
		return classificacao;
	}
	public void setClassificacao(Classificacao classificacao) {
		this.classificacao = classificacao;
	}
	public Agencia getAgencia() {
		return agencia;
	}
	public void setAgencia(Agencia agencia) {
		this.agencia = agencia;
	}
	public Bairro getBairro() {
		return bairro;
	}
	public void setBairro(Bairro bairro) {
		this.bairro = bairro;
	}
	public Rua getRua() {
		return rua;
	}
	public void setRua(Rua rua) {
		this.rua = rua;
	}
	public Setor getSetor() {
		return setor;
	}
	public void setSetor(Setor setor) {
		this.setor = setor;
	}
	public Atividade getAtividade() {
		return atividade;
	}
	public void setAtividade(Atividade atividade) {
		this.atividade = atividade;
	}
	public String getInstal() {
		return instal;
	}
	public void setInstal(String instal) {
		this.instal = instal;
	}
	public String getCasa() {
		return casa;
	}
	public void setCasa(String casa) {
		this.casa = casa;
	}
	public String getApto() {
		return apto;
	}
	public void setApto(String apto) {
		this.apto = apto;
	}
	public String getContaBanco() {
		return contaBanco;
	}
	public void setContaBanco(String contaBanco) {
		this.contaBanco = contaBanco;
	}
	public String getMedKwh() {
		return medKwh;
	}
	public void setMedKwh(String medKwh) {
		this.medKwh = medKwh;
	}
	public String getMedKvar() {
		return medKvar;
	}
	public void setMedKvar(String medKvar) {
		this.medKvar = medKvar;
	}
	public Double getfMultKwh() {
		return fMultKwh;
	}
	public void setfMultKwh(Double fMultKwh) {
		this.fMultKwh = fMultKwh;
	}
	public Double getfMultKvar() {
		return fMultKvar;
	}
	public void setfMultKvar(Double fMultKvar) {
		this.fMultKvar = fMultKvar;
	}
	public Double getFatorPotencia() {
		return fatorPotencia;
	}
	public void setFatorPotencia(Double fatorPotencia) {
		this.fatorPotencia = fatorPotencia;
	}
	public Double getLeitura() {
		return leitura;
	}
	public void setLeitura(Double leitura) {
		this.leitura = leitura;
	}
	public Double getLeituraDesligado() {
		return leituraDesligado;
	}
	public void setLeituraDesligado(Double leituraDesligado) {
		this.leituraDesligado = leituraDesligado;
	}
	public Calendar getDataLig() {
		return dataLig;
	}
	public void setDataLig(Calendar dataLig) {
		this.dataLig = dataLig;
	}
	public Calendar getDataDeslig() {
		return dataDeslig;
	}
	public void setDataDeslig(Calendar dataDeslig) {
		this.dataDeslig = dataDeslig;
	}
	public Double getRoteiro() {
		return roteiro;
	}
	public void setRoteiro(Double roteiro) {
		this.roteiro = roteiro;
	}
	public String getLivro() {
		return livro;
	}
	public void setLivro(String livro) {
		this.livro = livro;
	}
	public Double getKwhContratado() {
		return kwhContratado;
	}
	public void setKwhContratado(Double kwhContratado) {
		this.kwhContratado = kwhContratado;
	}
	public String getVip() {
		return vip;
	}
	public void setVip(String vip) {
		this.vip = vip;
	}
	public String getDv() {
		return dv;
	}
	public void setDv(String dv) {
		this.dv = dv;
	}
	public String getRetencao() {
		return retencao;
	}
	public void setRetencao(String retencao) {
		this.retencao = retencao;
	}
	public String getIsentaEct() {
		return isentaEct;
	}
	public void setIsentaEct(String isentaEct) {
		this.isentaEct = isentaEct;
	}
	public String getLampada() {
		return lampada;
	}
	public void setLampada(String lampada) {
		this.lampada = lampada;
	}
	public String getLocaliz() {
		return localiz;
	}
	public void setLocaliz(String localiz) {
		this.localiz = localiz;
	}
	public String getComple() {
		return comple;
	}
	public void setComple(String comple) {
		this.comple = comple;
	}
	public String getRamal() {
		return ramal;
	}
	public void setRamal(String ramal) {
		this.ramal = ramal;
	}
	public Double getMetragem() {
		return metragem;
	}
	public void setMetragem(Double metragem) {
		this.metragem = metragem;
	}
	public String getDigMed() {
		return digMed;
	}
	public void setDigMed(String digMed) {
		this.digMed = digMed;
	}
	public String getVoltagem() {
		return voltagem;
	}
	public void setVoltagem(String voltagem) {
		this.voltagem = voltagem;
	}
	public String getMulta() {
		return multa;
	}
	public void setMulta(String multa) {
		this.multa = multa;
	}
	public String getDesconto() {
		return desconto;
	}
	public void setDesconto(String desconto) {
		this.desconto = desconto;
	}
	public Double getCargaInstalada() {
		return cargaInstalada;
	}
	public void setCargaInstalada(Double cargaInstalada) {
		this.cargaInstalada = cargaInstalada;
	}
	public Double getLeituraKvarKqh() {
		return leituraKvarKqh;
	}
	public void setLeituraKvarKqh(Double leituraKvarKqh) {
		this.leituraKvarKqh = leituraKvarKqh;
	}
	public String getObs() {
		return obs;
	}
	public void setObs(String obs) {
		this.obs = obs;
	}
	public Double getDisjuntor() {
		return disjuntor;
	}
	public void setDisjuntor(Double disjuntor) {
		this.disjuntor = disjuntor;
	}
	public String getLacreKwh() {
		return lacreKwh;
	}
	public void setLacreKwh(String lacreKwh) {
		this.lacreKwh = lacreKwh;
	}
	public String getLacreKvarh() {
		return lacreKvarh;
	}
	public void setLacreKvarh(String lacreKvarh) {
		this.lacreKvarh = lacreKvarh;
	}
	public String getDigMedKvarh() {
		return digMedKvarh;
	}
	public void setDigMedKvarh(String digMedKvarh) {
		this.digMedKvarh = digMedKvarh;
	}
	public String getLacre1() {
		return lacre1;
	}
	public void setLacre1(String lacre1) {
		this.lacre1 = lacre1;
	}
	public String getLacre2() {
		return lacre2;
	}
	public void setLacre2(String lacre2) {
		this.lacre2 = lacre2;
	}
	public String getLacre3() {
		return lacre3;
	}
	public void setLacre3(String lacre3) {
		this.lacre3 = lacre3;
	}
	public String getConsProx() {
		return consProx;
	}
	public void setConsProx(String consProx) {
		this.consProx = consProx;
	}
	public Double getFrente() {
		return frente;
	}
	public void setFrente(Double frente) {
		this.frente = frente;
	}
	public String getTensao() {
		return tensao;
	}
	public void setTensao(String tensao) {
		this.tensao = tensao;
	}
	public String getTributos() {
		return tributos;
	}
	public void setTributos(String tributos) {
		this.tributos = tributos;
	}
	public String getFaseRede() {
		return faseRede;
	}
	public void setFaseRede(String faseRede) {
		this.faseRede = faseRede;
	}
	public String getIe() {
		return ie;
	}
	public void setIe(String ie) {
		this.ie = ie;
	}
	public String getOrgaoExpedidor() {
		return orgaoExpedidor;
	}
	public void setOrgaoExpedidor(String orgaoExpedidor) {
		this.orgaoExpedidor = orgaoExpedidor;
	}
	public String getOutroDocumento() {
		return outroDocumento;
	}
	public void setOutroDocumento(String outroDocumento) {
		this.outroDocumento = outroDocumento;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Calendar getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(Calendar dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public String getFoneResidencial() {
		return foneResidencial;
	}
	public void setFoneResidencial(String foneResidencial) {
		this.foneResidencial = foneResidencial;
	}
	public String getFoneComercial() {
		return foneComercial;
	}
	public void setFoneComercial(String foneComercial) {
		this.foneComercial = foneComercial;
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
	public String getCpfCnpj() {
		return cpfCnpj;
	}
	public void setCpfCnpj(String cpfCnpj) {
		this.cpfCnpj = cpfCnpj;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public Vencimento getVencimento() {
		return vencimento;
	}
	public void setVencimento(Vencimento vencimento) {
		this.vencimento = vencimento;
	}
	public int getConsumoExtra() {
		return consumoExtra;
	}
	public void setConsumoExtra(int consumoExtra) {
		this.consumoExtra = consumoExtra;
	}
	public Calendar getDataTroca() {
		return dataTroca;
	}
	public void setDataTroca(Calendar dataTroca) {
		this.dataTroca = dataTroca;
	}
	public String getMensagem() {
		return mensagem;
	}
	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}
	public String getBr_Hxl() {
		return br_Hxl;
	}
	public void setBr_Hxl(String br_Hxl) {
		this.br_Hxl = br_Hxl;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getTensaoNominal() {
		return tensaoNominal;
	}
	public void setTensaoNominal(String tensaoNominal) {
		this.tensaoNominal = tensaoNominal;
	}
	public int getRam_Numero() {
		return ram_Numero;
	}
	public void setRam_Numero(int ram_Numero) {
		this.ram_Numero = ram_Numero;
	}
	public String getAlimentador() {
		return alimentador;
	}
	public void setAlimentador(String alimentador) {
		this.alimentador = alimentador;
	}
	public int getRota() {
		return rota;
	}
	public void setRota(int rota) {
		this.rota = rota;
	}
	public String getDiaVencimento() {
		return diaVencimento;
	}
	public void setDiaVencimento(String diaVencimento) {
		this.diaVencimento = diaVencimento;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public String getTituloEleitor() {
		return tituloEleitor;
	}
	public void setTituloEleitor(String tituloEleitor) {
		this.tituloEleitor = tituloEleitor;
	}
	public Estado getEstado() {
		return estado;
	}
	public void setEstado(Estado estado) {
		this.estado = estado;
	}
	public Municipio getMunicipio() {
		return municipio;
	}
	public void setMunicipio(Municipio municipio) {
		this.municipio = municipio;
	}
	public Pais getPais() {
		return pais;
	}
	public void setPais(Pais pais) {
		this.pais = pais;
	}
	public String getIeAuxiliar() {
		return ieAuxiliar;
	}
	public void setIeAuxiliar(String ieAuxiliar) {
		this.ieAuxiliar = ieAuxiliar;
	}
	public int getRamalRural() {
		return ramalRural;
	}
	public void setRamalRural(int ramalRural) {
		this.ramalRural = ramalRural;
	}
	public int getRamalComercial() {
		return ramalComercial;
	}
	public void setRamalComercial(int ramalComercial) {
		this.ramalComercial = ramalComercial;
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
	public Calendar getDataCadastro() {
		return dataCadastro;
	}
	public void setDataCadastro(Calendar dataCadastro) {
		this.dataCadastro = dataCadastro;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public Calendar getDataUltimaVistoria() {
		return dataUltimaVistoria;
	}
	public void setDataUltimaVistoria(Calendar dataUltimaVistoria) {
		this.dataUltimaVistoria = dataUltimaVistoria;
	}
	public Calendar getDataInclusao() {
		return dataInclusao;
	}
	public void setDataInclusao(Calendar dataInclusao) {
		this.dataInclusao = dataInclusao;
	}
	public Calendar getDataEnvioScs() {
		return dataEnvioScs;
	}
	public void setDataEnvioScs(Calendar dataEnvioScs) {
		this.dataEnvioScs = dataEnvioScs;
	}
	public int getNreCoRes() {
		return nreCoRes;
	}
	public void setNreCoRes(int nreCoRes) {
		this.nreCoRes = nreCoRes;
	}
	public int getNreCoCom() {
		return nreCoCom;
	}
	public void setNreCoCom(int nreCoCom) {
		this.nreCoCom = nreCoCom;
	}
	public int getNreCoInd() {
		return nreCoInd;
	}
	public void setNreCoInd(int nreCoInd) {
		this.nreCoInd = nreCoInd;
	}
	public int getNreCoPp() {
		return nreCoPp;
	}
	public void setNreCoPp(int nreCoPp) {
		this.nreCoPp = nreCoPp;
	}
	public String getTarRes() {
		return tarRes;
	}
	public void setTarRes(String tarRes) {
		this.tarRes = tarRes;
	}
	public String getTarCom() {
		return tarCom;
	}
	public void setTarCom(String tarCom) {
		this.tarCom = tarCom;
	}
	public String getTarInd() {
		return tarInd;
	}
	public void setTarInd(String tarInd) {
		this.tarInd = tarInd;
	}
	public String getTarPp() {
		return tarPp;
	}
	public void setTarPp(String tarPp) {
		this.tarPp = tarPp;
	}
	public String getMesFat() {
		return mesFat;
	}
	public void setMesFat(String mesFat) {
		this.mesFat = mesFat;
	}
	public String getAnoFat() {
		return anoFat;
	}
	public void setAnoFat(String anoFat) {
		this.anoFat = anoFat;
	}
	public String getIsentaLixo() {
		return isentaLixo;
	}
	public void setIsentaLixo(String isentaLixo) {
		this.isentaLixo = isentaLixo;
	}
	public String getLacrado() {
		return lacrado;
	}
	public void setLacrado(String lacrado) {
		this.lacrado = lacrado;
	}
}
