package br.com.xkinfo.service;

import br.com.xkinfo.service.impl.CargoService;
import br.com.xkinfo.service.impl.EstadoService;
import br.com.xkinfo.service.impl.FuncionarioService;
import br.com.xkinfo.service.impl.PaisService;

public class ServiceFactory {

	private static final ICargoService cargoService = new CargoService();
	private static final IFuncionarioService funcionarioService = new FuncionarioService();
	private static final IPaisService paisService = new PaisService();
	private static final IEstadoService estadoService = new EstadoService(); 
	
	
	public static ICargoService getCargoservice() {
		return cargoService;
	}
	public static IFuncionarioService getFuncionarioservice() {
		return funcionarioService;
	}
	public static IPaisService getPaisservice() {
		return paisService;
	}
	public static IEstadoService getEstadoservice() {
		return estadoService;
	}
}
