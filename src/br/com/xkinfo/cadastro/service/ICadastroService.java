package br.com.xkinfo.cadastro.service;

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
import br.com.xkinfo.endereco.model.Bairro;
import br.com.xkinfo.endereco.model.Estado;
import br.com.xkinfo.endereco.model.MunicipioIbge;
import br.com.xkinfo.endereco.model.Pais;
import br.com.xkinfo.endereco.model.Rua;
import br.com.xkinfo.pessoa.model.Cliente;

public interface ICadastroService {
	
	public void incluirCadastro(String chave, Proprietario proprietario, Contribuicao contribuicao, SituacaoCadastro situacaoCadastro,
			Classificacao classificacao, Agencia agencia, Bairro bairro, Rua rua, Setor setor, Atividade atividade, String instal, String casa,
			String apto, String contaBanco, String medKwh, String medKvar, Double fMultKwh, Double fMultKvar, Double fatorPotencia, Double leitura, 
			Double leituraDesligado, Calendar dataLig, Calendar dataDeslig, Double roteiro, String livro, Double kwhContratado, char vip,
			char dv, String retencao, String isentaEct, String lampada, char localiz, String comple, char ramal, Double metragem, String digMed, 
			String voltagem, char multa, char desconto, Double cargaInstalada, Double leituraKvarKqh, String obs, Double disjuntor, String lacreKwh,
			String lacreKvarh, String digMedKvarh, String lacre1, String lacre2, String lacre3, String consProx, Double frente, char tensao,
			char tributos, char faseRede, String ie, String orgaoExpedidor, String outroDocumento, String nome, Calendar dataNascimento, 
			String foneResidencial, String foneComercial, String foneCelular, String email, String cpfCnpj, String senha, Vencimento vencimento, 
			int consumoExtra, Calendar dataTroca, String mensagem, char br_Hxl, char tipo, String tensaoNominal, RamalLigacao ramalLigacao, 
			String alimentador, int rota, String diaVencimento, char sexo, String tituloEleitor, Estado estado, MunicipioIbge municipioIbge, Pais pais,
			String ieAuxiliar, int ramalRural, int ramalComercial, String nomePai, String nomeMae, String contato, Calendar dataCadastro, Cliente cliente,
			Calendar dataUltimaVistoria, Calendar dataInclusao, Calendar dataEnvioScs, int nreCoRes, int nreCoCom, int nreCoInd, int nreCoPp, String tarRes,
			String tarCom, String tarInd, String tarPp, String mesFat, String anoFat, String isentaLixo, String lacrado) throws Exception;
	
	public void alterarCadastro(int id, String chave, Proprietario proprietario, Contribuicao contribuicao, SituacaoCadastro situacaoCadastro,
			Classificacao classificacao, Agencia agencia, Bairro bairro, Rua rua, Setor setor, Atividade atividade, String instal, String casa,
			String apto, String contaBanco, String medKwh, String medKvar, Double fMultKwh, Double fMultKvar, Double fatorPotencia, Double leitura, 
			Double leituraDesligado, Calendar dataLig, Calendar dataDeslig, Double roteiro, String livro, Double kwhContratado, char vip,
			char dv, String retencao, String isentaEct, String lampada, char localiz, String comple, char ramal, Double metragem, String digMed, 
			String voltagem, char multa, char desconto, Double cargaInstalada, Double leituraKvarKqh, String obs, Double disjuntor, String lacreKwh,
			String lacreKvarh, String digMedKvarh, String lacre1, String lacre2, String lacre3, String consProx, Double frente, char tensao,
			char tributos, char faseRede, String ie, String orgaoExpedidor, String outroDocumento, String nome, Calendar dataNascimento, 
			String foneResidencial, String foneComercial, String foneCelular, String email, String cpfCnpj, String senha, Vencimento vencimento, 
			int consumoExtra, Calendar dataTroca, String mensagem, char br_Hxl, char tipo, String tensaoNominal, RamalLigacao ramalLigacao, 
			String alimentador, int rota, String diaVencimento, char sexo, String tituloEleitor, Estado estado, MunicipioIbge municipioIbge, Pais pais,
			String ieAuxiliar, int ramalRural, int ramalComercial, String nomePai, String nomeMae, String contato, Calendar dataCadastro, Cliente cliente,
			Calendar dataUltimaVistoria, Calendar dataInclusao, Calendar dataEnvioScs, int nreCoRes, int nreCoCom, int nreCoInd, int nreCoPp, String tarRes,
			String tarCom, String tarInd, String tarPp, String mesFat, String anoFat, String isentaLixo, String lacrado) throws Exception;
	
	public void excluirCadastro(int id) throws Exception;
	
	public ArrayList<Cadastro> pesquisarCadastros() throws Exception;
	
	public Cadastro pesquisarCadastro(int id) throws Exception;

}
