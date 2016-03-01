package br.com.xkinfo.dao;

import br.com.xkinfo.dao.impl.CargoDao;
import br.com.xkinfo.dao.impl.EstadoDao;
import br.com.xkinfo.dao.impl.FuncionarioDao;
import br.com.xkinfo.dao.impl.MunicipioDao;
import br.com.xkinfo.dao.impl.PaisDao;

public class DaoFactory {
	
	private static final ICargoDao cargoDao = new CargoDao();
	private static final IFuncionarioDao funcionarioDao = new FuncionarioDao();
	private static final IPaisDao paisDao = new PaisDao();
	private static final IEstadoDao estadoDao = new EstadoDao();
	private static final IMunicipioDao municipioDao = new MunicipioDao();
	
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
}
