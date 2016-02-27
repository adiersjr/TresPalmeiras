package br.com.xkinfo.teste;

//import java.util.ArrayList;
import br.com.xkinfo.model.Cargo;
import br.com.xkinfo.service.ServiceFactory;

public class Teste {

	public static void main(String[] args) {

		// TESTE DE INCLUSÃO
		/*Cargo cargo = new Cargo();
		cargo.setDescricao("Gerente");
		try {
			ServiceFactory.getCargoservice().incluirCargo(cargo);
		} catch (Exception e) {
			e.printStackTrace();
		}*/
		// TESTE DE ALTERAÇÃO
		/*Cargo cargo2 = new Cargo();
		cargo2.setId(14);
		cargo2.setDescricao("Contador");
		try {
			ServiceFactory.getCargoservice().alterarCargo(cargo2);
		} catch (Exception e) {
			e.printStackTrace();
		}*/
		// TESTE DE EXCLUSÃO
		/*Cargo cargo3 = new Cargo();
		cargo3.setId(10);
		try {
			ServiceFactory.getCargoservice().excluirCargo(cargo3);
		} catch (Exception e) {
			System.out.println(e);
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		// TESTE DE PESQUISA GERAL
		/*try {
			ArrayList<Cargo> lista = ServiceFactory.getCargoservice().listaCargo();
			for (Cargo cargo : lista) {
				System.out.println(cargo.getId() + " " + cargo.getDescricao());
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		// TESTE DE PESQUISA PARCIAL NOME
		/*try {
			ArrayList<Cargo> lista = ServiceFactory.getCargoservice().listaDescricao("DaR");
			for (Cargo cargo : lista) {
				System.out.println(cargo.getId() + " " + cargo.getDescricao());
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		// TESTE DE PESQUISA POR ID
		try {
			Cargo cargo = ServiceFactory.getCargoservice().listaCargo(11);
			System.out.println(cargo.getId() + " " + cargo.getDescricao());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
