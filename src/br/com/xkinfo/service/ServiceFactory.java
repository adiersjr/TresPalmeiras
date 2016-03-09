package br.com.xkinfo.service;

import br.com.xkinfo.arrecadacao.service.*;
import br.com.xkinfo.arrecadacao.service.impl.*;
import br.com.xkinfo.endereco.service.*;
import br.com.xkinfo.endereco.service.impl.*;
import br.com.xkinfo.pessoa.service.*;
import br.com.xkinfo.pessoa.service.impl.*;
import br.com.xkinfo.service.impl.ApoioService;
import br.com.xkinfo.outros.service.*;
import br.com.xkinfo.outros.service.impl.*;
import br.com.xkinfo.cadastro.service.*;
import br.com.xkinfo.cadastro.service.impl.*;

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
	private static final IBancoService bancoService = new BancoService();
	private static final IAgenciaService agenciaService = new AgenciaService();
	private static final IRetornoService retornoService = new RetornoService();
	private static final IBairroService bairroService = new BairroService();
	private static final ITipoLogradouroService tipoLogradouroService = new TipoLogradouroService();
	private static final IRuaService ruaService = new RuaService();
	private static final IEtaService etaService = new EtaService();
	private static final IGrupoAtividadeService grupoAtividadeService = new GrupoAtividadeService();
	private static final IAtividadeService atividadeService = new AtividadeService();
	
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
	public static IBancoService getBancoservice() {
		return bancoService;
	}
	public static IAgenciaService getAgenciaservice() {
		return agenciaService;
	}
	public static IRetornoService getRetornoservice() {
		return retornoService;
	}
	public static IBairroService getBairroservice() {
		return bairroService;
	}
	public static ITipoLogradouroService getTipologradouroservice() {
		return tipoLogradouroService;
	}
	public static IRuaService getRuaservice() {
		return ruaService;
	}
	public static IEtaService getEtaservice() {
		return etaService;
	}
	public static IGrupoAtividadeService getGrupoatividadeservice() {
		return grupoAtividadeService;
	}
	public static IAtividadeService getAtividadeservice() {
		return atividadeService;
	}
}
