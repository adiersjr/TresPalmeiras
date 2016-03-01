package br.com.xkinfo.teste;

//import java.util.ArrayList;
import br.com.xkinfo.model.TipoDocumento;
import br.com.xkinfo.service.ServiceFactory;

public class TesteTipoDocumento {

	public static void main(String[] args) {
		// TESTE DE INCLUSÃO
		/*String descricao = "CREA";
		boolean pessoal = true;
		try {
			ServiceFactory.getTipodocumentoservice().incluirTipoDocumento(descricao, pessoal);
		} catch (Exception e) {
			e.printStackTrace();
		}*/

		// TESTE DE ALTERAÇÃO
		/*int id = 1;
		String desc = "CAU";
		boolean pessoal = true;
		try {
			ServiceFactory.getTipodocumentoservice().alterarTipoDocumento(id, desc, pessoal);
		} catch (Exception e) {
			e.printStackTrace();
		}*/

		// TESTE DE EXCLUSÃO
		/*int ide = 1;
		try {
			ServiceFactory.getTipodocumentoservice().excluirTipoDocumento(ide);
		} catch (Exception e) {
			e.printStackTrace();
		}*/

		// TESTE DE PESQUISA GERAL
		/*try {
			ArrayList<TipoDocumento> lista = ServiceFactory.getTipodocumentoservice().pesquisaTipoDocumentos();
			for (TipoDocumento tipoDocumento : lista) {
				System.out.println(tipoDocumento.getId() + " " + tipoDocumento.getDescricao());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}*/

		// TESTE DE PESQUISA PARCIAL NOME
		/*try {
			ArrayList<TipoDocumento> lista = ServiceFactory.getTipodocumentoservice().pesquisaDescricao("a");
			for (TipoDocumento tipoDocumento : lista) {
				System.out.println(tipoDocumento.getId() + " " + tipoDocumento.getDescricao());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}*/

		// TESTE DE PESQUISA POR ID
		try {
			TipoDocumento tipoDocumento = ServiceFactory.getTipodocumentoservice().pesquisaTipoDocumento(2);
			System.out.println(tipoDocumento.getId() + " " + tipoDocumento.getDescricao());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
