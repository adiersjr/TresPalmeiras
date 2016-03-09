package br.com.xkinfo.endereco.service.impl;

import java.sql.ResultSet;
import java.util.ArrayList;

import br.com.xkinfo.dao.DaoFactory;
import br.com.xkinfo.endereco.model.Bairro;
import br.com.xkinfo.endereco.service.IBairroService;

public class BairroService implements IBairroService{

	Bairro bairro;
	
	@Override
	public void incluirBairro(String nome) throws Exception {
		bairro = new Bairro();
		bairro.setNome(nome);
		DaoFactory.getBairrodao().incluirBairro(bairro);
	}

	@Override
	public void alterarBairro(int id, String nome) throws Exception {
		bairro = new Bairro();
		bairro.setId(id);
		bairro.setNome(nome);
		DaoFactory.getBairrodao().alterarBairro(bairro);
	}

	@Override
	public void excluirBairro(int id) throws Exception {
		bairro = pesquisaBairro(id);
		DaoFactory.getBairrodao().excluirBairro(bairro);
	}

	@Override
	public ArrayList<Bairro> pesquisaBairros() throws Exception {
		ResultSet rs = DaoFactory.getBairrodao().pesquisarBairros();
		ArrayList<Bairro> bairros = new ArrayList<>();
		while(rs.next()){
			bairro = new Bairro();
			bairro.setId(rs.getInt("BAI_NUMERO"));
			bairro.setNome(rs.getString("BAI_NOME"));
			bairros.add(bairro);
		}
		return bairros;
	}

	@Override
	public Bairro pesquisaBairro(int id) throws Exception {
		ResultSet rs = DaoFactory.getBairrodao().pesquisarBairro(id);
		bairro = new Bairro();
		while(rs.next()){
			bairro.setId(rs.getInt("BAI_NUMERO"));
			bairro.setNome(rs.getString("BAI_NOME"));
		}
		return bairro;
	}

}
