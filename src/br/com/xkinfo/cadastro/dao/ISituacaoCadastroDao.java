package br.com.xkinfo.cadastro.dao;

import java.sql.ResultSet;

import br.com.xkinfo.cadastro.model.SituacaoCadastro;

public interface ISituacaoCadastroDao {
	
	public int incluirSituacaoCadastro(SituacaoCadastro situacaoCadastro) throws Exception;
	
	public int alterarSituacaoCadastro(SituacaoCadastro situacaoCadastro) throws Exception;
	
	public int excluitSituacaoCadastro(SituacaoCadastro situacaoCadastro) throws Exception;
	
	public ResultSet pesquisarSituacaoCadastros() throws Exception;
	
	public ResultSet pesquisarSituacaoCadastro(int id) throws Exception;

}
