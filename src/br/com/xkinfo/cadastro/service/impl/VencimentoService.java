package br.com.xkinfo.cadastro.service.impl;

import java.sql.ResultSet;
import java.util.ArrayList;
import br.com.xkinfo.cadastro.model.Setor;
import br.com.xkinfo.cadastro.model.Vencimento;
import br.com.xkinfo.cadastro.service.IVencimentoService;
import br.com.xkinfo.dao.DaoFactory;
import br.com.xkinfo.service.ServiceFactory;

public class VencimentoService implements IVencimentoService{
	
	Vencimento vencimento;

	@Override
	public void incluirVencimento(Setor setor, int numero, String dia, boolean vip) throws Exception {
		vencimento = new Vencimento();
		vencimento.setSetor(setor);
		vencimento.setNumero(numero);
		vencimento.setDia(dia);
		vencimento.setVip(vip);
		DaoFactory.getVencimentoDao().incluirVencimento(vencimento);
	}

	@Override
	public void alterarVencimento(String id, Setor setor, int numero, String dia, boolean vip) throws Exception {
		vencimento = new Vencimento();
		vencimento.setId(id);
		vencimento.setSetor(setor);
		vencimento.setNumero(numero);
		vencimento.setDia(dia);
		vencimento.setVip(vip);
		DaoFactory.getVencimentoDao().alterarVencimento(vencimento);
	}

	@Override
	public void excluirVencimento(String id) throws Exception {
		vencimento = pesquisarVencimento(id);
		DaoFactory.getVencimentoDao().excluirVencimento(vencimento);
	}

	@Override
	public ArrayList<Vencimento> pesquisarVencimentos() throws Exception {
		ResultSet rs = DaoFactory.getVencimentoDao().pesquisarVencimentos();
		ArrayList<Vencimento> vencimentos = new ArrayList<>();
		while(rs.next()){
			vencimento = new Vencimento();
			vencimento.setId(rs.getString("VEN_CODIGO"));
			vencimento.setSetor(ServiceFactory.getSetorservice().pesquisarSetor(rs.getInt("SET_CHAVE")));
			vencimento.setNumero(rs.getInt("VEN_NUMERO"));
			vencimento.setDia(rs.getString("VEN_DIA"));
			vencimento.setVip(rs.getBoolean("VEN_VIP"));
			vencimentos.add(vencimento);
		}
		return vencimentos;
	}

	@Override
	public Vencimento pesquisarVencimento(String id) throws Exception {
		ResultSet rs = DaoFactory.getVencimentoDao().pesquisarVencimento(id);
		vencimento = new Vencimento();
		while(rs.next()){
			vencimento.setId(rs.getString("VEN_CODIGO"));
			vencimento.setSetor(ServiceFactory.getSetorservice().pesquisarSetor(rs.getInt("SET_CHAVE")));
			vencimento.setNumero(rs.getInt("VEN_NUMERO"));
			vencimento.setDia(rs.getString("VEN_DIA"));
			vencimento.setVip(rs.getBoolean("VEN_VIP"));
		}
		return vencimento;
	}

}
