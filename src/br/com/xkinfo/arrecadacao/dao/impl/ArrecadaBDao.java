package br.com.xkinfo.arrecadacao.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import br.com.xkinfo.arrecadacao.dao.IArrecadaBDao;
import br.com.xkinfo.arrecadacao.model.Agencia;
import br.com.xkinfo.arrecadacao.model.ArrecadaB;
import br.com.xkinfo.cadastro.model.Cadastro;
import br.com.xkinfo.util.Conexao;

public class ArrecadaBDao implements IArrecadaBDao {

	Conexao conexao = new Conexao();
	private Statement st;

	@Override
	public int incluirArrecadaB(ArrecadaB arrecadaB) throws Exception {
		int result = -1;
		
		String query = "INSERT INTO ARRECADA_B (CAD_CHAVE, AGE_CHAVE, ARB_CC, ARB_DTAALTERACAO, ARB_NSR, ARB_CODMOV) "
				+ " VALUES ('"+ arrecadaB.getCadastro().getChave() +"', '"+arrecadaB.getAgencia().getChave()+"', '"
				+arrecadaB.getContaCorrente()+"','"+arrecadaB.getDataAlteracao()+"', "+arrecadaB.getNsr()+", '"
				+arrecadaB.getCodigoMovimentacao()+"') ";
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
	public ResultSet pesquisaArrecadaBs() throws Exception {
		ResultSet rs = null;
		String query = "SELECT * FROM ARRECADA_B";
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
	public ResultSet pesquisaArrecadaBs(Agencia agencia) throws Exception {
		ResultSet rs = null;
		String query = "SELECT * FROM ARRECADA_B WHERE LEFT(AGE_CHAVE,3) = '"+ agencia.getBanco().getNumero() +"' ";
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
	public ResultSet pesquisaArrecadaB(int id) throws Exception {
		ResultSet rs = null;
		String query = "SELECT * FROM ARRECADA_B WHERE ARB_CODIGO = "+id+" )";
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
	public ResultSet pesquisaArrecadaB(Cadastro cadastro) throws Exception {
		ResultSet rs = null;
		String query = "SELECT * FROM ARRECADA_B WHERE CAD_CHAVE = "+cadastro.getChave()+" )";
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
