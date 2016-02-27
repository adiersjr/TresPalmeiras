package br.com.xkinfo.teste;

import java.util.ArrayList;
import br.com.xkinfo.model.Cargo;
import br.com.xkinfo.service.ServiceFactory;

public class TesteCargo {

	public static void main(String[] args) {

		// TESTE DE INCLUSÃO
		/*String descricao = "";
		try {
			ServiceFactory.getCargoservice().incluirCargo(descricao);
		} catch (Exception e) {
			e.printStackTrace();
		}*/
		// TESTE DE ALTERAÇÃO
		/*int id = 14;
		 String descricao = " ";
		try {
			ServiceFactory.getCargoservice().alterarCargo(id,descricao);
		} catch (Exception e) {
			e.printStackTrace();
		}*/
		// TESTE DE EXCLUSÃO
		/*int id = 4;
		try {
			ServiceFactory.getCargoservice().excluirCargo(id);
		} catch (Exception e) {
			System.out.println(e);
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		// TESTE DE PESQUISA GERAL
		/*try {
			ArrayList<Cargo> lista = ServiceFactory.getCargoservice().pesquisaCargos();
			for (Cargo cargo : lista) {
				System.out.println(cargo.getId() + " " + cargo.getDescricao());
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		// TESTE DE PESQUISA PARCIAL NOME
		try {
			ArrayList<Cargo> lista = ServiceFactory.getCargoservice().pesquisaDescricao(" ");
			for (Cargo cargo : lista) {
				System.out.println(cargo.getId() + " " + cargo.getDescricao());
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// TESTE DE PESQUISA POR ID
		/*try {
			Cargo cargo = ServiceFactory.getCargoservice().pesquisaCargo(11);
			System.out.println(cargo.getId() + " " + cargo.getDescricao());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
	}

}
