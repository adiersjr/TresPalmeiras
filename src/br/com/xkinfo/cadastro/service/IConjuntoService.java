package br.com.xkinfo.cadastro.service;

import java.util.ArrayList;
import br.com.xkinfo.cadastro.model.Conjunto;

public interface IConjuntoService {
	
	public void incluirConjunto(String descricao, Double metaDic, Double metaFic, Double metaDec, Double metaFec, String localAtinge, 
			boolean ativo) throws Exception;
	
	public void alterarConjunto(String numero, String descricao, Double metaDic, Double metaFic, Double metaDec, Double metaFec, String localAtinge, 
			boolean ativo) throws Exception;
	
	public void excluirConjunto(String numero) throws Exception;
	
	public ArrayList<Conjunto> pesquisarConjuntos() throws Exception;
	
	public Conjunto pesquisarConjunto(String numero) throws Exception;

}
