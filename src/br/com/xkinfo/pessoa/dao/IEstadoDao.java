package br.com.xkinfo.pessoa.dao;

import java.sql.ResultSet;

import br.com.xkinfo.endereco.model.Estado;
import br.com.xkinfo.endereco.model.Pais;

public interface IEstadoDao {
	
	public int incluirEstado(Estado estado) throws Exception;

	public int alterarEstado(Estado estado) throws Exception;

	public int excluirEstado(Estado estado) throws Exception;

	public ResultSet pesquisaEstados() throws Exception;

	public ResultSet pesquisaNome(String nome) throws Exception;
	
	public ResultSet pesquisaSigla(String sigla) throws Exception;
	
	public ResultSet pesquisaPais(Pais pais) throws Exception;

	public ResultSet pesquisaEstado(int id) throws Exception;

}
