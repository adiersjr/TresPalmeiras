package br.com.xkinfo.cadastro.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import br.com.xkinfo.cadastro.dao.IClassificacaoDao;
import br.com.xkinfo.cadastro.model.Classificacao;
import br.com.xkinfo.service.ServiceFactory;
import br.com.xkinfo.util.Conexao;

public class ClassificacaoDao implements IClassificacaoDao{

	Conexao conexao = new Conexao();
	private Statement st;

	@Override
	public int incluirClassificacao(Classificacao classificacao) throws Exception {
		int result = -1;
		String query = "INSERT INTO CLASSIFICACAO (CLA_CHAVE, CLA_TIPO, CLA_ATIVIDADE, CLA_TIPOFORN, CLA_FASE, CLA_ILUMPUB, CLA_TARIFA, CLA_DESCCLASSE, "
				+ " CLA_DESCATIVIDADE, CLA_DESCTIPOFORN, CLA_DESCFASE, CLA_DESCILUM, CLA_DESCTARIFA, CLA_ALIQ, CLA_DESATIVADO, CLA_TN, CLA_TN_INF, "
				+ "CLA_TN_SUP, CLA_SUBGRUPO, CLA_PADRAO) "
				+ " VALUES ('"+classificacao.getChave()+"', '"+classificacao.getTipo()+"', '"+classificacao.getAtividade()+"', "
				+ " '"+classificacao.getTipoFornecedor()+"', '"+classificacao.getFase()+"', '"+classificacao.getIluminacaoPublica()+"', "
				+ " '"+classificacao.getTarifa()+"', '"+classificacao.getDescricaoClasse()+"', '"+classificacao.getDescricaoAtividade()+"', "
				+ " '"+classificacao.getDescricaoTipoFornecedor()+"', '"+classificacao.getDescricaoFase()+"', '"+classificacao.getDescricaoIluminacao()+"', "
				+ " '"+classificacao.getDescricaoTarifa()+"', "+classificacao.getAliquota()+", "
				+ " "+ServiceFactory.getApoioservice().converteBoolean(classificacao.isDesativado())+", '"+classificacao.getTn()+"', "
				+ " '"+classificacao.getTn_inf()+"', '"+classificacao.getTn_sup()+"', '"+classificacao.getSubgrupo()+"', "
				+ " "+ServiceFactory.getApoioservice().converteBoolean(classificacao.isPadrao())+") ";
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
	public int alterarClassificacao(Classificacao classificacao) throws Exception {
		int result = -1;
		String query = "UPDATE CLASSIFICACAO SET CLA_CHAVE = '"+classificacao.getChave()+"', CLA_TIPO = '"+classificacao.getTipo()+"', "
				+ " CLA_ATIVIDADE = '"+classificacao.getAtividade()+"', CLA_TIPOFORN = '"+classificacao.getTipoFornecedor()+"', "
				+ " CLA_FASE = '"+classificacao.getFase()+"', CLA_ILUMPUB = '"+classificacao.getIluminacaoPublica()+"', "
				+ " CLA_TARIFA = '"+classificacao.getTarifa()+"', CLA_DESCCLASSE =  '"+classificacao.getDescricaoClasse()+"', "
				+ " CLA_DESCATIVIDADE = '"+classificacao.getDescricaoAtividade()+"', CLA_DESCTIPOFORN = '"+classificacao.getDescricaoTipoFornecedor()+"', "
				+ " CLA_DESCFASE = '"+classificacao.getDescricaoFase()+"', CLA_DESCILUM = '"+classificacao.getDescricaoIluminacao()+"', "
				+ " CLA_DESCTARIFA = '"+classificacao.getDescricaoTarifa()+"', CLA_ALIQ = "+classificacao.getAliquota()+", "
				+ " CLA_DESATIVADO = "+ServiceFactory.getApoioservice().converteBoolean(classificacao.isDesativado())+", "
				+ " CLA_TN = '"+classificacao.getTn()+"', CLA_TN_INF = '"+classificacao.getTn_inf()+"', "
				+ "CLA_TN_SUP = '"+classificacao.getTn_sup()+"', CLA_SUBGRUPO = '"+classificacao.getSubgrupo()+"', "
				+ " CLA_PADRAO = "+ServiceFactory.getApoioservice().converteBoolean(classificacao.isPadrao())+" WHERE ID = "+classificacao.getId()+" ";
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
	public int excluirClassificacao(Classificacao classificacao) throws Exception {
		int result = -1;
		String query = "DELETE FROM CLASSIFICACAO WHERE ID = "+classificacao.getId()+" ";
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
	public ResultSet pesquisarClassificacoes() throws Exception {
		ResultSet rs = null;
		String query = "SELECT * FROM CLASSIFICACAO";
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
	public ResultSet pesquisarClassificacao(int id) throws Exception {
		ResultSet rs = null;
		String query = "SELECT * FROM CLASSIFICACAO WHERE ID = "+id+" ";
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
	public ResultSet pesquisarClassificacao(String chave) throws Exception {
		ResultSet rs = null;
		String query = "SELECT * FROM CLASSIFICACAO WHERE CLA_CHAVE = "+chave+" ";
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
