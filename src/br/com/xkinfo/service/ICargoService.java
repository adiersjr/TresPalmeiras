package br.com.xkinfo.service;

import br.com.xkinfo.model.Cargo;

public interface ICargoService {
	
	public void incluirCargo(Cargo cargo) throws Exception;
	
	public void alterarCargo() throws Exception;
	
	public void excluirCargo() throws Exception;
	
	public void listaCargo() throws Exception;
}
