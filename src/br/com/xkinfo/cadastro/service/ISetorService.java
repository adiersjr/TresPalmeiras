package br.com.xkinfo.cadastro.service;

import java.util.ArrayList;
import java.util.Calendar;
import br.com.xkinfo.cadastro.model.Setor;
import br.com.xkinfo.endereco.model.Municipio;

public interface ISetorService {
	
	public void incluirSetor(String chave, Municipio municipio, String setor, String descricao, String ultimaFatura, Calendar dataUltimaCalc, 
			Calendar dataUltimaExtFatura, char localizacao, String ultimaFaturaT, Calendar dataUltimaCalCat) throws Exception;
	
	public void alterarSetor(int id, String chave, Municipio municipio, String setor, String descricao, String ultimaFatura, Calendar dataUltimaCalc, 
			Calendar dataUltimaExtFatura, char localizacao, String ultimaFaturaT, Calendar dataUltimaCalCat) throws Exception;
	
	public void excluirSetor(int id) throws Exception;
	
	public ArrayList<Setor> pesquisarSetores() throws Exception;
	
	public Setor pesquisarSetor(int id) throws Exception;

}
