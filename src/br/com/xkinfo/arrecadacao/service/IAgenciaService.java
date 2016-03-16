package br.com.xkinfo.arrecadacao.service;

import java.util.ArrayList;
import br.com.xkinfo.arrecadacao.model.Agencia;
import br.com.xkinfo.arrecadacao.model.Banco;
import br.com.xkinfo.endereco.model.Estado;

public interface IAgenciaService {
	
	public int incluirAgencia(String chave, Banco banco, String numero, String nome, String convenioF, String convenioG, int nsr, char digito, 
			String endereco, String complemento, String bairro, String cep, String municipio, Estado estado, String ddd, String telefone) throws Exception;
	
	public int alterarAgencia(int id, String chave, Banco banco, String numero, String nome, String convenioF, String convenioG, int nsr, char digito, 
			String endereco, String complemento, String bairro, String cep, String municipio, Estado estado, String ddd, String telefone) throws Exception;
	
	public int excluirAgencia(int id) throws Exception;

	public ArrayList<Agencia> pesquisaAgencias() throws Exception;
	
	public ArrayList<Agencia> pesquisaAgencias(Banco banco) throws Exception;

	public Agencia pesquisaAgencia(int id) throws Exception;
	
	public Agencia pesquisaAgencia(String chave) throws Exception;
}
