package br.com.xkinfo.endereco.service.impl;

import java.sql.ResultSet;
import java.util.ArrayList;
import br.com.xkinfo.dao.DaoFactory;
import br.com.xkinfo.endereco.model.Pais;
import br.com.xkinfo.endereco.service.IPaisService;

public class PaisService implements IPaisService{

	private Pais pais;

	@Override
	public void incluirPais(String nome, String sigla) throws Exception {
		String validaNome = nome.replaceAll(" ", "");
		String validaSigla = sigla.replace(" ", "");
		String valida = "";
		if(validaNome.isEmpty()){
			valida = "Nome \n";
		}
		if(validaSigla.isEmpty()){
			valida = valida + "Sigla";
		}
		if(valida.isEmpty()){
			pais = new Pais();
			pais.setNome(nome);
			pais.setSigla(sigla);
			int ret = DaoFactory.getPaisdao().incluirPais(pais);
			if (ret == 1){
				System.out.println("Inclusão efetuada com Sucesso!");
			}
		}else {
			System.out.println("O(s) campo(s) não foi(ram) preenchido(s): \n" + valida);
		}		
	}

	@Override
	public void alterarPais(int id, String nome, String sigla) throws Exception {
		String validaNome = nome.replaceAll(" ", "");
		String validaSigla = sigla.replace(" ", "");
		String valida = "";
		if(validaNome.isEmpty()){
			valida = "Nome \n";
		}
		if(validaSigla.isEmpty()){
			valida = valida + "Sigla";
		}
		if(valida.isEmpty()){
			pais = new Pais();
			pais.setId(id);
			pais.setNome(nome);
			pais.setSigla(sigla);
			int ret = DaoFactory.getPaisdao().alterarPais(pais);
			if (ret == 1){
				System.out.println("Alteração efetuada com Sucesso!");
			}
		}else {
			System.out.println("O(s) campo(s) não foi(ram) preenchido(s): \n" + valida);
		}		
	}

	@Override
	public void excluirPais(int id) throws Exception {
		pais = pesquisaPais(id);
		int ret = DaoFactory.getPaisdao().excluirPais(pais);
		if (ret == 1){
			System.out.println("Exclusão efetuada com sucesso!");
		}
		if (ret == 0){
			System.out.println("Registro não existe, favor verificar!");
		}
	}

	@Override
	public ArrayList<Pais> pesquisaPaises() throws Exception {
		ResultSet rs = DaoFactory.getPaisdao().pesquisaPaises();
		ArrayList<Pais> paises = new ArrayList<>();
		while(rs.next()){
			Pais pais = new Pais();
			pais.setId(rs.getInt("PAI_NUMERO"));
			pais.setNome(rs.getString("PAI_NOME"));
			pais.setSigla(rs.getString("PAI_SIGLA"));
			paises.add(pais);
		}
		return paises;
	}

	@Override
	public ArrayList<Pais> pesquisaNome(String nome) throws Exception {
		ResultSet rs = DaoFactory.getPaisdao().pesquisaNome(nome);
		ArrayList<Pais> paises = new ArrayList<>();
		while(rs.next()){
			Pais pais = new Pais();
			pais.setId(rs.getInt("PAI_NUMERO"));
			pais.setNome(rs.getString("PAI_NOME"));
			pais.setSigla(rs.getString("PAI_SIGLA"));
			paises.add(pais);
		}
		return paises;
	}

	@Override
	public Pais pesquisaPais(int id) throws Exception {
		ResultSet rs = DaoFactory.getPaisdao().pesquisaPais(id);
		pais = new Pais();
		while(rs.next()){
			pais.setId(rs.getInt("PAI_NUMERO"));
			pais.setNome(rs.getString("PAI_NOME"));
			pais.setSigla(rs.getString("PAI_SIGLA"));
		}
		return pais; 
	}

}
