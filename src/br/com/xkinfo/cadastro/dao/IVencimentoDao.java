package br.com.xkinfo.cadastro.dao;

import java.sql.ResultSet;

import br.com.xkinfo.cadastro.model.Vencimento;

public interface IVencimentoDao {
	
	public int incluirVencimento(Vencimento vencimento) throws Exception;
	
	public int alterarVencimento(Vencimento vencimento) throws Exception;
	
	public int excluirVencimento(Vencimento vencimento) throws Exception;
	
	public ResultSet pesquisarVencimentos() throws Exception;
	
	public ResultSet pesquisarVencimento(int id) throws Exception;

}
