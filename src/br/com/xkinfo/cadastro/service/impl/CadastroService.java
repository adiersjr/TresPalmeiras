package br.com.xkinfo.cadastro.service.impl;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Calendar;
import br.com.xkinfo.arrecadacao.model.Agencia;
import br.com.xkinfo.cadastro.model.Atividade;
import br.com.xkinfo.cadastro.model.Cadastro;
import br.com.xkinfo.cadastro.model.Classificacao;
import br.com.xkinfo.cadastro.model.Conjunto;
import br.com.xkinfo.cadastro.model.Proprietario;
import br.com.xkinfo.cadastro.model.RamalLigacao;
import br.com.xkinfo.cadastro.model.Setor;
import br.com.xkinfo.cadastro.model.SituacaoCadastro;
import br.com.xkinfo.cadastro.model.Vencimento;
import br.com.xkinfo.cadastro.service.ICadastroService;
import br.com.xkinfo.dao.DaoFactory;
import br.com.xkinfo.endereco.model.Bairro;
import br.com.xkinfo.endereco.model.Estado;
import br.com.xkinfo.endereco.model.MunicipioIbge;
import br.com.xkinfo.endereco.model.Pais;
import br.com.xkinfo.endereco.model.Rua;
import br.com.xkinfo.pessoa.model.Cliente;
import br.com.xkinfo.service.ServiceFactory;

public class CadastroService implements ICadastroService{

	Cadastro cadastro;

