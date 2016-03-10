package br.com.xkinfo.cadastro.dao;

import java.sql.ResultSet;
import br.com.xkinfo.cadastro.model.Contribuicao;

public interface IContribuicaoDao {
	
	public int incluirContribuicao(Contribuicao contribuicao) throws Exception;
	
	public int alterarContribuicao(Contribuicao contribuicao) throws Exception;
	
	public int excluirContribuicao(Contribuicao contribuicao) throws Exception;
	
	public ResultSet pesquisarContribuicoes() throws Exception;
	
	public ResultSet pesquisarContribuicao(int id) throws Exception;

}
