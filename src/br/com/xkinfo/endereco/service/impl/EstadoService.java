package br.com.xkinfo.endereco.service.impl;

import java.sql.ResultSet;
import java.util.ArrayList;

import br.com.xkinfo.dao.DaoFactory;
import br.com.xkinfo.endereco.model.Estado;
import br.com.xkinfo.endereco.model.Pais;
import br.com.xkinfo.endereco.service.IEstadoService;
import br.com.xkinfo.service.ServiceFactory;

public class EstadoService implements IEstadoService{
	
	Estado estado;

	@Override
	public void incluirEstado(String nome, String sigla, Pais pais, String codigoIbge) throws Exception {
		String validaNome = nome.replaceAll(" ", "");
		String validaSigla = sigla.replaceAll(" ", "");
		String valida = "";

		if (validaNome.isEmpty()) {
			valida = "Nome \n";
		}
		if (validaSigla.isEmpty()) {
			valida = valida + "Sigla \n";
		}
		if (valida.isEmpty()) {
			estado = new Estado();
			estado.setNome(nome);
			estado.setSigla(sigla);
			estado.setPais(pais);
			estado.setCodigoIbge(codigoIbge);
			int ret = DaoFactory.getEstadoDao().incluirEstado(estado);
			if (ret == 1){
				System.out.println("Inclus�o efetuada com Sucesso!");
			}
		} else {
			System.out.println("Favor preencher os seguintes campos: \n" + valida);
		}
	}

	@Override
	public void alterarEstado(int id, String nome,String sigla, Pais pais, String codigoIbge) throws Exception {
		String validaNome = nome.replaceAll(" ", "");
		String validaSigla = sigla.replaceAll(" ", "");
		String valida = "";

		if (validaNome.isEmpty()) {
			valida = "Nome \n";
		}
		if (validaSigla.isEmpty()) {
			valida = valida + "Sigla \n";
		}
		if (valida.isEmpty()) {
			estado = new Estado();
			estado.setId(id);
			estado.setNome(nome);
			estado.setSigla(sigla);
			estado.setPais(pais);
			estado.setCodigoIbge(codigoIbge);
			int ret = DaoFactory.getEstadoDao().alterarEstado(estado);
			if (ret == 1){
				System.out.println("Altera��o efetuada com Sucesso!");
			} else {
				System.out.println("Registro n�o encontrado!");
			}
		} else {
			System.out.println("Favor preencher os seguintes campos: \n" + valida);
		}
	}

	@Override
	public void excluirEstado(int id) throws Exception {
		estado = pesquisaEstado(id);
		int ret = DaoFactory.getEstadoDao().excluirEstado(estado);
		if (ret == 1){
			System.out.println("Exclus�o efetuada com sucesso!");
		}
		if (ret == 0){
			System.out.println("Registro n�o existe, favor verificar!");
		}
	}

	@Override
	public ArrayList<Estado> pesquisaEstados() throws Exception {
		ResultSet rs = DaoFactory.getEstadoDao().pesquisaEstados();
		ArrayList<Estado> estados = new ArrayList<>();
		while(rs.next()){
			estado = new Estado();
			estado.setId(rs.getInt("EST_CODIGO"));
			estado.setNome(rs.getString("EST_NOME"));
			estado.setSigla(rs.getString("EST_SIGLA"));
			estado.setPais(ServiceFactory.getPaisservice().pesquisaPais(rs.getInt("PAI_NUMERO")));
			estados.add(estado);
		}
		return estados;
	}

	@Override
	public ArrayList<Estado> pesquisaNome(String nome) throws Exception {
		ResultSet rs = DaoFactory.getEstadoDao().pesquisaNome(nome);
		ArrayList<Estado> estados = new ArrayList<>();
		while(rs.next()){
			estado = new Estado();
			estado.setId(rs.getInt("EST_CODIGO"));
			estado.setNome(rs.getString("EST_NOME"));
			estado.setSigla(rs.getString("EST_SIGLA"));
			estado.setPais(ServiceFactory.getPaisservice().pesquisaPais(rs.getInt("PAI_NUMERO")));
			estados.add(estado);
		}
		return estados;
	}

	@Override
	public Estado pesquisaSigla(String sigla) throws Exception {
		ResultSet rs = DaoFactory.getEstadoDao().pesquisaSigla(sigla);
		estado = new Estado();
		while(rs.next()){
			estado.setId(rs.getInt("EST_CODIGO"));
			estado.setNome(rs.getString("EST_NOME"));
			estado.setSigla(rs.getString("EST_SIGLA"));
			estado.setPais(ServiceFactory.getPaisservice().pesquisaPais(rs.getInt("PAI_NUMERO")));
		}
		return estado;
	}

	@Override
	public ArrayList<Estado> pesquisaPais(Pais pais) throws Exception {
		ResultSet rs = DaoFactory.getEstadoDao().pesquisaPais(pais);
		ArrayList<Estado> estados = new ArrayList<>();
		while(rs.next()){
			estado = new Estado();
			estado.setId(rs.getInt("EST_CODIGO"));
			estado.setNome(rs.getString("EST_NOME"));
			estado.setSigla(rs.getString("EST_SIGLA"));
			estado.setPais(ServiceFactory.getPaisservice().pesquisaPais(rs.getInt("PAI_NUMERO")));
			estados.add(estado);
		}
		return estados;
	}

	@Override
	public Estado pesquisaEstado(int id) throws Exception {
		ResultSet rs = DaoFactory.getEstadoDao().pesquisaEstado(id);
		estado = new Estado();
		while(rs.next()){
			estado.setId(rs.getInt("EST_CODIGO"));
			estado.setNome(rs.getString("EST_NOME"));
			estado.setSigla(rs.getString("EST_SIGLA"));
			estado.setPais(ServiceFactory.getPaisservice().pesquisaPais(rs.getInt("PAI_NUMERO")));
		}
		return estado;
	}

}
