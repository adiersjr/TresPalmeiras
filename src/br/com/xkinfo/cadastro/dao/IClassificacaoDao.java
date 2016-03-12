package br.com.xkinfo.cadastro.dao;

import java.sql.ResultSet;

import br.com.xkinfo.cadastro.model.Classificacao;

public interface IClassificacaoDao {
	
	public int incluirClassificacao(Classificacao classificacao) throws Exception;
	
	public int alterarClassificacao(Classificacao classificacao) throws Exception;
	
	public int excluirClassificacao(Classificacao classificacao) throws Exception;
	
	public ResultSet pesquisarClassificacoes() throws Exception;
	
	public ResultSet pesquisarClassificacao(int id) throws Exception;
	
	public ResultSet pesquisarClassificacao(String chave) throws Exception;

}
