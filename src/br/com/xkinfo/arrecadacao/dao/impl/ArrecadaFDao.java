package br.com.xkinfo.arrecadacao.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import br.com.xkinfo.arrecadacao.dao.IArrecadaFDao;
import br.com.xkinfo.arrecadacao.model.ArrecadaF;
import br.com.xkinfo.arrecadacao.model.Banco;
import br.com.xkinfo.cadastro.model.Cadastro;
import br.com.xkinfo.util.Conexao;

public class ArrecadaFDao implements IArrecadaFDao{

	Conexao conexao = new Conexao();
	private Statement st;
	
	@Override
	public int incluirArrecadaF(ArrecadaF arrecadaF) throws Exception {
		int result = -1;
		String query = "INSERT INTO ARRECADA_F (RET_RETORNO, FAT_CHAVE, ARF_CODCLI, ARF_BANCO, ARF_AGENCIA, ARF_CC, ARF_DTAVCTO, ARF_DTACREDITO, ARF_VLRREC,"
		 		+ " ARF_CODBARRAS, ARF_CODMOV, ARF_NSR) VALUES (" + arrecadaF.getRetorno().getId() + ",'" + arrecadaF.getFatura() + "','" + arrecadaF.getCadastro().getChave() + "',"
				+ arrecadaF.getBanco().getNumero() + ",'" + arrecadaF.getAgencia().getNumero() + "','" + arrecadaF.getContaCorrrente() + "','" 
			    + arrecadaF.getDataVencimento() + "','" + arrecadaF.getDataCredito() + "','"+ arrecadaF.getValorFatura() + "','" + arrecadaF.getCodigoBarras() + "',"
			    + arrecadaF.getCodigoMovimentacao() + "," + arrecadaF.getNsr() + ") ";
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
	public ResultSet pesquisaArrecadaFs() throws Exception {
		ResultSet rs = null;
		String query = "SELECT * FROM ARRECADA_F";
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
	public ResultSet pesquisaArrecadaFs(Banco banco) throws Exception {
		ResultSet rs = null;
		String query = "SELECT * FROM ARRECADA_F WHERE LEFT(ARF_AGENCIA,3) = '"+ banco.getNumero() +"' ";
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
	public ResultSet pesquisaArrecadaF(int nsr) throws Exception {
		ResultSet rs = null;
		String query = "SELECT * FROM ARRECADA_F WHERE ARF_NSR = "+ nsr +" )";
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
	public ResultSet pesquisaArrecadaF(Cadastro cadastro) throws Exception {
		ResultSet rs = null;
		String query = "SELECT * FROM ARRECADA_F WHERE ARF_CODCLI = "+cadastro.getChave()+" )";
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
