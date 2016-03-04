package br.com.xkinfo.pessoa.dao;

import java.sql.ResultSet;

import br.com.xkinfo.pessoa.model.Funcionario;

public interface IFuncionarioDao {

	public int incluirFuncionario(Funcionario funcionario) throws Exception;

	public int alterarFuncionario(Funcionario funcionario) throws Exception;

	public int excluirFuncionario(Funcionario funcionario) throws Exception;

	public ResultSet pesquisaFuncionarios() throws Exception;

	public ResultSet pesquisaNome(String nome) throws Exception;

	public ResultSet pesquisaUsuario(String usuario) throws Exception;
	
	public ResultSet pesquisaFuncionario(int id) throws Exception;
}
