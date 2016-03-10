package br.com.xkinfo.cadastro.dao;

import java.sql.ResultSet;
import br.com.xkinfo.cadastro.model.Setor;

public interface ISetorDao {
	
	public int incluirSetor(Setor setor) throws Exception;
	
	public int alterarSetor(Setor setor) throws Exception;
	
	public int excluirSetor(Setor setor) throws Exception;
	
	public ResultSet pesquisarSetores() throws Exception;
	
	public ResultSet pesquisarSetor(int id) throws Exception;

}
