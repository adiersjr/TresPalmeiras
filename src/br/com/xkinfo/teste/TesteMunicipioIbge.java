package br.com.xkinfo.teste;
/*
import java.util.ArrayList;
import br.com.xkinfo.model.Estado;
import br.com.xkinfo.model.MunicipioIbge;
import br.com.xkinfo.service.ServiceFactory;
*/
public class TesteMunicipioIbge {

	public static void main(String[] args) {

		// TESTE DE INCLUSAO
		/*Estado estado = null;
		try {
			estado = ServiceFactory.getEstadoservice().pesquisaEstado(4);
		} catch (Exception e1) {
			e1.printStackTrace();
		}
		String situacao = "tru";
		String nome = "ibicare";
		String observacao = "nada";
		char amazonia = 'N';
		char fronteira = 'N';
		char capital = 'N';
		String anoInstalacao = "1822";
		String anoExtincao = "2016";
		String sucessor = "sei la";
		Double latitude = 27.12345;
		Double longitude = 28.20201;
		Double altitude = 23.23;
		Double area = 23.234;
		try {
			ServiceFactory.getMunicipioibgeservice().incluirMunicipio(situacao, nome, observacao, amazonia, fronteira, capital, estado, anoInstalacao, anoExtincao, sucessor, latitude, longitude, altitude, area);
		} catch (Exception e) {
			e.printStackTrace();
		}*/

		// TESTE DE ALTERACAO
		/*Estado estado = null;
		try {
			estado = ServiceFactory.getEstadoservice().pesquisaEstado(4);
		} catch (Exception e1) {
			e1.printStackTrace();
		}
		String situacao = "tru";
		String nome = "Ibicaré";
		String observacao = "nada";
		char amazonia = 'N';
		char fronteira = 'N';
		char capital = 'N';
		String anoInstalacao = "1822";
		String anoExtincao = "2016";
		String sucessor = "sei la";
		Double latitude = 27.12345;
		Double longitude = 28.20201;
		Double altitude = 23.23;
		Double area = 23.234;
		int id = 3;
		try {
			ServiceFactory.getMunicipioibgeservice().alterarMunicipio(id, situacao, nome, observacao, amazonia, fronteira, capital, estado, anoInstalacao, anoExtincao, sucessor, latitude, longitude, altitude, area);
		} catch (Exception e) {
			e.printStackTrace();
		}*/

		// TESTE DE EXCLUSÃO
		/*int idDelete = 3;
		try {
			ServiceFactory.getMunicipioibgeservice().excluirMunicipio(idDelete);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/

		// TESTE DE PESQUISA GERAL
		/*try {
			ArrayList<MunicipioIbge> municipios = ServiceFactory.getMunicipioibgeservice().pesquisaMunicipios();
			for (MunicipioIbge municipioIbge : municipios) {
				System.out.println(municipioIbge.getId() + " " + municipioIbge.getNome());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}*/

	}
}
