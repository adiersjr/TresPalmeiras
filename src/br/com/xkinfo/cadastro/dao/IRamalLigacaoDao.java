package br.com.xkinfo.cadastro.dao;

import java.sql.ResultSet;
import br.com.xkinfo.cadastro.model.RamalLigacao;

public interface IRamalLigacaoDao {
	
	public int incluirRamalLigacao(RamalLigacao ramalLigacao) throws Exception;
	
	public int alterarRamalLigacao(RamalLigacao ramalLigacao) throws Exception;
	
	public int excluirRamalLigacao(RamalLigacao ramalLigacao) throws Exception;
	
	public ResultSet pesquisarRamalLigacoes() throws Exception;
	
	public ResultSet pesquisarRamalLigacao(int id) throws Exception;

}
