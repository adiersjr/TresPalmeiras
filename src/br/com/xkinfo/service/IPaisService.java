package br.com.xkinfo.service;

import java.util.ArrayList;
import br.com.xkinfo.model.Pais;

public interface IPaisService {
	
	public void incluirPais(String nome, String sigla) throws Exception;
	
	public void alterarPais(int id, String nome, String sigla) throws Exception;
	
	public void excluirPais(int id) throws Exception;
	
	public ArrayList<Pais> pesquisaPaises() throws Exception;
	
	public ArrayList<Pais> pesquisaNome(String nome) throws Exception;
	
	public Pais pesquisaPais(int id) throws Exception;

}
