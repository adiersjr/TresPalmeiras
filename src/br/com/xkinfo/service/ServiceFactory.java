package br.com.xkinfo.service;

import br.com.xkinfo.service.impl.CargoService;
import br.com.xkinfo.service.impl.FuncionarioService;

public class ServiceFactory {

	public static final ICargoService cargoService = new CargoService();
	public static final IFuncionarioService funcionarioService = new FuncionarioService();
	
	
	public static ICargoService getCargoservice() {
		return cargoService;
	}
	public static IFuncionarioService getFuncionarioservice() {
		return funcionarioService;
	}
}
