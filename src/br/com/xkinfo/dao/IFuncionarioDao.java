package br.com.xkinfo.dao;

import java.sql.ResultSet;

import br.com.xkinfo.model.Funcionario;

public interface IFuncionarioDao {

	public int incluirFuncionario(Funcionario funcionario) throws Exception;

	public int alterarFuncionario(Funcionario funcionario) throws Exception;

	public int excluirFuncionario(Funcionario funcionario) throws Exception;

	public ResultSet pesquisaFuncionarios() throws Exception;

	public ResultSet pesquisaNome(String nome) throws Exception;

	public ResultSet pesquisaUsuario(String usuario) throws Exception;
	
	public Funcionario pesquisaFuncionario(int id) throws Exception;
}
