package br.com.xkinfo.service;

import br.com.xkinfo.pessoa.service.ICargoService;
import br.com.xkinfo.pessoa.service.IClienteService;
import br.com.xkinfo.pessoa.service.IEstadoService;
import br.com.xkinfo.pessoa.service.IFuncionarioService;
import br.com.xkinfo.pessoa.service.IMunicipioIbgeService;
import br.com.xkinfo.pessoa.service.IMunicipioService;
import br.com.xkinfo.pessoa.service.IPaisService;
import br.com.xkinfo.pessoa.service.ITipoDocumentoService;
import br.com.xkinfo.pessoa.service.impl.CargoService;
import br.com.xkinfo.pessoa.service.impl.ClienteService;
import br.com.xkinfo.pessoa.service.impl.EstadoService;
import br.com.xkinfo.pessoa.service.impl.FuncionarioService;
import br.com.xkinfo.pessoa.service.impl.MunicipioIbgeService;
import br.com.xkinfo.pessoa.service.impl.MunicipioService;
import br.com.xkinfo.pessoa.service.impl.PaisService;
import br.com.xkinfo.pessoa.service.impl.TipoDocumentoService;
import br.com.xkinfo.service.impl.ApoioService;

public class ServiceFactory {

	private static final ICargoService cargoService = new CargoService();
	private static final IFuncionarioService funcionarioService = new FuncionarioService();
	private static final IPaisService paisService = new PaisService();
	private static final IEstadoService estadoService = new EstadoService(); 
	private static final IMunicipioService municipioService = new MunicipioService();
	private static final ITipoDocumentoService tipoDocumentoService = new TipoDocumentoService();
	private static final IApoioService apoioService = new ApoioService();
	private static final IClienteService clienteService = new ClienteService();
	private static final IMunicipioIbgeService municipioIbgeService = new MunicipioIbgeService();
	
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
	public static IMunicipioService getMunicpioservice() {
		return municipioService;
	}
	public static ITipoDocumentoService getTipodocumentoservice() {
		return tipoDocumentoService;
	}
	public static IApoioService getApoioservice() {
		return apoioService;
	}
	public static IClienteService getClienteservice() {
		return clienteService;
	}
	public static IMunicipioIbgeService getMunicipioibgeservice() {
		return municipioIbgeService;
	}
}
