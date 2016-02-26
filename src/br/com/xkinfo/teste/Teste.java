package br.com.xkinfo.teste;

import br.com.xkinfo.model.Cargo;
import br.com.xkinfo.service.ServiceFactory;

public class Teste {

	public static void main(String[] args) {

		// TESTE DE INCLUSÃO
		Cargo cargo = new Cargo();
		cargo.setDescricao("Gerente");
		try {
			ServiceFactory.getCargoservice().incluirCargo(cargo);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
