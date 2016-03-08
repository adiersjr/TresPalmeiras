package br.com.xkinfo.dao;

import br.com.xkinfo.arrecadacao.dao.impl.*;
import br.com.xkinfo.endereco.dao.IEstadoDao;
import br.com.xkinfo.endereco.dao.IMunicipioDao;
import br.com.xkinfo.endereco.dao.IMunicipioIbgeDao;
import br.com.xkinfo.endereco.dao.IPaisDao;
import br.com.xkinfo.endereco.dao.impl.EstadoDao;
import br.com.xkinfo.endereco.dao.impl.MunicipioDao;
import br.com.xkinfo.endereco.dao.impl.MunicipioIbgeDao;
import br.com.xkinfo.endereco.dao.impl.PaisDao;
import br.com.xkinfo.arrecadacao.dao.*;
import br.com.xkinfo.pessoa.dao.*;
import br.com.xkinfo.pessoa.dao.impl.*;

public class DaoFactory {
	
	private static final ICargoDao cargoDao = new CargoDao();
	private static final IFuncionarioDao funcionarioDao = new FuncionarioDao();
	private static final IPaisDao paisDao = new PaisDao();
	private static final IEstadoDao estadoDao = new EstadoDao();
	private static final IMunicipioDao municipioDao = new MunicipioDao();
	private static final ITipoDocumentoDao tipoDocumentoDao = new TipoDocumentoDao();
	private static final IClienteDao clienteDao = new ClienteDao();
	private static final IMunicipioIbgeDao municipioIbgeDao = new MunicipioIbgeDao();
	private static final IBancoDao bancoDao = new BancoDao();
	private static final IAgenciaDao agenciaDao = new AgenciaDao();
	private static final IRetornoDao retornoDao = new RetornoDao();
	
	public static ICargoDao getCargodao() {
		return cargoDao;
	}
	public static IFuncionarioDao getFuncionariodao() {
		return funcionarioDao;
	}
	public static IPaisDao getPaisdao() {
		return paisDao;
	}
	public static IEstadoDao getEstadodao() {
		return estadoDao;
	}
	public static IMunicipioDao getMunicipiodao() {
		return municipioDao;
	}
	public static ITipoDocumentoDao getTipodocumentodao() {
		return tipoDocumentoDao;
	}
	public static IClienteDao getClientedao() {
		return clienteDao;
	}
	public static IMunicipioIbgeDao getMunicipioibgedao() {
		return municipioIbgeDao;
	}
	public static IBancoDao getBancodao() {
		return bancoDao;
	}
	public static IAgenciaDao getAgenciadao() {
		return agenciaDao;
	}
	public static IRetornoDao getRetornodao() {
		return retornoDao;
	}
}
