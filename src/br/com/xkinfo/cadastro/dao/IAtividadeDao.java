package br.com.xkinfo.cadastro.dao;

import java.sql.ResultSet;

import br.com.xkinfo.cadastro.model.Atividade;

public interface IAtividadeDao {
	
	public int incluirAtividade(Atividade atividade) throws Exception;
	
	public int alterarAtividade(Atividade atividade) throws Exception;
	
	public int excluirAtividade(Atividade atividade) throws Exception;
	
	public ResultSet pesquisarAtividades() throws Exception;
	
	public ResultSet pesquisarAtividade(String id) throws Exception;

}
