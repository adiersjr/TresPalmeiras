package br.com.xkinfo.cadastro.service.impl;

import java.util.ArrayList;
import java.util.Calendar;
import br.com.xkinfo.arrecadacao.model.Agencia;
import br.com.xkinfo.cadastro.model.Atividade;
import br.com.xkinfo.cadastro.model.Cadastro;
import br.com.xkinfo.cadastro.model.Classificacao;
import br.com.xkinfo.cadastro.model.Contribuicao;
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

public class CadastroService implements ICadastroService{
	
	Cadastro cadastro;

	@Override
	public void incluirCadastro(String chave, Proprietario proprietario, Contribuicao contribuicao,
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
		cadastro.setContribuicao(contribuicao);
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
	public void alterarCadastro(int id, String chave, Proprietario proprietario, Contribuicao contribuicao,
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
		cadastro.setContribuicao(contribuicao);
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
	public void excluirCadastro(int id) throws Exception {
		cadastro = pesquisarCadastro(id);
		DaoFactory.getCadastrodao().excluirCadastro(cadastro);
	}

	@Override
	public ArrayList<Cadastro> pesquisarCadastros() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Cadastro pesquisarCadastro(int id) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}


}