	@Override
	public void incluirCadastro(String chave, Proprietario proprietario, Conjunto conjunto,
			SituacaoCadastro situacaoCadastro, Classificacao classificacao, Agencia agencia, Bairro bairro, Rua rua,
			Setor setor, Atividade atividade, String instal, String casa, String apto, String contaBanco, String medKwh,
			String medKvar, Double fMultKwh, Double fMultKvar, Double fatorPotencia, Double leitura,
			Double leituraDesligado, Calendar dataLig, Calendar dataDeslig, Double roteiro, String livro,
			Double kwhContratado, char vip, char dv, String retencao, String isentaEct, String lampada, char localiz,
			String comple, char ramal, Double metragem, String digMed, String voltagem, char multa, char desconto,
			Double cargaInstalada, Double leituraKvarKqh, String obs, Double disjuntor, String lacreKwh,
			String lacreKvarh, String digMedKvarh, String lacre1, String lacre2, String lacre3, String consProx,
			Double frente, char tensao, char tributos, char faseRede, String ie, String orgaoExpedidor,
			String outroDocumento, String nome, Calendar dataNascimento, String foneResidencial, String foneComercial,
			String foneCelular, String email, String cpfCnpj, String senha, Vencimento vencimento, int consumoExtra,
			Calendar dataTroca, String mensagem, char br_Hxl, char tipo, String tensaoNominal,
			RamalLigacao ramalLigacao, String alimentador, int rota, String diaVencimento, char sexo,
			String tituloEleitor, Estado estado, MunicipioIbge municipioIbge, Pais pais, String ieAuxiliar,
			int ramalRural, int ramalComercial, String nomePai, String nomeMae, String contato, Calendar dataCadastro,
			Cliente cliente, Calendar dataUltimaVistoria, Calendar dataInclusao, Calendar dataEnvioScs, int nreCoRes,
			int nreCoCom, int nreCoInd, int nreCoPp, String tarRes, String tarCom, String tarInd, String tarPp,
			String mesFat, String anoFat, String isentaLixo, String lacrado) throws Exception {
		cadastro = new Cadastro();
		cadastro.setChave(chave);
		cadastro.setProprietario(proprietario);
		cadastro.setConjunto(conjunto);
		cadastro.setSituacaoCadastro(situacaoCadastro);
		cadastro.setClassificacao(classificacao);
		cadastro.setAgencia(agencia);
		cadastro.setBairro(bairro);
		cadastro.setRua(rua);
		cadastro.setSetor(setor);
		cadastro.setAtividade(atividade);
		cadastro.setInstal(instal);
		cadastro.setCasa(casa);
		cadastro.setApto(apto);
		cadastro.setContaBanco(contaBanco);
		cadastro.setMedKwh(medKwh);
		cadastro.setMedKvar(medKvar);
		cadastro.setfMultKwh(fMultKwh);
		cadastro.setfMultKvar(fMultKvar);
		cadastro.setFatorPotencia(fatorPotencia);
		cadastro.setLeitura(leitura);
		cadastro.setLeituraDesligado(leituraDesligado);
		cadastro.setDataLig(dataLig);
		cadastro.setDataDeslig(dataDeslig);
		cadastro.setRoteiro(roteiro);
		cadastro.setLivro(livro);
		cadastro.setKwhContratado(kwhContratado);
		cadastro.setVip(vip);
		cadastro.setDv(dv);
		cadastro.setRetencao(retencao);
		cadastro.setIsentaEct(isentaEct);
		cadastro.setLampada(lampada);
		cadastro.setLocaliz(localiz);
		cadastro.setComple(comple);
		cadastro.setRamal(ramal);
		cadastro.setMetragem(metragem);
		cadastro.setDigMed(digMed);
		cadastro.setVoltagem(voltagem);
		cadastro.setMulta(multa);
		cadastro.setDesconto(desconto);
		cadastro.setCargaInstalada(cargaInstalada);
		cadastro.setLeituraKvarKqh(leituraKvarKqh);
		cadastro.setObs(obs);
		cadastro.setDisjuntor(disjuntor);
		cadastro.setLacreKwh(lacreKwh);
		cadastro.setLacreKvarh(lacreKvarh);
		cadastro.setDigMedKvarh(digMedKvarh);
		cadastro.setLacre1(lacre1);
		cadastro.setLacre2(lacre2);
		cadastro.setLacre3(lacre3);
		cadastro.setConsProx(consProx);
		cadastro.setFrente(frente);
		cadastro.setTensao(tensao);
		cadastro.setTributos(tributos);
		cadastro.setFaseRede(faseRede);
		cadastro.setIe(ie);
		cadastro.setOrgaoExpedidor(orgaoExpedidor);
		cadastro.setOutroDocumento(outroDocumento);
		cadastro.setNome(nome);
		cadastro.setDataNascimento(dataNascimento);
		cadastro.setFoneResidencial(foneResidencial);
		cadastro.setFoneComercial(foneComercial);
		cadastro.setFoneCelular(foneCelular);
		cadastro.setEmail(email);
		cadastro.setCpfCnpj(cpfCnpj);
		cadastro.setSenha(senha);
		cadastro.setVencimento(vencimento);
		cadastro.setConsumoExtra(consumoExtra);
		cadastro.setDataTroca(dataTroca);
		cadastro.setMensagem(mensagem);
		cadastro.setBr_Hxl(br_Hxl);
		cadastro.setTipo(tipo);
		cadastro.setTensaoNominal(tensaoNominal);
		cadastro.setRamalLigacao(ramalLigacao);
		cadastro.setAlimentador(alimentador);
		cadastro.setRota(rota);
		cadastro.setDiaVencimento(diaVencimento);
		cadastro.setSexo(sexo);
		cadastro.setTituloEleitor(tituloEleitor);
		cadastro.setEstado(estado);
		cadastro.setMunicipioIbge(municipioIbge);
		cadastro.setPais(pais);
		cadastro.setIeAuxiliar(ieAuxiliar);
		cadastro.setRamalRural(ramalRural);
		cadastro.setRamalComercial(ramalComercial);
		cadastro.setNomePai(nomePai);
		cadastro.setNomeMae(nomeMae);
		cadastro.setContato(contato);
		cadastro.setDataCadastro(dataCadastro);
		cadastro.setCliente(cliente);
		cadastro.setDataUltimaVistoria(dataUltimaVistoria);
		cadastro.setDataInclusao(dataInclusao);
		cadastro.setDataEnvioScs(dataEnvioScs);
		cadastro.setNreCoRes(nreCoRes);
		cadastro.setNreCoCom(nreCoCom);
		cadastro.setNreCoInd(nreCoInd);
		cadastro.setNreCoPp(nreCoPp);
		cadastro.setTarRes(tarRes);
		cadastro.setTarCom(tarCom);
		cadastro.setTarInd(tarInd);
		cadastro.setTarPp(tarPp);
		cadastro.setMesFat(mesFat);
		cadastro.setAnoFat(anoFat);
		cadastro.setIsentaLixo(isentaLixo);
		cadastro.setLacrado(lacrado);
		DaoFactory.getCadastrodao().incluirCadastro(cadastro);

	}

