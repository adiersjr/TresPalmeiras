package br.com.xkinfo.cadastro.service;

import java.util.ArrayList;
import java.util.Calendar;

import br.com.xkinfo.cadastro.model.Proprietario;
import br.com.xkinfo.endereco.model.Estado;

public interface IProprietarioService {
	
	public void incluirProprietario(String nome, String cnpjCpf, String telefone, String municipio, String endereco, String obs, String complemento, 
			String bairro, String cep, String obs1, Calendar dataProcessamento, Estado estado) throws Exception;
	
	public void alterarProprietario(int id, String nome, String cnpjCpf, String telefone, String municipio, String endereco, String obs, String complemento, 
			String bairro, String cep, String obs1, Calendar dataProcessamento, Estado estado) throws Exception;
	
	public void excluirProprietario(int id) throws Exception;
	
	public ArrayList<Proprietario> pesquisarProprietarios() throws Exception;
	
	public Proprietario pesquisarProprietario(int id) throws Exception;

}
