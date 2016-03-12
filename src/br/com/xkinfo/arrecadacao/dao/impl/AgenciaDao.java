package br.com.xkinfo.arrecadacao.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import br.com.xkinfo.arrecadacao.dao.IAgenciaDao;
import br.com.xkinfo.arrecadacao.model.Agencia;
import br.com.xkinfo.util.Conexao;

public class AgenciaDao implements IAgenciaDao{
	
	Conexao conexao = new Conexao();
	private Statement st;

	@Override
	public int incluirAgencia(Agencia agencia) throws Exception {
		int result = -1;
		String query = "INSERT INTO AGENCIAS (AGE_CHAVE, BAN_NUMERO, AGE_NUMERO, AGE_NOME, AGE_CONVENIOF, AGE_CONVENIOG, AGE_NSR, "
				+ " AGE_DV, AGE_ENDERECO, AGE_COMPLEMENTO, AGE_BAIRRO, AGE_CEP, AGE_MUNICIPIO, AGE_SIGLA, AGE_DDD, AGE_FONE) "
				+ " VALUES ('"+agencia.getChave()+"', '"+agencia.getBanco().getNumero()+"', '"+agencia.getNumero()+"','"+agencia.getNome()+"', "
				+ " '"+agencia.getConvenioF()+"', '"+agencia.getConvenioG()+"', "+agencia.getNsr()+", '"+agencia.getDigito()+"', "
				+ " '"+agencia.getEndereco()+"', '"+agencia.getComplemento()+"', '"+agencia.getBairro()+"', '"+agencia.getCep()+"', "
				+ "  '"+agencia.getMunicipio()+"', '"+agencia.getEstado().getSigla()+"', "+agencia.getDdd()+", '"+agencia.getTelefone()+"') ";
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
	public int alterarAgencia(Agencia agencia) throws Exception {
		int result = -1;
		String query = "UPDATE AGENCIAS SET AGE_CHAVE = '"+agencia.getChave()+"', BAN_NUMERO = '"+agencia.getBanco().getNumero()+"', "
				+ " AGE_NUMERO = '"+agencia.getNumero()+"', AGE_NOME = '"+agencia.getNome()+"', AGE_CONVENIOF = '"+agencia.getConvenioF()+"', "
				+ " AGE_CONVENIOG = '"+agencia.getConvenioG()+"', AGE_NSR = "+agencia.getNsr()+", AGE_DV =  '"+agencia.getDigito()+"'. "
				+ " AGE_ENDERECO = '"+agencia.getEndereco()+"', AGE_COMPLEMENTO = '"+agencia.getComplemento()+"', AGE_BAIRRO = '"+agencia.getBairro()+"', "
				+ " AGE_CEP = '"+agencia.getCep()+"', AGE_MUNICIPIO = '"+agencia.getMunicipio()+"', AGE_SIGLA = '"+agencia.getEstado().getSigla()+"', "
				+ " AGE_DDD = "+agencia.getDdd()+", AGE_FONE = '"+agencia.getTelefone()+"'  WHERE AGE_CODIGO = "+agencia.getId()+" )";
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
	public int excluirAgencia(Agencia agencia) throws Exception {
		int result = -1;
		String query = "DELETE FROM AGENCIAS WHERE AGE_CODIGO = "+agencia.getId()+" )";
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
	public ResultSet pesquisaAgencias() throws Exception {
		ResultSet rs = null;
		String query = "SELECT * FROM AGENCIAS";
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
	public ResultSet pesquisaAgencia(int id) throws Exception {
		ResultSet rs = null;
		String query = "SELECT * FROM AGENCIAS WHERE AGE_CODIGO = "+id+" )";
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
	public ResultSet pesquisaAgencia(String chave) throws Exception {
		ResultSet rs = null;
		String query = "SELECT * FROM AGENCIAS WHERE AGE_CHAVE = "+chave+" )";
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
