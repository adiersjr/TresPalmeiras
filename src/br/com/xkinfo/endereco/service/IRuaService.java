package br.com.xkinfo.endereco.service;

import java.util.ArrayList;
import br.com.xkinfo.endereco.model.Rua;
import br.com.xkinfo.endereco.model.TipoLogradouro;
import br.com.xkinfo.model.Eta;

public interface IRuaService {
	
	public void incluirRua(TipoLogradouro tipoLogradouro, Eta eta, String nome, String bairro, Double valorLixo) throws Exception;
	
	public void alterarRua(int id, TipoLogradouro tipoLogradouro, Eta eta, String nome, String bairro, Double valorLixo) throws Exception;
	
	public void excluirRua(int id) throws Exception;
	
	public ArrayList<Rua> pesquisarRuas() throws Exception;
	
	public Rua pesquisarRua(int id) throws Exception;

}
