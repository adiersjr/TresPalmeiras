package br.com.xkinfo.arrecadacao.service;

import java.util.ArrayList;
import java.util.Calendar;

import br.com.xkinfo.arrecadacao.model.Agencia;
import br.com.xkinfo.arrecadacao.model.ArrecadaG;
import br.com.xkinfo.arrecadacao.model.Banco;
import br.com.xkinfo.arrecadacao.model.Retorno;


public interface IArrecadaGService {
	
	public int incluirArrecadaG(String codigoBarras, Retorno retorno, Banco banco, Agencia agencia, Calendar dataPagamento,
			Calendar dataCredito, Double valorFatura, Double valorTarifa, int nsr, String codigoArrecadador,
			String formaArrecadacao, String reservado, Double valorDiferenca) throws Exception;
	
	public ArrayList<ArrecadaG> pesquisaArrecadaGs() throws Exception;
	
	public ArrayList<ArrecadaG> pesquisaArrecadaGs(Banco banco) throws Exception;

	public ArrecadaG pesquisaArrecadaG(int id) throws Exception;
	
	public ArrecadaG pesquisaArrecadaG(Calendar dataCredito) throws Exception;
}
