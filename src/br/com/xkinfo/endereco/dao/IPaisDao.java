package br.com.xkinfo.endereco.dao;

import java.sql.ResultSet;

import br.com.xkinfo.endereco.model.Pais;

public interface IPaisDao {

	public int incluirPais(Pais pais) throws Exception;

	public int alterarPais(Pais pais) throws Exception;

	public int excluirPais(Pais pais) throws Exception;

	public ResultSet pesquisaPaises() throws Exception;

	public ResultSet pesquisaNome(String nome) throws Exception;

	public ResultSet pesquisaPais(int id) throws Exception;

}
