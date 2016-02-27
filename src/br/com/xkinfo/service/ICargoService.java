package br.com.xkinfo.service;

import java.util.ArrayList;
import br.com.xkinfo.model.Cargo;

public interface ICargoService {
	
	public void incluirCargo(String descricao) throws Exception;
	
	public void alterarCargo(int id, String descricao) throws Exception;
	
	public void excluirCargo(int id) throws Exception;
	
	public ArrayList<Cargo> listaCargos() throws Exception;
	
	public ArrayList<Cargo> listaDescricao(String descricao) throws Exception;
	
	public Cargo listaCargo(int id) throws Exception;
}
