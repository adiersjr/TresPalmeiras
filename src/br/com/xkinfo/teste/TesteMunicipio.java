package br.com.xkinfo.teste;

import java.util.ArrayList;

import br.com.xkinfo.pessoa.model.Estado;
import br.com.xkinfo.pessoa.model.Municipio;
import br.com.xkinfo.service.ServiceFactory;

public class TesteMunicipio {

	public static void main(String[] args) {
		
		// TESTE DE INCLUSAO
		/*Estado estado = null;
		try {
			estado = ServiceFactory.getEstadoservice().pesquisaEstado(4);
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		String nome = "Florianópolis";
		String cep = "88020-000";
		String ibge = "1";
		String prodist = "1";
		try {
			ServiceFactory.getMunicpioservice().incluirMunicipio(estado, nome, cep, ibge, prodist);
		} catch (Exception e) {
			e.printStackTrace();
		}*/
		
		// TESTE DE ALTERACAO
		/*Estado estado = null;
		try {
			estado = ServiceFactory.getEstadoservice().pesquisaEstado(5);
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		String nome = "São Paulo";
		String cep = "88020-000";
		String ibge = "1";
		String prodist = "1";
		int ide = 3;
		try {
			ServiceFactory.getMunicpioservice().alterarMunicipio(ide, estado, nome, cep, ibge, prodist);
		} catch (Exception e) {
			e.printStackTrace();
		}*/

		// TESTE DE EXCLUSÃO
		/*int idDelete = 3;
		try {
			ServiceFactory.getMunicpioservice().excluirMunicipio(idDelete);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/

		// TESTE DE PESQUISA GERAL
		/*try {
			ArrayList<Municipio> municipios = ServiceFactory.getMunicpioservice().pesquisaMunicipios();
			for (Municipio municipio : municipios) {
				System.out.println(municipio.getId() + " " + municipio.getNome());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}*/

		// TESTE DE PESQUISA PARCIAL PELO NOME
		/*try {
			ArrayList<Municipio> municipios = ServiceFactory.getMunicpioservice().pesquisaNome("lis");
			for (Municipio municipio : municipios) {
				System.out.println(municipio.getId() + " " + municipio.getNome());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}*/

		// TESTE DE PESQUISA PELO ESTADO
		Estado estado = null;
		try {
			estado = ServiceFactory.getEstadoservice().pesquisaEstado(4);
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try {
			ArrayList<Municipio> municipios = ServiceFactory.getMunicpioservice().pesquisaEstado(estado);
			for (Municipio municipio : municipios) {
				System.out.println(municipio.getId() + " " + municipio.getNome());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
