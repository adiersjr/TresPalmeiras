package br.com.xkinfo.dao;

import br.com.xkinfo.model.Cargo;

public interface ICargoDao {

	public int incluirCargo(Cargo cargo) throws Exception;
	
	public void alterarCargo() throws Exception;
	
	public void excluirCargo() throws Exception;
	
	public void listaCargo() throws Exception;
}
