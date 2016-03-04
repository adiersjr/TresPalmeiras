package br.com.xkinfo.pessoa.dao;

import java.sql.ResultSet;

import br.com.xkinfo.pessoa.model.Cargo;

public interface ICargoDao {

	public int incluirCargo(Cargo cargo) throws Exception;
	
	public int alterarCargo(Cargo cargo) throws Exception;
	
	public int excluirCargo(Cargo cargo) throws Exception;
	
	public ResultSet pesquisaCargos() throws Exception;
	
	public ResultSet pesquisaDescricao(String nome) throws Exception;
	
	public ResultSet pesquisaCargo(int id) throws Exception;
}
