package br.com.xkinfo.outros.service;

import java.util.ArrayList;
import br.com.xkinfo.outros.model.Eta;

public interface IEtaService {
	
	public void incluirEta(String descricao) throws Exception;
	
	public void alterarEta(int id, String descricao) throws Exception;
	
	public void excluirEta(int id) throws Exception;
	
	public ArrayList<Eta> pesquisarEtas() throws Exception;
	
	public Eta pesquisarEta(int id) throws Exception;

}
