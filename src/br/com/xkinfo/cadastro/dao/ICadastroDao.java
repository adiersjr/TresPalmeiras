package br.com.xkinfo.cadastro.dao;

import java.sql.ResultSet;
import br.com.xkinfo.cadastro.model.Cadastro;

public interface ICadastroDao {

	public int incluirCadastro(Cadastro cadastro) throws Exception;

	public int alterarCadastro(Cadastro cadastro) throws Exception;

	public int excluirCadastro(Cadastro cadastro) throws Exception;

	public ResultSet pesquisarCadastros() throws Exception;

	public ResultSet pesquisarCadastro(int id) throws Exception;

}
