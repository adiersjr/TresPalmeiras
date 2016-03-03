package br.com.xkinfo.dao;

import java.sql.ResultSet;
import br.com.xkinfo.model.Cliente;

public interface IClienteDao {
	
	public int incluirCliente(Cliente cliente) throws Exception;

	public int alterarCliente(Cliente cliente) throws Exception;

	public int excluirCliente(Cliente cliente) throws Exception;

	public ResultSet pesquisaClientes() throws Exception;
	
	public ResultSet pesquisaCliente(int id) throws Exception;
}
