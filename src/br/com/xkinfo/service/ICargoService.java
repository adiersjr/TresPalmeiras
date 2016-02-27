package br.com.xkinfo.service;

import java.util.ArrayList;
import br.com.xkinfo.model.Cargo;

public interface ICargoService {
	
	public void incluirCargo(Cargo cargo) throws Exception;
	
	public void alterarCargo(Cargo cargo) throws Exception;
	
	public void excluirCargo(Cargo cargo) throws Exception;
	
	public ArrayList<Cargo> listaCargos() throws Exception;
	
	public ArrayList<Cargo> listaDescricao(String descricao) throws Exception;
	
	public Cargo listaCargo(int id) throws Exception;
}
