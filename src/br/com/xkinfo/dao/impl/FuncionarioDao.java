package br.com.xkinfo.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import br.com.xkinfo.dao.IFuncionarioDao;
import br.com.xkinfo.model.Funcionario;
import br.com.xkinfo.util.Conexao;

public class FuncionarioDao implements IFuncionarioDao {
	
	Conexao conexao = new Conexao();
	private Statement st;

	@Override
	public int incluirFuncionario(Funcionario funcionario) throws Exception {
		int result = -1;
		String query;
		Integer boolSituacao = null;
		if (funcionario.isSituacao() == true){
			boolSituacao = 1;
		}
		if (funcionario.isSituacao() == false) {
			boolSituacao = 0;
		}
		SimpleDateFormat sdf = new SimpleDateFormat();
		sdf.applyPattern("yyyy-MM-dd");
		String dia = sdf.format(funcionario.getDataNascimento().getTime());
		Integer boolAcesso = null;
		if (funcionario.isSituacao() == true){
			boolAcesso = 1;
		}
		if (funcionario.isSituacao() == false) {
			boolAcesso = 0;
		}
		
		query = "INSERT INTO FUNCIONARIOS (FUN_NOME, FUN_SITUACAO, FUN_USUARIO, FUN_SENHA, FUN_PATHFOTO, FUN_DATNASC, CAR_NUMERO, FUN_CONTROLEACESSO) ";
		query = query + " VALUES ('"+funcionario.getNome()+"', "+boolSituacao+", '"+funcionario.getUsuario()+"', '"+funcionario.getSenha()+"' " ;
		query = query + ", "+funcionario.getPathFoto()+", '"+dia+"', "+funcionario.getCargo().getId()+", "+boolAcesso+") ";
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
	public int alterarFuncionario(Funcionario funcionario) throws Exception {
		int result = -1;
		String query;
		Integer boolSituacao = null;
		if (funcionario.isSituacao() == true){
			boolSituacao = 1;
		}
		if (funcionario.isSituacao() == false) {
			boolSituacao = 0;
		}
		SimpleDateFormat sdf = new SimpleDateFormat();
		sdf.applyPattern("yyyy-MM-dd");
		String dia = sdf.format(funcionario.getDataNascimento().getTime());
		Integer boolAcesso = null;
		if (funcionario.isSituacao() == true){
			boolAcesso = 1;
		}
		if (funcionario.isSituacao() == false) {
			boolAcesso = 0;
		}
		
		query = "UPDATE FUNCIONARIOS SET FUN_NOME = '"+funcionario.getNome()+"', FUN_SITUACAO = "+boolSituacao+","
				+ "FUN_USUARIO = '"+funcionario.getUsuario()+"', FUN_SENHA = '"+funcionario.getSenha()+"', FUN_PATHFOTO = '"+funcionario.getPathFoto()+"',"
				+ "FUN_DATNASC = '"+dia+"', CAR_NUMERO = "+funcionario.getCargo().getId()+", FUN_CONTROLEACESSO = "+boolAcesso+" "
				+ "WHERE FUN_NUMERO = "+funcionario.getId()+" ";
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
	public int excluirFuncionario(Funcionario funcionario) throws Exception {
		int result = -1;
		String query = "DELETE FROM FUNCIONARIOS WHERE FUN_NUMERO = " + funcionario.getId() + " ";
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
	public ResultSet pesquisaFuncionarios() throws Exception {
		ResultSet rs = null;
		String query = "SELECT * FROM FUNCIONARIOS";
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
	public ResultSet pesquisaNome(String nome) throws Exception {
		ResultSet rs = null;
		String query = "SELECT * FROM FUNCIONARIOS WHERE FUN_NOME LIKE '%"+nome+"%' ";
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
	public ResultSet pesquisaUsuario(String usuario) throws Exception {
		ResultSet rs = null;
		String query = "SELECT * FROM FUNCIONARIOS WHERE FUN_USUARIO LIKE '%"+usuario+"%' ";
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
	public ResultSet pesquisaFuncionario(int id) throws Exception {
		ResultSet rs = null;
		String query = "SELECT * FROM FUNCIONARIOS WHERE FUN_NUMERO = " + id;
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
