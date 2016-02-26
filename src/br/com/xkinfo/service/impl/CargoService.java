package br.com.xkinfo.service.impl;

import br.com.xkinfo.dao.DaoFactory;
import br.com.xkinfo.model.Cargo;
import br.com.xkinfo.service.ICargoService;

public class CargoService implements ICargoService {

	@Override
	public void incluirCargo(Cargo cargo) throws Exception {
		int ret = DaoFactory.getCargodao().incluirCargo(cargo);
		if (ret == 1){
			System.out.println("Inclusão efetuada com Sucesso!");
		}
		
	}

	@Override
	public void alterarCargo() throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void excluirCargo() throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void listaCargo() throws Exception {
		// TODO Auto-generated method stub
		
	}

}