	@Override
	public void alterarCadastro(int id, String chave, Proprietario proprietario, Conjunto conjunto,
			SituacaoCadastro situacaoCadastro, Classificacao classificacao, Agencia agencia, Bairro bairro, Rua rua,
			Setor setor, Atividade atividade, String instal, String casa, String apto, String contaBanco, String medKwh,
			String medKvar, Double fMultKwh, Double fMultKvar, Double fatorPotencia, Double leitura,
			Double leituraDesligado, Calendar dataLig, Calendar dataDeslig, Double roteiro, String livro,
			Double kwhContratado, char vip, char dv, String retencao, String isentaEct, String lampada, char localiz,
			String comple, char ramal, Double metragem, String digMed, String voltagem, char multa, char desconto,
			Double cargaInstalada, Double leituraKvarKqh, String obs, Double disjuntor, String lacreKwh,
			String lacreKvarh, String digMedKvarh, String lacre1, String lacre2, String lacre3, String consProx,
			Double frente, char tensao, char tributos, char faseRede, String ie, String orgaoExpedidor,
			String outroDocumento, String nome, Calendar dataNascimento, String foneResidencial, String foneComercial,
			String foneCelular, String email, String cpfCnpj, String senha, Vencimento vencimento, int consumoExtra,
			Calendar dataTroca, String mensagem, char br_Hxl, char tipo, String tensaoNominal,
			RamalLigacao ramalLigacao, String alimentador, int rota, String diaVencimento, char sexo,
			String tituloEleitor, Estado estado, MunicipioIbge municipioIbge, Pais pais, String ieAuxiliar,
			int ramalRural, int ramalComercial, String nomePai, String nomeMae, String contato, Calendar dataCadastro,
			Cliente cliente, Calendar dataUltimaVistoria, Calendar dataInclusao, Calendar dataEnvioScs, int nreCoRes,
			int nreCoCom, int nreCoInd, int nreCoPp, String tarRes, String tarCom, String tarInd, String tarPp,
			String mesFat, String anoFat, String isentaLixo, String lacrado) throws Exception {
		cadastro = new Cadastro();
		cadastro.setId(id);
		cadastro.setChave(chave);
		cadastro.setProprietario(proprietario);
		cadastro.setConjunto(conjunto);
		cadastro.setSituacaoCadastro(situacaoCadastro);
		cadastro.setClassificacao(classificacao);
		cadastro.setAgencia(agencia);
		cadastro.setBairro(bairro);
		cadastro.setRua(rua);
		cadastro.setSetor(setor);
		cadastro.setAtividade(atividade);
		cadastro.setInstal(instal);
		cadastro.setCasa(casa);
		cadastro.setApto(apto);
		cadastro.setContaBanco(contaBanco);
		cadastro.setMedKwh(medKwh);
		cadastro.setMedKvar(medKvar);
		cadastro.setfMultKwh(fMultKwh);
		cadastro.setfMultKvar(fMultKvar);
		cadastro.setFatorPotencia(fatorPotencia);
		cadastro.setLeitura(leitura);
		cadastro.setLeituraDesligado(leituraDesligado);
		cadastro.setDataLig(dataLig);
		cadastro.setDataDeslig(dataDeslig);
		cadastro.setRoteiro(roteiro);
		cadastro.setLivro(livro);
		cadastro.setKwhContratado(kwhContratado);
		cadastro.setVip(vip);
		cadastro.setDv(dv);
		cadastro.setRetencao(retencao);
		cadastro.setIsentaEct(isentaEct);
		cadastro.setLampada(lampada);
		cadastro.setLocaliz(localiz);
		cadastro.setComple(comple);
		cadastro.setRamal(ramal);
		cadastro.setMetragem(metragem);
		cadastro.setDigMed(digMed);
		cadastro.setVoltagem(voltagem);
		cadastro.setMulta(multa);
		cadastro.setDesconto(desconto);
		cadastro.setCargaInstalada(cargaInstalada);
		cadastro.setLeituraKvarKqh(leituraKvarKqh);
		cadastro.setObs(obs);
		cadastro.setDisjuntor(disjuntor);
		cadastro.setLacreKwh(lacreKwh);
		cadastro.setLacreKvarh(lacreKvarh);
		cadastro.setDigMedKvarh(digMedKvarh);
		cadastro.setLacre1(lacre1);
		cadastro.setLacre2(lacre2);
		cadastro.setLacre3(lacre3);
		cadastro.setConsProx(consProx);
		cadastro.setFrente(frente);
		cadastro.setTensao(tensao);
		cadastro.setTributos(tributos);
		cadastro.setFaseRede(faseRede);
		cadastro.setIe(ie);
		cadastro.setOrgaoExpedidor(orgaoExpedidor);
		cadastro.setOutroDocumento(outroDocumento);
		cadastro.setNome(nome);
		cadastro.setDataNascimento(dataNascimento);
		cadastro.setFoneResidencial(foneResidencial);
		cadastro.setFoneComercial(foneComercial);
		cadastro.setFoneCelular(foneCelular);
		cadastro.setEmail(email);
		cadastro.setCpfCnpj(cpfCnpj);
		cadastro.setSenha(senha);
		cadastro.setVencimento(vencimento);
		cadastro.setConsumoExtra(consumoExtra);
		cadastro.setDataTroca(dataTroca);
		cadastro.setMensagem(mensagem);
		cadastro.setBr_Hxl(br_Hxl);
		cadastro.setTipo(tipo);
		cadastro.setTensaoNominal(tensaoNominal);
		cadastro.setRamalLigacao(ramalLigacao);
		cadastro.setAlimentador(alimentador);
		cadastro.setRota(rota);
		cadastro.setDiaVencimento(diaVencimento);
		cadastro.setSexo(sexo);
		cadastro.setTituloEleitor(tituloEleitor);
		cadastro.setEstado(estado);
		cadastro.setMunicipioIbge(municipioIbge);
		cadastro.setPais(pais);
		cadastro.setIeAuxiliar(ieAuxiliar);
		cadastro.setRamalRural(ramalRural);
		cadastro.setRamalComercial(ramalComercial);
		cadastro.setNomePai(nomePai);
		cadastro.setNomeMae(nomeMae);
		cadastro.setContato(contato);
		cadastro.setDataCadastro(dataCadastro);
		cadastro.setCliente(cliente);
		cadastro.setDataUltimaVistoria(dataUltimaVistoria);
		cadastro.setDataInclusao(dataInclusao);
		cadastro.setDataEnvioScs(dataEnvioScs);
		cadastro.setNreCoRes(nreCoRes);
		cadastro.setNreCoCom(nreCoCom);
		cadastro.setNreCoInd(nreCoInd);
		cadastro.setNreCoPp(nreCoPp);
		cadastro.setTarRes(tarRes);
		cadastro.setTarCom(tarCom);
		cadastro.setTarInd(tarInd);
		cadastro.setTarPp(tarPp);
		cadastro.setMesFat(mesFat);
		cadastro.setAnoFat(anoFat);
		cadastro.setIsentaLixo(isentaLixo);
		cadastro.setLacrado(lacrado);
		DaoFactory.getCadastrodao().alterarCadastro(cadastro);
	}

