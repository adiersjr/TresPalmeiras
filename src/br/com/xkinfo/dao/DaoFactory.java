package br.com.xkinfo.dao;

import br.com.xkinfo.dao.impl.CargoDao;
import br.com.xkinfo.dao.impl.ClienteDao;
import br.com.xkinfo.dao.impl.EstadoDao;
import br.com.xkinfo.dao.impl.FuncionarioDao;
import br.com.xkinfo.dao.impl.MunicipioDao;
import br.com.xkinfo.dao.impl.PaisDao;
import br.com.xkinfo.dao.impl.TipoDocumentoDao;

public class DaoFactory {
	
	private static final ICargoDao cargoDao = new CargoDao();
	private static final IFuncionarioDao funcionarioDao = new FuncionarioDao();
	private static final IPaisDao paisDao = new PaisDao();
	private static final IEstadoDao estadoDao = new EstadoDao();
	private static final IMunicipioDao municipioDao = new MunicipioDao();
	private static final ITipoDocumentoDao tipoDocumentoDao = new TipoDocumentoDao();
	private static final IClienteDao clienteDao = new ClienteDao();
	
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
}
