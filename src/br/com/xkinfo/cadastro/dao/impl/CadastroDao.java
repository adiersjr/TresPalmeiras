package br.com.xkinfo.cadastro.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import br.com.xkinfo.cadastro.dao.ICadastroDao;
import br.com.xkinfo.cadastro.model.Cadastro;
import br.com.xkinfo.service.ServiceFactory;
import br.com.xkinfo.util.Conexao;

public class CadastroDao implements ICadastroDao{

	Conexao conexao = new Conexao();
	private Statement st;

	@Override
	public int incluirCadastro(Cadastro cadastro) throws Exception {
		int result = -1;
		String query = "INSERT INTO CADASTROS (PRO_NUMERO, CON_NUMERO, SIT_CODIGO, CLA_CHAVE, AGE_CHAVE, BAI_NUMERO, RUA_NUMERO, SET_CHAVE, ATV_CODIGO, "
				+ " CAD_INSTAL, CAD_CASA, CAD_APTO, CAD_CTABCO, CAD_MEDKWH, CAD_MEDKVAR, CAD_FATPOT, CAD_LEITURA, CAD_LEITURADESLIG, CAD_DTALIG, "
				+ " CAD_DTADESLIG, CAD_ROTEIRO, CAD_LIVRO, CAD_KWHCONTR, CAD_VIP, CAD_DV, CAD_RETENCAO, CAD_ISENTAECT, CAD_LAMPADA, CAD_LOCALIZ, "
				+ " CAD_COMPLE, CAD_RAMAL, CAD_METRAGEM, CAD_DIGMED, CAD_VOLTAGEM, CAD_MULTA, CAD_DESCONTO, CAD_CARGAINST, CAD_LEITURAKVARKQH, "
				+ " CAD_OBS, CAD_DISJUNTOR, CAD_LACREKWH, CAD_LACREKVARH, CAD_DIGMEDKVARH, CAD_LACRE1, CAD_LACRE2, CAD_LACRE3, CAD_CONSPROX, CAD_FRENTE, "
				+ " CAD_TENSAO, CAD_TRIBUTOS, CAD_FASEREDE, CAD_IE, CAD_ORGAOEXP , CAD_OUTRODOC, CAD_NOME, CAD_DATANASC, CAD_FONERES, CAD_FONECOM, "
				+ " CAD_FONECELULAR, CAD_EMAIL, CAD_CNPJ_CPF, CAD_SENHA, VEN_CODIGO, CAD_CONSUMOEXTRA, CAD_DATATROCA, CAD_MENSAGEM, CAD_BR_HXL, CAD_TIPO, "
				+ " CAD_TENSAONOMINAL, RAM_NUMERO, CAD_ALIMENTADOR, CAD_ROTA, DIAVENCIMENTO, CAD_SEXO, CAD_TITULOELEITOR, EST_SIGLA, MUI_CODIGO, "
				+ " PAI_NUMERO, CAD_IEAUX, CAD_RAMALRURAL, CAD_RAMALCOMERCIAL, CAD_NOMEPAI, CAD_NOMEMAE, CAD_CONTATO, CAD_DTACADASTRO, CLI_NUMERO, "
				+ " CAD_DTAULTVISTORIA, CAD_DTAINCLUSAO, CAD_DATA_ENVIO_SCS, CAD_NRECORES, CAD_NRECOCOM, CAD_NRECOIND, CAD_NRECOPP, CAD_TARRES, "
				+ " CAD_TARCOM, CAD_TARIND, CAD_TARPP, CAD_MESFAT, CAD_ANOFAT, CAD_ISENTALIXO, CAD_LACRADO, ID) "
				+ " VALUES("+cadastro.getProprietario().getId()+", '"+cadastro.getConjunto().getNumero()+"', "+cadastro.getSituacaoCadastro().getId()+", "
				+ " '"+cadastro.getClassificacao().getChave()+"', "+cadastro.getAgencia().getChave()+"',"+cadastro.getBairro().getId()+", "
				+ " "+cadastro.getRua().getId()+", '"+cadastro.getSetor().getChave()+"', '"+cadastro.getAtividade().getId()+"',  "
				+ " '"+cadastro.getInstal()+"', '"+cadastro.getCasa()+"', '"+cadastro.getApto()+"', '"+cadastro.getContaBanco()+"', "
				+ " '"+cadastro.getMedKwh()+"', '"+cadastro.getMedKvar()+"', "+cadastro.getFatorPotencia()+", "+cadastro.getLeitura()+", "
				+ " "+cadastro.getLeituraDesligado()+", '"+cadastro.getDataLig()+"', '"+cadastro.getDataDeslig()+"', "+cadastro.getRoteiro()+", "
				+ " '"+cadastro.getLivro()+"', "+cadastro.getKwhContratado()+", '"+cadastro.getVip()+"', '"+cadastro.getDv()+"', "
				+ " '"+cadastro.getRetencao()+"', '"+cadastro.getIsentaEct()+"', '"+cadastro.getLampada()+"', '"+cadastro.getLocaliz()+"', "
				+ " '"+cadastro.getComple()+"', '"+cadastro.getRamal()+"', "+cadastro.getMetragem()+", '"+cadastro.getDigMed()+"', "
				+ " '"+cadastro.getVoltagem()+"', '"+cadastro.getMulta()+"', '"+cadastro.getDesconto()+"', "+cadastro.getCargaInstalada()+", "
				+ " "+cadastro.getLeituraKvarKqh()+", '"+cadastro.getObs()+"', "+cadastro.getDisjuntor()+", '"+cadastro.getLacreKwh()+"', "
				+ " '"+cadastro.getLacreKvarh()+"', '"+cadastro.getDigMedKvarh()+"', '"+cadastro.getLacre1()+"', '"+cadastro.getLacre2()+"', "
				+ " '"+cadastro.getLacre3()+"', '"+cadastro.getConsProx()+"', "+cadastro.getFrente()+", '"+cadastro.getTensao()+"', "
				+ " '"+cadastro.getTributos()+"', '"+cadastro.getFaseRede()+"', '"+cadastro.getIe()+"', '"+cadastro.getOrgaoExpedidor()+"', "
				+ " '"+cadastro.getOutroDocumento()+"', '"+cadastro.getNome()+"', "
				+ " '"+ServiceFactory.getApoioservice().converteDataBanco(cadastro.getDataNascimento())+"', '"+cadastro.getFoneResidencial()+"',"
				+ " '"+cadastro.getFoneComercial()+"', '"+cadastro.getFoneCelular()+"', '"+cadastro.getEmail()+"', = '"+cadastro.getCpfCnpj()+"', "
				+ " '"+cadastro.getSenha()+"', '"+cadastro.getVencimento().getId()+"', "+cadastro.getConsumoExtra()+", "
				+ " '"+ServiceFactory.getApoioservice().converteDataBanco(cadastro.getDataTroca())+"', '"+cadastro.getMensagem()+"', "
				+ " '"+cadastro.getBr_Hxl()+"', '"+cadastro.getTipo()+"', '"+cadastro.getTensaoNominal()+"', "+cadastro.getRamalLigacao().getId()+", "
				+ " '"+cadastro.getAlimentador()+"', "+cadastro.getRota()+", '"+cadastro.getDiaVencimento()+"', '"+cadastro.getSexo()+"', "
				+ " '"+cadastro.getTituloEleitor()+"', '"+cadastro.getEstado().getSigla()+"', '"+cadastro.getMunicipioIbge().getId()+"', "
				+ " "+cadastro.getPais().getId()+", '"+cadastro.getIeAuxiliar()+"', "+cadastro.getRamalRural()+", "+cadastro.getRamalComercial()+","
				+ " '"+cadastro.getNomePai()+"', '"+cadastro.getNomeMae()+"', '"+cadastro.getContaBanco()+"',"
				+ " '"+ServiceFactory.getApoioservice().converteDataBanco(cadastro.getDataCadastro())+"', "+cadastro.getCliente().getId()+","
				+ " '"+ServiceFactory.getApoioservice().converteDataBanco(cadastro.getDataUltimaVistoria())+"', "
				+ " '"+ServiceFactory.getApoioservice().converteDataBanco(cadastro.getDataInclusao())+"', "
				+ " '"+ServiceFactory.getApoioservice().converteDataBanco(cadastro.getDataEnvioScs())+"', "+cadastro.getNreCoRes()+","
				+ " "+cadastro.getNreCoCom()+", "+cadastro.getNreCoInd()+", "+cadastro.getNreCoPp()+", '"+cadastro.getTarRes()+"', "
				+ " '"+cadastro.getTarCom()+"',  = '"+cadastro.getTarInd()+"',  = '"+cadastro.getTarPp()+"', '"+cadastro.getMesFat()+"',"
				+ " '"+cadastro.getAnoFat()+"', '"+cadastro.getIsentaLixo()+"', '"+cadastro.getLacrado()+"', "+cadastro.getId()+") ";
		try {
			st = conexao.connect().createStatement();
			result = st.executeUpdate(query);
			conexao.connect().close();
		} catch ( SQLException e ) {
			e.printStackTrace();
		}
		return result;
	}

