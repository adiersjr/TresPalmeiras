package br.com.xkinfo.arrecadacao.service;

import java.util.ArrayList;
import br.com.xkinfo.arrecadacao.model.Retorno;

public interface IRetornoService {
	
	public void incluirRetorno(String descricao) throws Exception;
	
	public void alterarRetorno(int id, String descricao) throws Exception;
	
	public void excluirRetorno(int id) throws Exception;

	public ArrayList<Retorno> pesquisarRetornos() throws Exception;
	
	public Retorno pesquisaRetorno(int id) throws Exception;
}
