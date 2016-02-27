package br.com.xkinfo.dao;

import br.com.xkinfo.dao.impl.CargoDao;
import br.com.xkinfo.dao.impl.FuncionarioDao;

public class DaoFactory {
	
	private static final ICargoDao cargoDao = new CargoDao();
	private static final IFuncionarioDao funcionarioDao = new FuncionarioDao();
	
	public static ICargoDao getCargodao() {
		return cargoDao;
	}
	public static IFuncionarioDao getFuncionariodao() {
		return funcionarioDao;
	}
}
