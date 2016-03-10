package br.com.xkinfo.cadastro.service.impl;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Calendar;
import br.com.xkinfo.cadastro.model.Setor;
import br.com.xkinfo.cadastro.service.ISetorService;
import br.com.xkinfo.dao.DaoFactory;
import br.com.xkinfo.endereco.model.Municipio;
import br.com.xkinfo.service.ServiceFactory;

public class SetorService implements ISetorService{
	
	Setor set;

	@Override
	public void incluirSetor(String chave, Municipio municipio, String setor, String descricao, String ultimaFatura,
			Calendar dataUltimaCalc, Calendar dataUltimaExtFatura, char localizacao, String ultimaFaturaT,
			Calendar dataUltimaCalCat) throws Exception {
		set = new Setor();
		set.setChave(chave);
		set.setMunicipio(municipio);
		set.setSetor(setor);
		set.setDescricao(descricao);
		set.setUltimaFatura(ultimaFatura);
		set.setDataUltimaCalc(dataUltimaCalc);
		set.setDataUltimaExtFatura(dataUltimaExtFatura);
		set.setLocalizacao(localizacao);
		set.setUltimaFaturaT(ultimaFaturaT);
		set.setDataUltimaCalCat(dataUltimaCalCat);
		DaoFactory.getSetordao().incluirSetor(set);
	}

	@Override
	public void alterarSetor(int id, String chave, Municipio municipio, String setor, String descricao,
			String ultimaFatura, Calendar dataUltimaCalc, Calendar dataUltimaExtFatura, char localizacao,
			String ultimaFaturaT, Calendar dataUltimaCalCat) throws Exception {
		set = new Setor();
		set.setId(id);
		set.setChave(chave);
		set.setMunicipio(municipio);
		set.setSetor(setor);
		set.setDescricao(descricao);
		set.setUltimaFatura(ultimaFatura);
		set.setDataUltimaCalc(dataUltimaCalc);
		set.setDataUltimaExtFatura(dataUltimaExtFatura);
		set.setLocalizacao(localizacao);
		set.setUltimaFaturaT(ultimaFaturaT);
		set.setDataUltimaCalCat(dataUltimaCalCat);
		DaoFactory.getSetordao().alterarSetor(set);
	}

	@Override
	public void excluirSetor(int id) throws Exception {
		set = pesquisarSetor(id);
		DaoFactory.getSetordao().excluirSetor(set);
	}

	@Override
	public ArrayList<Setor> pesquisarSetores() throws Exception {
		ResultSet rs = DaoFactory.getSetordao().pesquisarSetores();
		ArrayList<Setor> setores = new ArrayList<>();
		while(rs.next()){
			set = new Setor();
			set.setId(rs.getInt("ID"));
			set.setChave(rs.getString("SET_CHAVE"));
			set.setMunicipio(ServiceFactory.getMunicpioservice().pesquisaMunicipio(rs.getInt("MUN_NUMERO")));
			set.setSetor(rs.getString("SET_SETOR"));
			set.setDescricao(rs.getString("SET_DESCR"));
			set.setUltimaFatura(rs.getString("SET_ULTFATUR"));
			set.setDataUltimaCalc(ServiceFactory.getApoioservice().converteCalendar(rs.getDate("SET_DTAULTCALC")));
			set.setDataUltimaExtFatura(ServiceFactory.getApoioservice().converteCalendar(rs.getDate("SET_DTAULTEXTFAT")));
			set.setLocalizacao(rs.getString("SET_LOCALIZ").charAt(0));
			set.setUltimaFaturaT(rs.getString("SET_ULTFATURAT"));
			set.setDataUltimaCalCat(ServiceFactory.getApoioservice().converteCalendar(rs.getDate("SET_DTAULTCALCAT")));
			setores.add(set);
		}
		return setores;
	}

	@Override
	public Setor pesquisarSetor(int id) throws Exception {
		ResultSet rs = DaoFactory.getSetordao().pesquisarSetores();
		set = new Setor();
		while(rs.next()){
			set.setId(rs.getInt("ID"));
			set.setChave(rs.getString("SET_CHAVE"));
			set.setMunicipio(ServiceFactory.getMunicpioservice().pesquisaMunicipio(rs.getInt("MUN_NUMERO")));
			set.setSetor(rs.getString("SET_SETOR"));
			set.setDescricao(rs.getString("SET_DESCR"));
			set.setUltimaFatura(rs.getString("SET_ULTFATUR"));
			set.setDataUltimaCalc(ServiceFactory.getApoioservice().converteCalendar(rs.getDate("SET_DTAULTCALC")));
			set.setDataUltimaExtFatura(ServiceFactory.getApoioservice().converteCalendar(rs.getDate("SET_DTAULTEXTFAT")));
			set.setLocalizacao(rs.getString("SET_LOCALIZ").charAt(0));
			set.setUltimaFaturaT(rs.getString("SET_ULTFATURAT"));
			set.setDataUltimaCalCat(ServiceFactory.getApoioservice().converteCalendar(rs.getDate("SET_DTAULTCALCAT")));
		}
		return set;
	}

}
