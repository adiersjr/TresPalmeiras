package br.com.xkinfo.pessoa.service;

import java.util.ArrayList;

import br.com.xkinfo.pessoa.model.Cargo;

public interface ICargoService {
	
	public void incluirCargo(String descricao) throws Exception;
	
	public void alterarCargo(int id, String descricao) throws Exception;
	
	public void excluirCargo(int id) throws Exception;
	
	public ArrayList<Cargo> pesquisaCargos() throws Exception;
	
	public ArrayList<Cargo> pesquisaDescricao(String descricao) throws Exception;
	
	public Cargo pesquisaCargo(int id) throws Exception;
}