	@Override
	public int alterarCadastro(Cadastro cadastro) throws Exception {
		int result = -1;
		String query = "UPDATE CADASTROS  SET PRO_NUMERO = "+cadastro.getProprietario().getId()+", CON_NUMERO = '"+cadastro.getConjunto().getNumero()+"', "
				+ " SIT_CODIGO = "+cadastro.getSituacaoCadastro().getId()+", CLA_CHAVE = '"+cadastro.getClassificacao().getChave()+"', "
				+ " AGE_CHAVE = "+cadastro.getAgencia().getChave()+"', BAI_NUMERO = "+cadastro.getBairro().getId()+", "
				+ " RUA_NUMERO = "+cadastro.getRua().getId()+", SET_CHAVE = '"+cadastro.getSetor().getChave()+"', "
				+ " ATV_CODIGO = '"+cadastro.getAtividade().getId()+"', CAD_INSTAL = '"+cadastro.getInstal()+"', CAD_CASA = '"+cadastro.getCasa()+"', "
				+ " CAD_APTO = '"+cadastro.getApto()+"', CAD_CTABCO = '"+cadastro.getContaBanco()+"', CAD_MEDKWH = '"+cadastro.getMedKwh()+"', "
				+ " CAD_MEDKVAR = '"+cadastro.getMedKvar()+"', CAD_FATPOT = "+cadastro.getFatorPotencia()+", CAD_LEITURA = "+cadastro.getLeitura()+", "
				+ " CAD_LEITURADESLIG = "+cadastro.getLeituraDesligado()+", CAD_DTALIG = '"+cadastro.getDataLig()+"', "
				+ " CAD_DTADESLIG = '"+cadastro.getDataDeslig()+"', CAD_ROTEIRO = "+cadastro.getRoteiro()+", CAD_LIVRO = '"+cadastro.getLivro()+"', "
				+ " CAD_KWHCONTR = "+cadastro.getKwhContratado()+", CAD_VIP = '"+cadastro.getVip()+"', CAD_DV = '"+cadastro.getDv()+"', "
				+ " CAD_RETENCAO = '"+cadastro.getRetencao()+"', CAD_ISENTAECT = '"+cadastro.getIsentaEct()+"', CAD_LAMPADA = '"+cadastro.getLampada()+"', "
				+ " CAD_LOCALIZ = '"+cadastro.getLocaliz()+"', CAD_COMPLE = '"+cadastro.getComple()+"', CAD_RAMAL = '"+cadastro.getRamal()+"', "
				+ " CAD_METRAGEM = "+cadastro.getMetragem()+", CAD_DIGMED = '"+cadastro.getDigMed()+"', CAD_VOLTAGEM = '"+cadastro.getVoltagem()+"', "
				+ " CAD_MULTA = '"+cadastro.getMulta()+"', CAD_DESCONTO = '"+cadastro.getDesconto()+"', CAD_CARGAINST = "+cadastro.getCargaInstalada()+", "
				+ " CAD_LEITURAKVARKQH = "+cadastro.getLeituraKvarKqh()+", CAD_OBS = '"+cadastro.getObs()+"', CAD_DISJUNTOR = "+cadastro.getDisjuntor()+", "
				+ " CAD_LACREKWH = '"+cadastro.getLacreKwh()+"', CAD_LACREKVARH = '"+cadastro.getLacreKvarh()+"', "
				+ " CAD_DIGMEDKVARH = '"+cadastro.getDigMedKvarh()+"', CAD_LACRE1 = '"+cadastro.getLacre1()+"', CAD_LACRE2 = '"+cadastro.getLacre2()+"', "
				+ " CAD_LACRE3 = '"+cadastro.getLacre3()+"', CAD_CONSPROX = '"+cadastro.getConsProx()+"', CAD_FRENTE = "+cadastro.getFrente()+", "
				+ " CAD_TENSAO = '"+cadastro.getTensao()+"', CAD_TRIBUTOS = '"+cadastro.getTributos()+"', CAD_FASEREDE = '"+cadastro.getFaseRede()+"', "
				+ " CAD_IE = '"+cadastro.getIe()+"', CAD_ORGAOEXP = '"+cadastro.getOrgaoExpedidor()+"' , CAD_OUTRODOC = '"+cadastro.getOutroDocumento()+"', "
				+ " CAD_NOME = '"+cadastro.getNome()+"', CAD_DATANASC = '"+ServiceFactory.getApoioservice().converteDataBanco(cadastro.getDataNascimento())+"', "
				+ " CAD_FONERES = '"+cadastro.getFoneResidencial()+"', CAD_FONECOM = '"+cadastro.getFoneComercial()+"', "
				+ " CAD_FONECELULAR = '"+cadastro.getFoneCelular()+"', CAD_EMAIL = '"+cadastro.getEmail()+"', "
				+ " CAD_CNPJ_CPF = '"+cadastro.getCpfCnpj()+"', CAD_SENHA = '"+cadastro.getSenha()+"', VEN_CODIGO = '"+cadastro.getVencimento().getId()+"', "
				+ " CAD_CONSUMOEXTRA = "+cadastro.getConsumoExtra()+", "
				+ " CAD_DATATROCA = '"+ServiceFactory.getApoioservice().converteDataBanco(cadastro.getDataTroca())+"', "
				+ " CAD_MENSAGEM = '"+cadastro.getMensagem()+"', CAD_BR_HXL = '"+cadastro.getBr_Hxl()+"', CAD_TIPO = '"+cadastro.getTipo()+"', "
				+ " CAD_TENSAONOMINAL = '"+cadastro.getTensaoNominal()+"', RAM_NUMERO = "+cadastro.getRamalLigacao().getId()+", "
				+ " CAD_ALIMENTADOR = '"+cadastro.getAlimentador()+"', CAD_ROTA = "+cadastro.getRota()+", DIAVENCIMENTO = '"+cadastro.getDiaVencimento()+"', "
				+ " CAD_SEXO = '"+cadastro.getSexo()+"', CAD_TITULOELEITOR = '"+cadastro.getTituloEleitor()+"', "
				+ " EST_SIGLA = '"+cadastro.getEstado().getSigla()+"', MUI_CODIGO = '"+cadastro.getMunicipioIbge().getId()+"', "
				+ " PAI_NUMERO = "+cadastro.getPais().getId()+", CAD_IEAUX = '"+cadastro.getIeAuxiliar()+"', "
				+ " CAD_RAMALRURAL = "+cadastro.getRamalRural()+", CAD_RAMALCOMERCIAL = "+cadastro.getRamalComercial()+", "
				+ " CAD_NOMEPAI = '"+cadastro.getNomePai()+"', CAD_NOMEMAE = '"+cadastro.getNomeMae()+"', CAD_CONTATO = '"+cadastro.getContaBanco()+"', "
				+ " CAD_DTACADASTRO = '"+ServiceFactory.getApoioservice().converteDataBanco(cadastro.getDataCadastro())+"', "
				+ " CLI_NUMERO = "+cadastro.getCliente().getId()+", "
				+ " CAD_DTAULTVISTORIA = '"+ServiceFactory.getApoioservice().converteDataBanco(cadastro.getDataUltimaVistoria())+"', "
				+ " CAD_DTAINCLUSAO = '"+ServiceFactory.getApoioservice().converteDataBanco(cadastro.getDataInclusao())+"', "
				+ " CAD_DATA_ENVIO_SCS = '"+ServiceFactory.getApoioservice().converteDataBanco(cadastro.getDataEnvioScs())+"', "
				+ " CAD_NRECORES = "+cadastro.getNreCoRes()+", CAD_NRECOCOM = "+cadastro.getNreCoCom()+", CAD_NRECOIND = "+cadastro.getNreCoInd()+", "
				+ " CAD_NRECOPP = "+cadastro.getNreCoPp()+", CAD_TARRES = '"+cadastro.getTarRes()+"', CAD_TARCOM = '"+cadastro.getTarCom()+"', "
				+ " CAD_TARIND = '"+cadastro.getTarInd()+"', CAD_TARPP = '"+cadastro.getTarPp()+"', CAD_MESFAT = '"+cadastro.getMesFat()+"', "
				+ " CAD_ANOFAT = '"+cadastro.getAnoFat()+"', CAD_ISENTALIXO = '"+cadastro.getIsentaLixo()+"', CAD_LACRADO = '"+cadastro.getLacrado()+"', "
				+ " ID = "+cadastro.getId()+" WHERE CAD_CHAVE = '"+cadastro.getChave()+"' ";
		try {
			st = conexao.connect().createStatement();
			result = st.executeUpdate(query);
			conexao.connect().close();
		} catch ( SQLException e ) {
			e.printStackTrace();
		}
		return result;
	}

	@Override
	public int excluirCadastro(Cadastro cadastro) throws Exception {
		int result = -1;
		String query = "DELETE FROM CADASTROS WHERE CAD_CHAVE = "+cadastro.getChave()+" ";
		try {
			st = conexao.connect().createStatement();
			result = st.executeUpdate(query);
			conexao.connect().close();
		} catch ( SQLException e ) {
			e.printStackTrace();
		}
		return result;
	}

	@Override
	public ResultSet pesquisarCadastros() throws Exception {
		ResultSet rs = null;
		String query = "SELECT * FROM CADASTROS";
		try {
			st = conexao.connect().createStatement();
			rs = st.executeQuery(query);
			conexao.connect().close();
			return rs;
		} catch ( SQLException e ) {
			e.printStackTrace();
		}
		return rs;
	}

	@Override
	public ResultSet pesquisarCadastro(String chave) throws Exception {
		ResultSet rs = null;
		String query = "SELECT * FROM CADASTROS WHERE CAD_CHAVE = "+chave+" ";
		try {
			st = conexao.connect().createStatement();
			rs = st.executeQuery(query);
			conexao.connect().close();
			return rs;
		} catch ( SQLException e ) {
			e.printStackTrace();
		}
		return rs;
	}

}
