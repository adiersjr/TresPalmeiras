package br.com.xkinfo.cadastro.service.impl;

import java.sql.ResultSet;
import java.util.ArrayList;

import br.com.xkinfo.cadastro.model.Conjunto;
import br.com.xkinfo.cadastro.service.IConjuntoService;
import br.com.xkinfo.dao.DaoFactory;

public class ConjuntoService implements IConjuntoService{
	
	Conjunto conjunto;

	@Override
	public void incluirConjunto(String descricao, Double metaDic, Double metaFic, Double metaDec, Double metaFec,
			String localAtinge, boolean ativo) throws Exception {
		conjunto = new Conjunto();
		conjunto.setDescricao(descricao);
		conjunto.setMetaDic(metaDic);
		conjunto.setMetaFic(metaFic);
		conjunto.setMetaDec(metaDec);
		conjunto.setMetaFec(metaFec);
		conjunto.setLocalAtinge(localAtinge);
		conjunto.setAtivo(ativo);
		DaoFactory.getConjuntoDao().incluirConjunto(conjunto);
	}

	@Override
	public void alterarConjunto(String numero, String descricao, Double metaDic, Double metaFic, Double metaDec,
			Double metaFec, String localAtinge, boolean ativo) throws Exception {
		conjunto = new Conjunto();
		conjunto.setNumero(numero);
		conjunto.setDescricao(descricao);
		conjunto.setMetaDic(metaDic);
		conjunto.setMetaFic(metaFic);
		conjunto.setMetaDec(metaDec);
		conjunto.setMetaFec(metaFec);
		conjunto.setLocalAtinge(localAtinge);
		conjunto.setAtivo(ativo);
		DaoFactory.getConjuntoDao().alterarConjunto(conjunto);
	}

	@Override
	public void excluirConjunto(String numero) throws Exception {
		conjunto = pesquisarConjunto(numero);
		DaoFactory.getConjuntoDao().excluirConjunto(conjunto);
		// TODO Auto-generated method stub
		
	}

	@Override
	public ArrayList<Conjunto> pesquisarConjuntos() throws Exception {
		ResultSet rs = DaoFactory.getConjuntoDao().pesquisarConjuntos();
		ArrayList<Conjunto> conjuntos = new ArrayList<>();
		while(rs.next()){
			conjunto = new Conjunto();
			conjunto.setNumero(rs.getString("CON_NUMERO"));
			conjunto.setDescricao(rs.getString("CON_DESC"));
			conjunto.setMetaDic(rs.getDouble("CON_METADIC"));
			conjunto.setMetaFic(rs.getDouble("CON_METAFIC"));
			conjunto.setMetaDec(rs.getDouble("CON_METADEC"));
			conjunto.setMetaFec(rs.getDouble("CON_METAFEC"));
			conjunto.setLocalAtinge(rs.getString("CON_LOCALATINGE"));
			conjunto.setAtivo(rs.getBoolean("CON_ATIVO"));
			conjuntos.add(conjunto);
		}
		return conjuntos;
	}

	@Override
	public Conjunto pesquisarConjunto(String numero) throws Exception {
		ResultSet rs = DaoFactory.getConjuntoDao().pesquisarConjunto(numero);
		conjunto = new Conjunto();
		while(rs.next()){
			conjunto.setNumero(rs.getString("CON_NUMERO"));
			conjunto.setDescricao(rs.getString("CON_DESC"));
			conjunto.setMetaDic(rs.getDouble("CON_METADIC"));
			conjunto.setMetaFic(rs.getDouble("CON_METAFIC"));
			conjunto.setMetaDec(rs.getDouble("CON_METADEC"));
			conjunto.setMetaFec(rs.getDouble("CON_METAFEC"));
			conjunto.setLocalAtinge(rs.getString("CON_LOCALATINGE"));
			conjunto.setAtivo(rs.getBoolean("CON_ATIVO"));
		}
		return conjunto;
	}

}
