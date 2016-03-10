package br.com.xkinfo.cadastro.service.impl;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Calendar;

import br.com.xkinfo.cadastro.model.Proprietario;
import br.com.xkinfo.cadastro.service.IProprietarioService;
import br.com.xkinfo.dao.DaoFactory;
import br.com.xkinfo.endereco.model.Estado;
import br.com.xkinfo.service.ServiceFactory;

public class ProprietarioService implements IProprietarioService{
	
	Proprietario proprietario;

	@Override
	public void incluirProprietario(String nome, String cnpjCpf, String telefone, String municipio, String endereco,
			String obs, String complemento, String bairro, String cep, String obs1, Calendar dataProcessamento,
			Estado estado) throws Exception {
		proprietario = new Proprietario();
		proprietario.setNome(nome);
		proprietario.setCnpjCpf(cnpjCpf);
		proprietario.setTelefone(telefone);
		proprietario.setMunicipio(municipio);
		proprietario.setEndereco(endereco);
		proprietario.setObs(obs);
		proprietario.setComplemento(complemento);
		proprietario.setBairro(bairro);
		proprietario.setCep(cep);
		proprietario.setObs1(obs1);
		proprietario.setDataProcessamento(dataProcessamento);
		proprietario.setEstado(estado);
		DaoFactory.getProprietariodao().incluirProprietario(proprietario);
	}

	@Override
	public void alterarProprietario(int id, String nome, String cnpjCpf, String telefone, String municipio,
			String endereco, String obs, String complemento, String bairro, String cep, String obs1,
			Calendar dataProcessamento, Estado estado) throws Exception {
		proprietario = new Proprietario();
		proprietario.setId(id);
		proprietario.setNome(nome);
		proprietario.setCnpjCpf(cnpjCpf);
		proprietario.setTelefone(telefone);
		proprietario.setMunicipio(municipio);
		proprietario.setEndereco(endereco);
		proprietario.setObs(obs);
		proprietario.setComplemento(complemento);
		proprietario.setBairro(bairro);
		proprietario.setCep(cep);
		proprietario.setObs1(obs1);
		proprietario.setDataProcessamento(dataProcessamento);
		proprietario.setEstado(estado);
		DaoFactory.getProprietariodao().alterarProprietario(proprietario);
	}

	@Override
	public void excluirProprietario(int id) throws Exception {
		proprietario = pesquisarProprietario(id);
		DaoFactory.getProprietariodao().excluirProprietario(proprietario);
	}

	@Override
	public ArrayList<Proprietario> pesquisarProprietarios() throws Exception {
		ResultSet rs = DaoFactory.getProprietariodao().pesquisarProprietarios();
		ArrayList<Proprietario> proprietarios = new ArrayList<>();
		while(rs.next()){
			proprietario = new Proprietario();
			proprietario.setId(rs.getInt("PRO_NUMERO"));
			proprietario.setNome(rs.getString("PRO_NOME"));
			proprietario.setCnpjCpf(rs.getString("PRO_CNPJ_CPF"));
			proprietario.setTelefone(rs.getString("PRO_FONE"));
			proprietario.setMunicipio(rs.getString("PRO_MUNICIPIOS"));
			proprietario.setEndereco(rs.getString("PRO_ENDERECO"));
			proprietario.setObs(rs.getString("PRO_OBS"));
			proprietario.setComplemento(rs.getString("PRO_COMPLEMENTO"));
			proprietario.setBairro(rs.getString("PRO_BAIRRO"));
			proprietario.setCep(rs.getString("PRO_CEP"));
			proprietario.setObs1(rs.getString("PRO_OBS1"));
			proprietario.setDataProcessamento(ServiceFactory.getApoioservice().converteCalendar(rs.getDate("PRO_DTAPROC")));
			proprietario.setEstado(ServiceFactory.getEstadoservice().pesquisaSigla(rs.getString("EST_SIGLA")));
			proprietarios.add(proprietario);
		}
		return proprietarios;
	}

	@Override
	public Proprietario pesquisarProprietario(int id) throws Exception {
		ResultSet rs = DaoFactory.getProprietariodao().pesquisarProprietario(id);
		proprietario = new Proprietario();
		while(rs.next()){
			proprietario.setId(rs.getInt("PRO_NUMERO"));
			proprietario.setNome(rs.getString("PRO_NOME"));
			proprietario.setCnpjCpf(rs.getString("PRO_CNPJ_CPF"));
			proprietario.setTelefone(rs.getString("PRO_FONE"));
			proprietario.setMunicipio(rs.getString("PRO_MUNICIPIOS"));
			proprietario.setEndereco(rs.getString("PRO_ENDERECO"));
			proprietario.setObs(rs.getString("PRO_OBS"));
			proprietario.setComplemento(rs.getString("PRO_COMPLEMENTO"));
			proprietario.setBairro(rs.getString("PRO_BAIRRO"));
			proprietario.setCep(rs.getString("PRO_CEP"));
			proprietario.setObs1(rs.getString("PRO_OBS1"));
			proprietario.setDataProcessamento(ServiceFactory.getApoioservice().converteCalendar(rs.getDate("PRO_DTAPROC")));
			proprietario.setEstado(ServiceFactory.getEstadoservice().pesquisaSigla(rs.getString("EST_SIGLA")));
		}
		return proprietario;
	}

}
