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