	@Override
	public void excluirCadastro(String chave) throws Exception {
		cadastro = pesquisarCadastro(chave);
		DaoFactory.getCadastrodao().excluirCadastro(cadastro);
	}

	@Override
	public ArrayList<Cadastro> pesquisarCadastros() throws Exception {
		ResultSet rs = DaoFactory.getCadastrodao().pesquisarCadastros();
		ArrayList<Cadastro> cadastros = new ArrayList<>();
		while(rs.next()){
			cadastro = new Cadastro();
			cadastro.setId(rs.getInt("CAD_CHAVE"));
			cadastro.setChave(rs.getString("CAD_CHAVE"));
			cadastro.setProprietario(ServiceFactory.getProprietarioservice().pesquisarProprietario(rs.getInt("PRO_NUMERO")));
			cadastro.setConjunto(ServiceFactory.getConjuntoservice().pesquisarConjunto(rs.getString("CON_NUMERO")));
			cadastro.setSituacaoCadastro(ServiceFactory.getSituacaocadastroservice().pesquisarSituacaoCadastro(rs.getString("SIT_CODIGO").charAt(0)));
			cadastro.setClassificacao(ServiceFactory.getClassificacaoservice().pesquisarClassificacao(rs.getString("CLA_CHAVE")));
			cadastro.setAgencia(ServiceFactory.getAgenciaservice().pesquisaAgencia(rs.getString("AGE_CHAVE")));
			cadastro.setBairro(ServiceFactory.getBairroservice().pesquisaBairro(rs.getInt("BAI_NUMERO")));
			cadastro.setRua(ServiceFactory.getRuaservice().pesquisarRua(rs.getInt("RUA_NUMERO")));
			cadastro.setSetor(ServiceFactory.getSetorservice().pesquisarSetor(rs.getString("SET_CHAVE")));
			cadastro.setAtividade(ServiceFactory.getAtividadeservice().pesquisarAtividade(rs.getString("ATV_CODIGO")));
			cadastro.setInstal(rs.getString("CAD_INSTAL"));
			cadastro.setCasa(rs.getString("CAD_CASA"));
			cadastro.setApto(rs.getString("CAD_APTO"));
			cadastro.setContaBanco(rs.getString("CAD_CTABCO"));
			cadastro.setMedKwh(rs.getString("CAD_MEDKWH"));
			cadastro.setMedKvar(rs.getString("CAD_MEDKVAR"));
			cadastro.setfMultKwh(rs.getDouble("CAD_FMULTKWH"));
			cadastro.setfMultKvar(rs.getDouble("CAD_FMULTKVAR"));
			cadastro.setFatorPotencia(rs.getDouble("CAD_FATPOT"));
			cadastro.setLeitura(rs.getDouble("CAD_LEITURA"));
			cadastro.setLeituraDesligado(rs.getDouble("CAD_LEITURADESLI"));
			cadastro.setDataLig(ServiceFactory.getApoioservice().converteCalendar(rs.getDate("CAD_DTALIG")));
			cadastro.setDataDeslig(ServiceFactory.getApoioservice().converteCalendar(rs.getDate("CAD_DTADESLIG")));
			cadastro.setRoteiro(rs.getDouble("CAD_ROTEIRO"));
			cadastro.setLivro(rs.getString("CAD_LIVRO"));
			cadastro.setKwhContratado(rs.getDouble("CAD_KWHCONTR"));
			cadastro.setVip(rs.getString("CAD_VIP").charAt(0));
			cadastro.setDv(rs.getString("CAD_DV").charAt(0));
			cadastro.setRetencao(rs.getString("CAD_RETENCAO"));
			cadastro.setIsentaEct(rs.getString("CAD_ISENTAECT"));
			cadastro.setLampada(rs.getString("CAD_LAMPADA"));
			cadastro.setLocaliz(rs.getString("CAD_LOCALIZ").charAt(0));
			cadastro.setComple(rs.getString("CAD_COMPLE"));
			cadastro.setRamal(rs.getString("CAD_RAMAL").charAt(0));
			cadastro.setMetragem(rs.getDouble("CAD_METRAGEM"));
			cadastro.setDigMed(rs.getString("CAD_DIGMED"));
			cadastro.setVoltagem(rs.getString("CAD_VOLTAGEM"));
			cadastro.setMulta(rs.getString("CAD_MULTA").charAt(0));
			cadastro.setDesconto(rs.getString("CAD_DESCONTO").charAt(0));
			cadastro.setCargaInstalada(rs.getDouble("CAD_CARGAINST"));
			cadastro.setLeituraKvarKqh(rs.getDouble("CAD_LEITURAKVARKQH"));
			cadastro.setObs(rs.getString("CAD_OBS"));
			cadastro.setDisjuntor(rs.getDouble("CAD_DISJUNTOR"));
			cadastro.setLacreKwh(rs.getString("CAD_LACREKWH"));
			cadastro.setLacreKvarh(rs.getString("CAD_LACREKVARH"));
			cadastro.setDigMedKvarh(rs.getString("CAD_DIGMEDKVARH"));
			cadastro.setLacre1(rs.getString("CAD_LACRE1"));
			cadastro.setLacre2(rs.getString("CAD_LACRE2"));
			cadastro.setLacre3(rs.getString("CAD_LACRE3"));
			cadastro.setConsProx(rs.getString("CAD_CONSPROX"));
			cadastro.setFrente(rs.getDouble("CAD_FRENTE"));
			cadastro.setTensao(rs.getString("CAD_TENSAO").charAt(0));
			cadastro.setTributos(rs.getString("CAD_TRIBUTOS").charAt(0));
			cadastro.setFaseRede(rs.getString("CAD_FASEREDE").charAt(0));
			cadastro.setIe(rs.getString("CAD_IE"));
			cadastro.setOrgaoExpedidor(rs.getString("CAD_ORGAOEXP"));
			cadastro.setOutroDocumento(rs.getString("CAD_OUTRODOC"));
			cadastro.setNome(rs.getString("CAD_NOME"));
			cadastro.setDataNascimento(ServiceFactory.getApoioservice().converteCalendar(rs.getDate("CAD_DATANASC")));
			cadastro.setFoneResidencial(rs.getString("CAD_FONERES"));
			cadastro.setFoneComercial(rs.getString("CAD_FONECOM"));
			cadastro.setFoneCelular(rs.getString("CAD_FONECELULAR"));
			cadastro.setEmail(rs.getString("CAD_EMAIL"));
			cadastro.setCpfCnpj(rs.getString("CAD_CNPJ_CPF"));
			cadastro.setSenha(rs.getString("CAD_SENHA"));
			cadastro.setVencimento(ServiceFactory.getVencimentoservice().pesquisarVencimento(rs.getString("VEN_CODIGO")));
			cadastro.setConsumoExtra(rs.getInt("CAD_CONSUMOEXTRA"));
			cadastro.setDataTroca(ServiceFactory.getApoioservice().converteCalendar(rs.getDate("CAD_DATATROCA")));
			cadastro.setMensagem(rs.getString("CAD_MENSAGEM"));
			cadastro.setBr_Hxl(rs.getString("CAD_BR_HXL").charAt(0));
			cadastro.setTipo(rs.getString("CAD_TIPO").charAt(0));
			cadastro.setTensaoNominal(rs.getString("CAD_TENSAONOMINAL"));
			cadastro.setRamalLigacao(ServiceFactory.getRamalligacaoservice().pesquisarRamalLigacao(rs.getInt("RAM_NUMERO")));
			cadastro.setAlimentador(rs.getString("CAD_ALIMENTADOR"));
			cadastro.setRota(rs.getInt("CAD_ROTA"));
			cadastro.setDiaVencimento(rs.getString("CAD_DIAVENCIMENTO"));
			cadastro.setSexo(rs.getString("CAD_SEXO").charAt(0));
			cadastro.setTituloEleitor(rs.getString("CAD_TITULOELEITOR"));
			cadastro.setEstado(ServiceFactory.getEstadoservice().pesquisaSigla(rs.getString("EST_SIGLA")));
			cadastro.setMunicipioIbge(ServiceFactory.getMunicipioibgeservice().pesquisaMunicipio(rs.getString("MUI_CODIGO")));
			cadastro.setPais(ServiceFactory.getPaisservice().pesquisaPais(rs.getInt("PAI_NUMERO")));
			cadastro.setIeAuxiliar(rs.getString("CAD_IEAUX"));
			cadastro.setRamalRural(rs.getInt("CAD_RAMALRURAL"));
			cadastro.setRamalComercial(rs.getInt("CAD_RAMALCOMERCIAL"));
			cadastro.setNomePai(rs.getString("CAD_NOMEPAI"));
			cadastro.setNomeMae(rs.getString("CAD_NOMEMAE"));
			cadastro.setContato(rs.getString("CAD_CONTATO"));
			cadastro.setDataCadastro(ServiceFactory.getApoioservice().converteCalendar(rs.getDate("CAD_DTACADASTRO")));
			cadastro.setCliente(ServiceFactory.getClienteservice().pesquisaCliente(rs.getInt("CLI_NUMERO")));
			cadastro.setDataUltimaVistoria(ServiceFactory.getApoioservice().converteCalendar(rs.getDate("CAD_DTAULTIMAVISITA")));
			cadastro.setDataInclusao(ServiceFactory.getApoioservice().converteCalendar(rs.getDate("CAD_DTAINCLUSAO")));
			cadastro.setDataEnvioScs(ServiceFactory.getApoioservice().converteCalendar(rs.getDate("CAD_ATA_ENVIO_SCS")));
			cadastro.setNreCoRes(rs.getInt("CAD_NRECORES"));
			cadastro.setNreCoCom(rs.getInt("CAD_NRECOCOM"));
			cadastro.setNreCoInd(rs.getInt("CAD_NRECOIND"));
			cadastro.setNreCoPp(rs.getInt("CAD_NRECOPP"));
			cadastro.setTarRes(rs.getString("CAD_TARRES"));
			cadastro.setTarCom(rs.getString("CAD_TARCOM"));
			cadastro.setTarInd(rs.getString("CAD_TARIND"));
			cadastro.setTarPp(rs.getString("CAD_TARPP"));
			cadastro.setMesFat(rs.getString("CAD_MESFAT"));
			cadastro.setAnoFat(rs.getString("CAD_ANOFAT"));
			cadastro.setIsentaLixo(rs.getString("CAD_ISENTALIXO"));
			cadastro.setLacrado(rs.getString("CAD_LACRADO"));
			cadastros.add(cadastro);
		}
		return cadastros;
	}

