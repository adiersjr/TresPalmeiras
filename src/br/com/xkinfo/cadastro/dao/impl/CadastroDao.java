package br.com.xkinfo.cadastro.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import br.com.xkinfo.cadastro.dao.ICadastroDao;
import br.com.xkinfo.cadastro.model.Cadastro;
import br.com.xkinfo.util.Conexao;

public class CadastroDao implements ICadastroDao{
	
	Conexao conexao = new Conexao();
	private Statement st;

	@Override
	public int incluirCadastro(Cadastro cadastro) throws Exception {
		int result = -1;
		String query = "INSERT INTO CADASTROS (PRO_NUMERO, CON_NUMERO, SIT_CODIGO, CLA_CHAVE, AGE_CHAVE, BAI_NUMERO, RUA_NUMERO, SET_CHAVE, ATV_CODIGO, CAD_INSTAL, CAD_CASA, CAD_APTO, CAD_CTABCO, CAD_MEDKWH, CAD_MEDKVAR, CAD_FATPOT, CAD_LEITURA, CAD_LEITURADESLIG, CAD_DTALIG, CAD_DTADESLIG, CAD_ROTEIRO, CAD_LIVRO, CAD_KWHCONTR, CAD_VIP, CAD_DV, CAD_RETENCAO, CAD_ISENTAECT, CAD_LAMPADA, CAD_LOCALIZ, CAD_COMPLE, CAD_RAMAL, CAD_METRAGEM, CAD_DIGMED, CAD_VOLTAGEM, CAD_MULTA, CAD_DESCONTO, CAD_CARGAINST, CAD_LEITURAKVARKQH, CAD_OBS, CAD_DISJUNTOR, CAD_LACREKWR, CAD_LACREKVARH, CAD_LACREDIGMEDKVARH, CAD_LACRE1, CAD_LACRE2, CAD_LACRE3, CAD_CONSPROX, CAD_FRENTE, CAD_TENSAO, CAD_TRIBUTOS, CAD_FASEREDE, CAD_IE, CAD_ORGAOEXP, CAD_OUTRODOC, CAD_NOME, CAD_DATANASC, CAD_FONERES, CAD_FONECOM, CAD_FONECELULAR, CAD_EMAIL, CAD_CNPJ_CPF, CAD_SENHA, VEN_CODIGO, CAD_CONSUMOEXTRA, CAD_DATATROCA, CAD_MENSAGEM, CAD_BR_HXL, CAD_TIPO, CAD_TENSAONOMINAL, RAM_NUMERO, CAD_ALIMENTADOR, CAD_ROTA, DIAVENCIMENTO, CAD_SEXO, CAD_TITULOELEITOR, EST_SIGLA, MUI_CODIGO, CAD_PAINUMERO, CAD_IEAUX, CAD_RAMALRURAL, CAD_RAMACOMERCIAL, CAD_NOMEPAI, CAD_NOMEMAE, CAD_CONTATO, CAD_DTACADASTRO, CLI_NUMERO, CAD_DTAULTVISTORIA, CAD_DTAINCLUSAO, CAD_DATA_ENVIO_SCS, CAD_NRECORES, CAD_NRECOCOM, CAD_NRECOIND, CAD_NRECOPP, CAD_TARRES, CAD_TARCOM, CAD_TARIND, CAD_TARPP, CAD_MESFAT, CAD_ANOFAT, CAD_ISENTALIXO, CAD_LACRADO, ID)"
				+ " VALUES () ";
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
		String query = "INSERT INTO ATIVIDADES (ATV_DESCRICAO, ATV_GRUPOANEEL, ATV_NUMERO, GRA_CODIGO, ATV_EPE) "
				+ " VALUES () ";
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
