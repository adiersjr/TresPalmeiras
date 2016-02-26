package br.com.xkinfo.service;

import br.com.xkinfo.service.impl.CargoService;

public class ServiceFactory {

	public static final ICargoService cargoService = new CargoService();
	
	
	public static ICargoService getCargoservice() {
		return cargoService;
	}
}
