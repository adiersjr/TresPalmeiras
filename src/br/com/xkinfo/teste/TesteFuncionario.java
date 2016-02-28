package br.com.xkinfo.teste;

import java.util.Calendar;

import br.com.xkinfo.model.Cargo;
import br.com.xkinfo.service.ServiceFactory;

public class TesteFuncionario {

	public static void main(String[] args) {

		// TESTE DE INCLUSAO
		String nome = "Alexandre";
		boolean situacao = true;
		String usuario = "j";
		String senha = "123";
		String pathFoto = "null"; 
		Calendar dataNascimento = Calendar.getInstance();
		Cargo cargo = null;
		try {
			cargo = ServiceFactory.getCargoservice().pesquisaCargo(1);
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		boolean controleAcesso = false;

		try {
			ServiceFactory.getFuncionarioservice().incluirFuncionario(nome, situacao, usuario, senha, pathFoto, dataNascimento, cargo, controleAcesso);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// TESTE DE ALTERACAO
		/*String nome = "Alexandre";
		boolean situacao = true;
		String usuario = "j";
		String senha = "123";
		String pathFoto = "null"; 
		Calendar dataNascimento = Calendar.getInstance();
		Cargo cargo = null;
		int id = 16;
		try {
			cargo = ServiceFactory.getCargoservice().pesquisaCargo(1);
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		boolean controleAcesso = false;

		try {
			ServiceFactory.getFuncionarioservice().alterarFuncionario(id, nome, situacao, usuario, senha, pathFoto, dataNascimento, cargo, controleAcesso);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
	}

}
