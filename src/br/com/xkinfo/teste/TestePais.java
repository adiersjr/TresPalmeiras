package br.com.xkinfo.teste;

import java.util.ArrayList;

import br.com.xkinfo.model.Pais;
import br.com.xkinfo.service.ServiceFactory;

public class TestePais {
	public static void main(String[] args) {

		// TESTE DE INCLUSÃO
		/*String nome = "Alemanha";
		String sigla = "DE";
		try {
			ServiceFactory.getPaisservice().incluirPais(nome, sigla);
		} catch (Exception e) {
			e.printStackTrace();
		}*/
		
		// TESTE DE ALTERAÇÃO
		/*int id = 1;
		String nome = "Brazil";
		String sigla = "Br";
		try {
			ServiceFactory.getPaisservice().alterarPais(id, nome, sigla);
		} catch (Exception e) {
			e.printStackTrace();
		}*/
		
		// TESTE DE EXCLUSÃO
		/*int ide = 1;
		try {
			ServiceFactory.getPaisservice().excluirPais(ide);
		} catch (Exception e) {
			e.printStackTrace();
		}*/

		// TESTE DE PESQUISA GERAL
		/*try {
			ArrayList<Pais> lista = ServiceFactory.getPaisservice().pesquisaPaises();
			for (Pais pais : lista) {
				System.out.println(pais.getId() + " " + pais.getNome());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
*/
		// TESTE DE PESQUISA PARCIAL NOME
		/*try {
			ArrayList<Pais> lista = ServiceFactory.getPaisservice().pesquisaNome("s");
			for (Pais pais : lista) {
				System.out.println(pais.getId() + " " + pais.getNome());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}*/

		// TESTE DE PESQUISA POR ID
		try {
			Pais pais = ServiceFactory.getPaisservice().pesquisaPais(2);
			System.out.println(pais.getId() + " " + pais.getNome());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
