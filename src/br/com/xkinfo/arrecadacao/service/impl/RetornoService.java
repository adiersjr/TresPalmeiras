package br.com.xkinfo.arrecadacao.service.impl;

import java.sql.ResultSet;
import java.util.ArrayList;
import br.com.xkinfo.arrecadacao.model.Retorno;
import br.com.xkinfo.arrecadacao.service.IRetornoService;
import br.com.xkinfo.dao.DaoFactory;

public class RetornoService implements IRetornoService{
	
	Retorno retorno;

	@Override
	public void incluirRetorno(String descricao) throws Exception {
		retorno = new Retorno();
		retorno.setDescricao(descricao);
		int ret =  DaoFactory.getRetornoDao().incluirRetorno(retorno);
		System.out.println(ret);
	}

	@Override
	public void alterarRetorno(int id, String descricao) throws Exception {
		retorno = new Retorno();
		retorno.setId(id);
		retorno.setDescricao(descricao);
		int ret = DaoFactory.getRetornoDao().alterarRetorno(retorno);
		System.out.println(ret);
	}

	@Override
	public void excluirRetorno(int id) throws Exception {
		retorno = pesquisaRetorno(id);
		int ret = DaoFactory.getRetornoDao().excluirRetorno(retorno);
		System.out.println(ret);
	}

	@Override
	public ArrayList<Retorno> pesquisarRetornos() throws Exception {
		ResultSet rs = DaoFactory.getRetornoDao().pesquisaRetornos();
		ArrayList<Retorno> retornos = new ArrayList<>();
		while(rs.next()) {
			retorno = new Retorno();
			retorno.setId(rs.getInt("RET_RETORNO"));
			retorno.setDescricao(rs.getString("RET_DESCRICAO"));
			retornos.add(retorno);
		}
		return retornos;
	}

	@Override
	public Retorno pesquisaRetorno(int id) throws Exception {
		ResultSet rs = DaoFactory.getRetornoDao().pesquisaRetorno(id);
		retorno = new Retorno();
		while(rs.next()) {
			retorno.setId(rs.getInt("RET_RETORNO"));
			retorno.setDescricao(rs.getString("RET_DESCRICAO"));
		}
		return retorno;
	}
}
