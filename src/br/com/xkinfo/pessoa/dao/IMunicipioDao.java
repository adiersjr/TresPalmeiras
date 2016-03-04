package br.com.xkinfo.pessoa.dao;

import java.sql.ResultSet;

import br.com.xkinfo.pessoa.model.Estado;
import br.com.xkinfo.pessoa.model.Municipio;

public interface IMunicipioDao {
	
	public int incluirMunicipio(Municipio municipio) throws Exception;

	public int alterarMunicipio(Municipio municipio) throws Exception;

	public int excluirMunicipio(Municipio municipio) throws Exception;

	public ResultSet pesquisaMunicipios() throws Exception;

	public ResultSet pesquisaNome(String nome) throws Exception;

	public ResultSet pesquisaCep(String cep) throws Exception;
	
	public ResultSet pesquisaEstado(Estado estado) throws Exception;
	
	public ResultSet pesquisaIbge(String codIbge) throws Exception;
	
	public ResultSet pesquisaMunicipio(int id) throws Exception;

}