	@Override
	public Cadastro pesquisarCadastro(String chave) throws Exception {
		ResultSet rs = DaoFactory.getCadastrodao().pesquisarCadastro(chave);
		cadastro = new Cadastro();
		while(rs.next()){
			cadastro.setId(rs.getInt("CAD_CHAVE"));
			cadastro.setChave(rs.getString("CAD_CHAVE"));
			cadastro.setProprietario(ServiceFactory.getProprietarioservice().pesquisarProprietario(rs.getInt("PRO_NUMERO")));
			cadastro.setConjunto(ServiceFactory.getConjuntoservice().pesquisarConjunto(rs.getString("CON_NUMERO")));
			cadastro.setSituacaoCadastro(ServiceFactory.getSituacaocadastroservice().pesquisarSituacaoCadastro(rs.getString("SIT_CODIGO").charAt(0)));
			cadastro.setClassificacao(ServiceFactory.getClassificacaoservice().pesquisarClassificacao(rs.getString("CLA_CHAVE")));
			cadastro.setAgencia(ServiceFactory.getAgenciaservice().pesquisaAgencia(rs.getString("AGE_CHAVE")));
			cadastro.setBairro(ServiceFactory.getBairroservice().pesquisaBairro(rs.getInt("BAI_NUMERO")));
			cadastro.setRua(ServiceFactory.getRuaservice().pesquisarRua(rs.getInt("RUA_NUMERO")));
			cadastro.setSetor(ServiceFactory.getSetorservice().pesquisarSetor(rs.getString("SET_CHAVE")));
			cadastro.setAtividade(ServiceFactory.getAtividadeservice().pesquisarAtividade(rs.getString("ATV_CODIGO")));
			cadastro.setInstal(rs.getString("CAD_INSTAL"));
			cadastro.setCasa(rs.getString("CAD_CASA"));
			cadastro.setApto(rs.getString("CAD_APTO"));
			cadastro.setContaBanco(rs.getString("CAD_CTABCO"));
			cadastro.setMedKwh(rs.getString("CAD_MEDKWH"));
			cadastro.setMedKvar(rs.getString("CAD_MEDKVAR"));
			cadastro.setfMultKwh(rs.getDouble("CAD_FMULTKWH"));
			cadastro.setfMultKvar(rs.getDouble("CAD_FMULTKVAR"));
			cadastro.setFatorPotencia(rs.getDouble("CAD_FATPOT"));
			cadastro.setLeitura(rs.getDouble("CAD_LEITURA"));
			cadastro.setLeituraDesligado(rs.getDouble("CAD_LEITURADESLI"));
			cadastro.setDataLig(ServiceFactory.getApoioservice().converteCalendar(rs.getDate("CAD_DTALIG")));
			cadastro.setDataDeslig(ServiceFactory.getApoioservice().converteCalendar(rs.getDate("CAD_DTADESLIG")));
			cadastro.setRoteiro(rs.getDouble("CAD_ROTEIRO"));
			cadastro.setLivro(rs.getString("CAD_LIVRO"));
			cadastro.setKwhContratado(rs.getDouble("CAD_KWHCONTR"));
			cadastro.setVip(rs.getString("CAD_VIP").charAt(0));
			cadastro.setDv(rs.getString("CAD_DV").charAt(0));
			cadastro.setRetencao(rs.getString("CAD_RETENCAO"));
			cadastro.setIsentaEct(rs.getString("CAD_ISENTAECT"));
			cadastro.setLampada(rs.getString("CAD_LAMPADA"));
			cadastro.setLocaliz(rs.getString("CAD_LOCALIZ").charAt(0));
			cadastro.setComple(rs.getString("CAD_COMPLE"));
			cadastro.setRamal(rs.getString("CAD_RAMAL").charAt(0));
			cadastro.setMetragem(rs.getDouble("CAD_METRAGEM"));
			cadastro.setDigMed(rs.getString("CAD_DIGMED"));
			cadastro.setVoltagem(rs.getString("CAD_VOLTAGEM"));
			cadastro.setMulta(rs.getString("CAD_MULTA").charAt(0));
			cadastro.setDesconto(rs.getString("CAD_DESCONTO").charAt(0));
			cadastro.setCargaInstalada(rs.getDouble("CAD_CARGAINST"));
			cadastro.setLeituraKvarKqh(rs.getDouble("CAD_LEITURAKVARKQH"));
			cadastro.setObs(rs.getString("CAD_OBS"));
			cadastro.setDisjuntor(rs.getDouble("CAD_DISJUNTOR"));
			cadastro.setLacreKwh(rs.getString("CAD_LACREKWH"));
			cadastro.setLacreKvarh(rs.getString("CAD_LACREKVARH"));
			cadastro.setDigMedKvarh(rs.getString("CAD_DIGMEDKVARH"));
			cadastro.setLacre1(rs.getString("CAD_LACRE1"));
			cadastro.setLacre2(rs.getString("CAD_LACRE2"));
			cadastro.setLacre3(rs.getString("CAD_LACRE3"));
			cadastro.setConsProx(rs.getString("CAD_CONSPROX"));
			cadastro.setFrente(rs.getDouble("CAD_FRENTE"));
			cadastro.setTensao(rs.getString("CAD_TENSAO").charAt(0));
			cadastro.setTributos(rs.getString("CAD_TRIBUTOS").charAt(0));
			cadastro.setFaseRede(rs.getString("CAD_FASEREDE").charAt(0));
			cadastro.setIe(rs.getString("CAD_IE"));
			cadastro.setOrgaoExpedidor(rs.getString("CAD_ORGAOEXP"));
			cadastro.setOutroDocumento(rs.getString("CAD_OUTRODOC"));
			cadastro.setNome(rs.getString("CAD_NOME"));
			cadastro.setDataNascimento(ServiceFactory.getApoioservice().converteCalendar(rs.getDate("CAD_DATANASC")));
			cadastro.setFoneResidencial(rs.getString("CAD_FONERES"));
			cadastro.setFoneComercial(rs.getString("CAD_FONECOM"));
			cadastro.setFoneCelular(rs.getString("CAD_FONECELULAR"));
			cadastro.setEmail(rs.getString("CAD_EMAIL"));
			cadastro.setCpfCnpj(rs.getString("CAD_CNPJ_CPF"));
			cadastro.setSenha(rs.getString("CAD_SENHA"));
			cadastro.setVencimento(ServiceFactory.getVencimentoservice().pesquisarVencimento(rs.getString("VEN_CODIGO")));
			cadastro.setConsumoExtra(rs.getInt("CAD_CONSUMOEXTRA"));
			cadastro.setDataTroca(ServiceFactory.getApoioservice().converteCalendar(rs.getDate("CAD_DATATROCA")));
			cadastro.setMensagem(rs.getString("CAD_MENSAGEM"));
			cadastro.setBr_Hxl(rs.getString("CAD_BR_HXL").charAt(0));
			cadastro.setTipo(rs.getString("CAD_TIPO").charAt(0));
			cadastro.setTensaoNominal(rs.getString("CAD_TENSAONOMINAL"));
			cadastro.setRamalLigacao(ServiceFactory.getRamalligacaoservice().pesquisarRamalLigacao(rs.getInt("RAM_NUMERO")));
			cadastro.setAlimentador(rs.getString("CAD_ALIMENTADOR"));
			cadastro.setRota(rs.getInt("CAD_ROTA"));
			cadastro.setDiaVencimento(rs.getString("CAD_DIAVENCIMENTO"));
			cadastro.setSexo(rs.getString("CAD_SEXO").charAt(0));
			cadastro.setTituloEleitor(rs.getString("CAD_TITULOELEITOR"));
			cadastro.setEstado(ServiceFactory.getEstadoservice().pesquisaSigla(rs.getString("EST_SIGLA")));
			cadastro.setMunicipioIbge(ServiceFactory.getMunicipioibgeservice().pesquisaMunicipio(rs.getString("MUI_CODIGO")));
			cadastro.setPais(ServiceFactory.getPaisservice().pesquisaPais(rs.getInt("PAI_NUMERO")));
			cadastro.setIeAuxiliar(rs.getString("CAD_IEAUX"));
			cadastro.setRamalRural(rs.getInt("CAD_RAMALRURAL"));
			cadastro.setRamalComercial(rs.getInt("CAD_RAMALCOMERCIAL"));
			cadastro.setNomePai(rs.getString("CAD_NOMEPAI"));
			cadastro.setNomeMae(rs.getString("CAD_NOMEMAE"));
			cadastro.setContato(rs.getString("CAD_CONTATO"));
			cadastro.setDataCadastro(ServiceFactory.getApoioservice().converteCalendar(rs.getDate("CAD_DTACADASTRO")));
			cadastro.setCliente(ServiceFactory.getClienteservice().pesquisaCliente(rs.getInt("CLI_NUMERO")));
			cadastro.setDataUltimaVistoria(ServiceFactory.getApoioservice().converteCalendar(rs.getDate("CAD_DTAULTIMAVISITA")));
			cadastro.setDataInclusao(ServiceFactory.getApoioservice().converteCalendar(rs.getDate("CAD_DTAINCLUSAO")));
			cadastro.setDataEnvioScs(ServiceFactory.getApoioservice().converteCalendar(rs.getDate("CAD_ATA_ENVIO_SCS")));
			cadastro.setNreCoRes(rs.getInt("CAD_NRECORES"));
			cadastro.setNreCoCom(rs.getInt("CAD_NRECOCOM"));
			cadastro.setNreCoInd(rs.getInt("CAD_NRECOIND"));
			cadastro.setNreCoPp(rs.getInt("CAD_NRECOPP"));
			cadastro.setTarRes(rs.getString("CAD_TARRES"));
			cadastro.setTarCom(rs.getString("CAD_TARCOM"));
			cadastro.setTarInd(rs.getString("CAD_TARIND"));
			cadastro.setTarPp(rs.getString("CAD_TARPP"));
			cadastro.setMesFat(rs.getString("CAD_MESFAT"));
			cadastro.setAnoFat(rs.getString("CAD_ANOFAT"));
			cadastro.setIsentaLixo(rs.getString("CAD_ISENTALIXO"));
			cadastro.setLacrado(rs.getString("CAD_LACRADO"));
		}
		return cadastro;
	}


}
