package br.com.xkinfo.teste;

import java.util.ArrayList;

import br.com.xkinfo.endereco.model.Estado;
import br.com.xkinfo.endereco.model.Pais;
import br.com.xkinfo.service.ServiceFactory;

public class TesteEstado {

	public static void main(String[] args) {

		// TESTE DE INCLUSAO
		/*String sigla = "PR";
		int id = 1;
		String nome = "Paraná";
		Pais pais = null;
		try {
			pais = ServiceFactory.getPaisservice().pesquisaPais(2);
		} catch (Exception e1) {
			e1.printStackTrace();
		}
		try {
			ServiceFactory.getEstadoservice().incluirEstado(nome, sigla, pais, null);
		} catch (Exception e) {
			e.printStackTrace();
		}*/

		// TESTE DE ALTERACAO
		/*String sigla = "SC";
		int id = 3;
		String nome = "Santa Catarina";
		Pais pais = null;
		try {
			pais = ServiceFactory.getPaisservice().pesquisaPais(2);
		} catch (Exception e1) {
			e1.printStackTrace();
		}
		try {
			ServiceFactory.getEstadoservice().alterarEstado(id, nome, sigla, pais, null);
		} catch (Exception e) {
			e.printStackTrace();
		}*/

		// TESTE DE EXCLUSÃO
		/*int idDelete = 3;
			try {
				ServiceFactory.getEstadoservice().excluirEstado(idDelete);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}*/

		// TESTE DE PESQUISA GERAL
		/*try {
				ArrayList<Estado> estados = ServiceFactory.getEstadoservice().pesquisaEstados();
				for (Estado estado : estados) {
					System.out.println(estado.getId() + " " + estado.getNome());
				}
			} catch (Exception e) {
				e.printStackTrace();
			}*/

		// TESTE DE PESQUISA PARCIAL PELO NOME
		/*try {
			ArrayList<Estado> estados = ServiceFactory.getEstadoservice().pesquisaNome("ara");
			for (Estado estado : estados) {
				System.out.println(estado.getId() + " " + estado.getNome());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}*/

		// TESTE DE PESQUISA PELA SIGLA
		/*try {
			ArrayList<Estado> estados = ServiceFactory.getEstadoservice().pesquisaSigla("PR");
			for (Estado estado : estados) {
				System.out.println(estado.getId() + " " + estado.getNome());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}*/
		
		// TESTE DE PESQUISA PELO PAIS
		try {
			Pais pais = ServiceFactory.getPaisservice().pesquisaPais(2);
			ArrayList<Estado> estados = ServiceFactory.getEstadoservice().pesquisaPais(pais);
			for (Estado estado : estados) {
				System.out.println(estado.getId() + " " + estado.getNome());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
