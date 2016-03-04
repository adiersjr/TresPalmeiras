package br.com.xkinfo.pessoa.dao;

import java.sql.ResultSet;

import br.com.xkinfo.pessoa.model.Cliente;

public interface IClienteDao {
	
	public int incluirCliente(Cliente cliente) throws Exception;

	public int alterarCliente(Cliente cliente) throws Exception;

	public int excluirCliente(Cliente cliente) throws Exception;

	public ResultSet pesquisaClientes() throws Exception;
	
	public ResultSet pesquisaCliente(int id) throws Exception;
}
