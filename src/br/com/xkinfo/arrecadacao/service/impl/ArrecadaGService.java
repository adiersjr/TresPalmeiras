package br.com.xkinfo.arrecadacao.service.impl;

import java.util.ArrayList;
import java.util.Calendar;

import br.com.xkinfo.arrecadacao.model.Agencia;
import br.com.xkinfo.arrecadacao.model.ArrecadaG;
import br.com.xkinfo.arrecadacao.model.Banco;
import br.com.xkinfo.arrecadacao.model.Retorno;
import br.com.xkinfo.arrecadacao.service.IArrecadaGService;

public class ArrecadaGService implements IArrecadaGService{

	ArrecadaG arrecadaG;
	
	@Override
	public int incluirArrecadaG(String codigoBarras, Retorno retorno, Banco banco, Agencia agencia,
			Calendar dataPagamento, Calendar dataCredito, Double valorFatura, Double valorTarifa, int nsr,
			String codigoArrecadador, String formaArrecadacao, String reservado, Double valorDiferenca)
			throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public ArrayList<ArrecadaG> pesquisaArrecadaGs() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<ArrecadaG> pesquisaArrecadaGs(Banco banco) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrecadaG pesquisaArrecadaG(int id) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrecadaG pesquisaArrecadaG(Calendar dataCredito) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
