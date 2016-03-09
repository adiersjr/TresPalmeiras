package br.com.xkinfo.endereco.service.impl;

import java.sql.ResultSet;
import java.util.ArrayList;

import br.com.xkinfo.dao.DaoFactory;
import br.com.xkinfo.endereco.model.Rua;
import br.com.xkinfo.endereco.model.TipoLogradouro;
import br.com.xkinfo.endereco.service.IRuaService;
import br.com.xkinfo.outros.model.Eta;
import br.com.xkinfo.service.ServiceFactory;

public class RuaService implements IRuaService{
	
	Rua rua;

	@Override
	public void incluirRua(TipoLogradouro tipoLogradouro, Eta eta, String nome, String bairro, Double valorLixo)
			throws Exception {
		rua = new Rua();
		rua.setTipoLogradouro(tipoLogradouro);
		rua.setEta(eta);
		rua.setNome(nome);
		rua.setBairro(bairro);
		rua.setValorLixo(valorLixo);
		DaoFactory.getRuadao().incluirRua(rua);
	}

	@Override
	public void alterarRua(int id, TipoLogradouro tipoLogradouro, Eta eta, String nome, String bairro, Double valorLixo)
			throws Exception {
		rua = new Rua();
		rua.setId(id);
		rua.setTipoLogradouro(tipoLogradouro);
		rua.setEta(eta);
		rua.setNome(nome);
		rua.setBairro(bairro);
		rua.setValorLixo(valorLixo);
		DaoFactory.getRuadao().alterarRua(rua);
	}

	@Override
	public void excluirRua(int id) throws Exception {
		rua = pesquisarRua(id);
		DaoFactory.getRuadao().excluirRua(rua);
	}

	@Override
	public ArrayList<Rua> pesquisarRuas() throws Exception {
		ResultSet rs = DaoFactory.getRuadao().pesquisarRuas();
		ArrayList<Rua> ruas = new ArrayList<>();
		while (rs.next()){
			rua = new Rua();
			rua.setId(rs.getInt("RUA_NUMERO"));
			rua.setTipoLogradouro(ServiceFactory.getTipologradouroservice().pesquisarTipoLogradouro(rs.getInt("TIP_CODIGO")));
			rua.setEta(eta);
			rua.setNome(rs.getString("RUA_NOME"));
			rua.setBairro(rs.getString("BAI_NOME"));
			rua.setValorLixo(rs.getDouble("RUA_VLRLIXO"));
			ruas.add(rua);
		}
		return ruas;
	}

	@Override
	public Rua pesquisarRua(int id) throws Exception {
		ResultSet rs = DaoFactory.getRuadao().pesquisarRuas();
		rua = new Rua();
		while (rs.next()){
			rua.setId(rs.getInt("RUA_NUMERO"));
			rua.setTipoLogradouro(ServiceFactory.getTipologradouroservice().pesquisarTipoLogradouro(rs.getInt("TIP_CODIGO")));
			rua.setEta(eta);
			rua.setNome(rs.getString("RUA_NOME"));
			rua.setBairro(rs.getString("BAI_NOME"));
			rua.setValorLixo(rs.getDouble("RUA_VLRLIXO"));
		}
		return rua;
	}

}
