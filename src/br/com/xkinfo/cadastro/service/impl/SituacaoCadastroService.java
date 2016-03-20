package br.com.xkinfo.cadastro.service.impl;

import java.sql.ResultSet;
import java.util.ArrayList;

import br.com.xkinfo.cadastro.model.SituacaoCadastro;
import br.com.xkinfo.cadastro.service.ISituacaoCadastroService;
import br.com.xkinfo.dao.DaoFactory;

public class SituacaoCadastroService implements ISituacaoCadastroService{

	SituacaoCadastro situacaoCadastro;

	@Override
	public void incluirSituacaoCadastro(int numero, String descricao) throws Exception {
		situacaoCadastro = new SituacaoCadastro();
		situacaoCadastro.setNumero(numero);
		situacaoCadastro.setDescricao(descricao);
		DaoFactory.getSituacaocadastroDao().incluirSituacaoCadastro(situacaoCadastro);
	}

	@Override
	public void alterarSituacaoCadastro(char id, int numero, String descricao) throws Exception {
		situacaoCadastro = new SituacaoCadastro();
		situacaoCadastro.setId(id);
		situacaoCadastro.setNumero(numero);
		situacaoCadastro.setDescricao(descricao);
		DaoFactory.getSituacaocadastroDao().alterarSituacaoCadastro(situacaoCadastro);
	}

	@Override
	public void excluirSituacaoCadastro(char id) throws Exception {
		situacaoCadastro = pesquisarSituacaoCadastro(id);
		DaoFactory.getSituacaocadastroDao().excluitSituacaoCadastro(situacaoCadastro);
	}

	@Override
	public ArrayList<SituacaoCadastro> pesquisarSituacaoCadastros() throws Exception {
		ResultSet rs = DaoFactory.getSituacaocadastroDao().pesquisarSituacaoCadastros();
		ArrayList<SituacaoCadastro> situacoes = new ArrayList<>();
		while (rs.next()){
			situacaoCadastro = new SituacaoCadastro();
			situacaoCadastro.setId(rs.getString("SIT_CODIGO").charAt(0));
			situacaoCadastro.setNumero(rs.getInt("SIT_NUMERO"));
			situacaoCadastro.setDescricao(rs.getString("SIT_DESC"));
			situacoes.add(situacaoCadastro);
		}
		return situacoes;
	}

	@Override
	public SituacaoCadastro pesquisarSituacaoCadastro(char id) throws Exception {
		ResultSet rs = DaoFactory.getSituacaocadastroDao().pesquisarSituacaoCadastro(id);
		situacaoCadastro = new SituacaoCadastro();
		while (rs.next()){
			situacaoCadastro.setId(rs.getString("SIT_CODIGO").charAt(0));
			situacaoCadastro.setNumero(rs.getInt("SIT_NUMERO"));
			situacaoCadastro.setDescricao(rs.getString("SIT_DESC"));
		}
		return situacaoCadastro;
	}

}
