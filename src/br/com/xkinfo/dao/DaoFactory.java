package br.com.xkinfo.dao;

import br.com.xkinfo.arrecadacao.dao.*;
import br.com.xkinfo.arrecadacao.dao.impl.*;
import br.com.xkinfo.endereco.dao.*;
import br.com.xkinfo.endereco.dao.impl.*;
import br.com.xkinfo.pessoa.dao.*;
import br.com.xkinfo.pessoa.dao.impl.*;
import br.com.xkinfo.outros.dao.*;
import br.com.xkinfo.outros.dao.impl.*;
import br.com.xkinfo.cadastro.dao.*;
import br.com.xkinfo.cadastro.dao.impl.*;
import br.com.xkinfo.dao.impl.ContribuicaoDao;

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
	private static final IBairroDao bairroDao = new BairroDao();
	private static final ITipoLogradouroDao tipoLogradouroDao = new TipoLogradouroDao();
	private static final IRuaDao ruaDao = new RuaDao();
	private static final IEtaDao etaDao = new EtaDao();
	private static final IGrupoAtividadeDao grupoAtividadeDao = new GrupoAtividadeDao();
	private static final IAtividadeDao atividadeDao = new AtividadeDao();
	private static final IClassificacaoDao classificacaoDao = new ClassificacaoDao();
	private static final ITaxaDao taxaDao = new TaxaDao();
	private static final ISituacaoCadastroDao situacaoCadastroDao = new SituacaoCadastroDao();
	private static final IContribuicaoDao contribuicaoDao = new ContribuicaoDao();
	private static final ICadastroDao cadastroDao = new CadastroDao();
	private static final IProprietarioDao proprietarioDao = new ProprietarioDao();
	private static final IRamalLigacaoDao ramalLigacaoDao = new RamalLigacaoDao();
	private static final ISetorDao setorDao = new SetorDao();
	private static final IVencimentoDao vencimentoDao = new VencimentoDao();
	private static final IConjuntoDao conjuntoDao = new ConjuntoDao();
	private static final IArrecadaBDao arrecadaBDao = new ArrecadaBDao();
	private static final IArrecadaEDao arrecadaEDao = new ArrecadaEDao();
	private static final IArrecadaFDao arrecadaFDao = new ArrecadaFDao();
	private static final IArrecadaGDao arrecadaGDao = new ArrecadaGDao();
	
	public static ICargoDao getCargoDao() {
		return cargoDao;
	}
	public static IFuncionarioDao getFuncionarioDao() {
		return funcionarioDao;
	}
	public static IPaisDao getPaisDao() {
		return paisDao;
	}
	public static IEstadoDao getEstadoDao() {
		return estadoDao;
	}
	public static IMunicipioDao getMunicipioDao() {
		return municipioDao;
	}
	public static ITipoDocumentoDao getTipodocumentoDao() {
		return tipoDocumentoDao;
	}
	public static IClienteDao getClienteDao() {
		return clienteDao;
	}
	public static IMunicipioIbgeDao getMunicipioibgeDao() {
		return municipioIbgeDao;
	}
	public static IBancoDao getBancoDao() {
		return bancoDao;
	}
	public static IAgenciaDao getAgenciaDao() {
		return agenciaDao;
	}
	public static IRetornoDao getRetornoDao() {
		return retornoDao;
	}
	public static IBairroDao getBairroDao() {
		return bairroDao;
	}
	public static ITipoLogradouroDao getTipologradouroDao() {
		return tipoLogradouroDao;
	}
	public static IRuaDao getRuaDao() {
		return ruaDao;
	}
	public static IEtaDao getEtaDao() {
		return etaDao;
	}
	public static IGrupoAtividadeDao getGrupoatividadeDao() {
		return grupoAtividadeDao;
	}
	public static IAtividadeDao getAtividadeDao() {
		return atividadeDao;
	}
	public static IClassificacaoDao getClassificacaoDao() {
		return classificacaoDao;
	}
	public static ITaxaDao getTaxaDao() {
		return taxaDao;
	}
	public static ISituacaoCadastroDao getSituacaocadastroDao() {
		return situacaoCadastroDao;
	}
	public static IContribuicaoDao getContribuicaoDao() {
		return contribuicaoDao;
	}
	public static ICadastroDao getCadastroDao() {
		return cadastroDao;
	}
	public static IProprietarioDao getProprietarioDao() {
		return proprietarioDao;
	}
	public static IRamalLigacaoDao getRamalligacaoDao() {
		return ramalLigacaoDao;
	}
	public static ISetorDao getSetorDao() {
		return setorDao;
	}
	public static IVencimentoDao getVencimentoDao() {
		return vencimentoDao;
	}
	public static IConjuntoDao getConjuntoDao() {
		return conjuntoDao;
	}
	public static IArrecadaBDao getArrecadaBDao(){
		return arrecadaBDao;
	}
	public static IArrecadaEDao getArrecadaEDao(){
		return arrecadaEDao;
	}
	public static IArrecadaFDao getArrecadaFDao(){
		return arrecadaFDao;
	}
	public static IArrecadaGDao getArrecadaGDao(){
		return arrecadaGDao;
	}
}
