package br.com.xkinfo.arrecadacao.service.impl;

import java.util.ArrayList;

import br.com.xkinfo.arrecadacao.model.ArrecadaE;
import br.com.xkinfo.arrecadacao.model.Banco;
import br.com.xkinfo.arrecadacao.service.IArrecadaEService;
import br.com.xkinfo.cadastro.model.Cadastro;

public class ArrecadaEService implements IArrecadaEService{

	ArrecadaE arrecadaE;
	@Override
	public int incluirArrecadaE(int nsr, Cadastro cadastro, Banco banco) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public ArrayList<ArrecadaE> pesquisaArrecadaEs() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<ArrecadaE> pesquisaArrecadaEs(Banco banco) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrecadaE pesquisaArrecadaE(int nsr) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrecadaE pesquisaArrecadaE(Cadastro cadastro) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
