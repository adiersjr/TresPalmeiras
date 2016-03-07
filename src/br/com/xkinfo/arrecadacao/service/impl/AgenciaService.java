package br.com.xkinfo.arrecadacao.service.impl;

import java.sql.ResultSet;
import java.util.ArrayList;

import br.com.xkinfo.arrecadacao.model.Agencia;
import br.com.xkinfo.arrecadacao.model.Banco;
import br.com.xkinfo.arrecadacao.service.IAgenciaService;
import br.com.xkinfo.dao.DaoFactory;
import br.com.xkinfo.model.Bairro;
import br.com.xkinfo.pessoa.model.Estado;
import br.com.xkinfo.service.ServiceFactory;

public class AgenciaService implements IAgenciaService{
	
	Agencia agencia;

	@Override
	public int incluirAgencia(String chave, Banco banco, String numero, String nome, String convenioF, String convenioG,
			int nsr, char digito, String endereco, String complemento, String bairro, String cep, String municipio,
			Estado estado, String ddd, String telefone) throws Exception {
		agencia = new Agencia();
		agencia.setChave(chave);
		agencia.setBanco(banco);
		agencia.setNumero(numero);
		agencia.setNome(nome);
		agencia.setConvenioF(convenioF);
		agencia.setConvenioG(convenioG);
		agencia.setNsr(nsr);
		agencia.setDigito(digito);
		agencia.setEndereco(endereco);
		agencia.setComplemento(complemento);
		agencia.setBairro(bairro);
		agencia.setCep(cep);
		agencia.setMunicipio(municipio);
		agencia.setEstado(estado);
		agencia.setDdd(ddd);
		agencia.setTelefone(telefone);
		int ret = DaoFactory.getAgenciadao().incluirAgencia(agencia);
		return ret;
	}

	@Override
	public int alterarAgencia(int id, String chave, Banco banco, String numero, String nome, String convenioF,
			String convenioG, int nsr, char digito, String endereco, String complemento, String bairro, String cep,
			String municipio, Estado estado, String ddd, String telefone) throws Exception {
		agencia = new Agencia();
		agencia.setId(id);
		agencia.setChave(chave);
		agencia.setBanco(banco);
		agencia.setNumero(numero);
		agencia.setNome(nome);
		agencia.setConvenioF(convenioF);
		agencia.setConvenioG(convenioG);
		agencia.setNsr(nsr);
		agencia.setDigito(digito);
		agencia.setEndereco(endereco);
		agencia.setComplemento(complemento);
		agencia.setBairro(bairro);
		agencia.setCep(cep);
		agencia.setMunicipio(municipio);
		agencia.setEstado(estado);
		agencia.setDdd(ddd);
		agencia.setTelefone(telefone);
		int ret = DaoFactory.getAgenciadao().alterarAgencia(agencia);
		return ret;
	}

	@Override
	public int excluirAgencia(int id) throws Exception {
		agencia = pesquisaAgencia(id);
		return DaoFactory.getAgenciadao().excluirAgencia(agencia);
	}

	@Override
	public ArrayList<Agencia> pesquisaAgencias() throws Exception {
		ResultSet rs = DaoFactory.getAgenciadao().pesquisaAgencias();
		ArrayList<Agencia> agencias = new ArrayList<>();
		while(rs.next()){
			agencia = new Agencia();
			agencia.setId(rs.getInt("AGE_CODIGO"));
			agencia.setChave(rs.getString("AGE_CHAVE"));
			agencia.setBanco(rs.getString("BAN_NUMERO"));
			agencia.setNumero(rs.getString("AGE_NUMERO"));
			agencia.setNome(rs.getString("AGE_NOME"));
			agencia.setConvenioF(rs.getString("AGE_CONVENIOF"));
			agencia.setConvenioG(rs.getString("AGE_CONVENIOG"));
			agencia.setNsr(rs.getInt("AGE_NSR"));
			agencia.setDigito(rs.getString("AGE_DV").charAt(0));
			agencia.setEndereco(rs.getString("AGE_ENDERECO"));
			agencia.setComplemento(rs.getString("AGE_COMPLEMENTO"));
			agencia.setBairro(rs.getString("AGE_BAIRRO"));
			agencia.setCep(rs.getString("AGE_CEP"));
			agencia.setMunicipio(rs.getString("AGE_MUNICIPIO"));
			agencia.setEstado(ServiceFactory.getEstadoservice().pesquisaSigla(rs.getString("EST_SIGLA")));
			agencia.setDdd(rs.getString("AGE_DDD"));
			agencia.setTelefone(rs.getString("AGE_TELEFONE"));
			agencias.add(agencia);
		}
		
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Agencia pesquisaAgencia(int id) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
