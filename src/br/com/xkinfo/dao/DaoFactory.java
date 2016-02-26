package br.com.xkinfo.dao;

import br.com.xkinfo.dao.impl.CargoDao;

public class DaoFactory {
	
	private static final ICargoDao cargoDao = new CargoDao();
	
	public static ICargoDao getCargodao() {
		return cargoDao;
	}

}
