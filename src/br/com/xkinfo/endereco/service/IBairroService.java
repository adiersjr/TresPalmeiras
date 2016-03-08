package br.com.xkinfo.endereco.service;

import java.util.ArrayList;
import br.com.xkinfo.endereco.model.Bairro;

public interface IBairroService {
	
	public void incluirBairro(String nome) throws Exception;
	
	public void alterarBairro(int id, String nome) throws Exception;
	
	public void excluirBairro(int id) throws Exception;
	
	public ArrayList<Bairro> pesquisaBairros() throws Exception;
	
	public Bairro pesquisaBairro(int id) throws Exception;

}
