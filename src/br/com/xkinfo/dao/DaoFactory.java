package br.com.xkinfo.dao;

import br.com.xkinfo.pessoa.dao.ICargoDao;
import br.com.xkinfo.pessoa.dao.IClienteDao;
import br.com.xkinfo.pessoa.dao.IEstadoDao;
import br.com.xkinfo.pessoa.dao.IFuncionarioDao;
import br.com.xkinfo.pessoa.dao.IMunicipioDao;
import br.com.xkinfo.pessoa.dao.IMunicipioIbgeDao;
import br.com.xkinfo.pessoa.dao.IPaisDao;
import br.com.xkinfo.pessoa.dao.ITipoDocumentoDao;
import br.com.xkinfo.pessoa.dao.impl.CargoDao;
import br.com.xkinfo.pessoa.dao.impl.ClienteDao;
import br.com.xkinfo.pessoa.dao.impl.EstadoDao;
import br.com.xkinfo.pessoa.dao.impl.FuncionarioDao;
import br.com.xkinfo.pessoa.dao.impl.MunicipioDao;
import br.com.xkinfo.pessoa.dao.impl.MunicipioIbgeDao;
import br.com.xkinfo.pessoa.dao.impl.PaisDao;
import br.com.xkinfo.pessoa.dao.impl.TipoDocumentoDao;

public class DaoFactory {
	
	private static final ICargoDao cargoDao = new CargoDao();
	private static final IFuncionarioDao funcionarioDao = new FuncionarioDao();
	private static final IPaisDao paisDao = new PaisDao();
	private static final IEstadoDao estadoDao = new EstadoDao();
	private static final IMunicipioDao municipioDao = new MunicipioDao();
	private static final ITipoDocumentoDao tipoDocumentoDao = new TipoDocumentoDao();
	private static final IClienteDao clienteDao = new ClienteDao();
	private static final IMunicipioIbgeDao municipioIbgeDao = new MunicipioIbgeDao();
	
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
}
