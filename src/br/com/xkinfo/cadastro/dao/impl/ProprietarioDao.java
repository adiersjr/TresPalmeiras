package br.com.xkinfo.cadastro.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import br.com.xkinfo.cadastro.dao.IProprietarioDao;
import br.com.xkinfo.cadastro.model.Proprietario;
import br.com.xkinfo.service.ServiceFactory;
import br.com.xkinfo.util.Conexao;

public class ProprietarioDao implements IProprietarioDao{

	Conexao conexao = new Conexao();
	private Statement st;

	@Override
	public int incluirProprietario(Proprietario proprietario) throws Exception {
		int result = -1;
		String query = "INSERT INTO PROPRIETARIOS (PRO_NOME, PRO_CNPJ_CPF, PRO_FONE, PRO_MUNICIPIO, PRO_ENDERECO, PRO_OBS, PRO_COMPLEMENTO, PRO_BAIRRO, "
				+ " PRO_CEP, PRO_OBS1, PRO_DTAPROC, EST_SIGLA) "
				+ " VALUES ( '"+proprietario.getNome()+"', '"+proprietario.getCnpjCpf()+"', '"+proprietario.getTelefone()+"', '"+proprietario.getMunicipio()+"', "
				+ " '"+proprietario.getEndereco()+"', '"+proprietario.getObs()+"', '"+proprietario.getComplemento()+"', '"+proprietario.getBairro()+"', "
				+ " '"+proprietario.getCep()+"', '"+proprietario.getObs1()+"', '"+ServiceFactory.getApoioservice().converteDataBanco(proprietario.getDataProcessamento())+"', "
				+ " '"+proprietario.getEstado().getSigla()+"') "
				+ "  ";
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
	public int alterarProprietario(Proprietario proprietario) throws Exception {
		int result = -1;
		String query = "UPDATE PROPRIETARIOS SET PRO_NOME = '"+proprietario.getNome()+"', PRO_CNPJ_CPF = '"+proprietario.getCnpjCpf()+"', "
				+ " PRO_FONE = '"+proprietario.getTelefone()+"', PRO_MUNICIPIO = '"+proprietario.getMunicipio()+"', PRO_ENDERECO = '"+proprietario.getEndereco()+"', "
				+ " PRO_OBS = '"+proprietario.getObs()+"', PRO_COMPLEMENTO = '"+proprietario.getComplemento()+"', PRO_BAIRRO = '"+proprietario.getBairro()+"', "
				+ " PRO_CEP = '"+proprietario.getCep()+"', PRO_OBS1 = '"+proprietario.getObs1()+"', "
				+ " PRO_DTAPROC = '"+ServiceFactory.getApoioservice().converteDataBanco(proprietario.getDataProcessamento())+"', "
				+ " EST_SIGLA = '"+proprietario.getEstado().getSigla()+"' WHERE PRO_NUMERO = "+proprietario.getId()+" ";
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
	public int excluirProprietario(Proprietario proprietario) throws Exception {
		int result = -1;
		String query = "DELETE FROM PROPRIETARIOS WHERE PRO_NUMERO = "+proprietario.getId()+" ";
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
	public ResultSet pesquisarProprietarios() throws Exception {
		ResultSet rs = null;
		String query = "SELECT * FROM PROPRIETARIOS";
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
	public ResultSet pesquisarProprietario(int id) throws Exception {
		ResultSet rs = null;
		String query = "SELECT * FROM PROPRIETARIOS WHERE PRO_NUMERO = "+id+" ";
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
