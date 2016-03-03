package br.com.xkinfo.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import br.com.xkinfo.dao.IMunicipioIbgeDao;
import br.com.xkinfo.model.MunicipioIbge;
import br.com.xkinfo.util.Conexao;

public class MunicipioIbgeDao implements IMunicipioIbgeDao{

	Conexao conexao = new Conexao();
	private Statement st;

	@Override
	public int incluirMunicipioIbge(MunicipioIbge municipio) throws Exception {
		int result = -1;
		String query;
		query = "INSERT INTO MUNICIPIOSIBGE (MUI_CODIGO,MUI_SITUACAO, MUI_NOME, MUI_OBSERVACAO, MUI_AMAZONIA, MUI_FRONTEIRA, MUI_CAPITAL, EST_CODIGO, "
				+ " MUI_ANOINSTALACAO, MUI_ANOEXTINCAO, MUI_SUCESSOR, MUI_LATITUDE, MUI_LONGITUDE, MUI_ALTITUDE, MUI_AREA) "
				+ " VALUES (3,'"+municipio.getSituacao()+"', '"+municipio.getNome()+"', '"+municipio.getObservacao()+"', '"+municipio.getAmazonia()+"', "
				+ " '"+municipio.getFronteira()+"', '"+municipio.getCapital()+"', "+municipio.getEstado().getId()+", '"+municipio.getAnoInstalacao()+"', "
				+ " '"+municipio.getAnoExtincao()+"', '"+municipio.getSucessor()+"', "+municipio.getLatitude()+", "+municipio.getLongitude()+", "
				+ " "+municipio.getAltitude()+", "+municipio.getArea()+") ";
		try {
			st = conexao.connect().createStatement();
			result = st.executeUpdate(query);
			conexao.connect().close();
		} catch ( SQLException e ) {
			e.printStackTrace();
		}
		return result;
	}

	@Override
	public int alterarMunicipioIbge(MunicipioIbge municipio) throws Exception {
		int result = -1;
		String query;
		query = "UPDATE MUNICIPIOSIBGE SET MUI_SITUACAO = '"+municipio.getSituacao()+"', MUI_NOME = '"+municipio.getNome()+"', "
				+ " MUI_OBSERVACAO = '"+municipio.getObservacao()+"', MUI_AMAZONIA = '"+municipio.getAmazonia()+"', "
				+ " MUI_FRONTEIRA = '"+municipio.getFronteira()+"', MUI_CAPITAL = '"+municipio.getCapital()+"', EST_CODIGO = "+municipio.getEstado().getId()+", "
				+ " MUI_ANOINSTALACAO = '"+municipio.getAnoInstalacao()+"', MUI_ANOEXTINCAO = '"+municipio.getAnoExtincao()+"', MUI_SUCESSOR = '"+municipio.getSucessor()+"',"
				+ " MUI_LATITUDE = "+municipio.getLatitude()+", MUI_LONGITUDE = "+municipio.getLongitude()+", MUI_ALTITUDE = "+municipio.getAltitude()+", "
				+ " MUI_AREA = "+municipio.getArea()+" WHERE MUI_CODIGO = "+municipio.getId()+" ";
		try {
			st = conexao.connect().createStatement();
			result = st.executeUpdate(query);
			conexao.connect().close();
		} catch ( SQLException e ) {
			e.printStackTrace();
		}
		return result;
	}

	@Override
	public int excluirMunicipioIbge(MunicipioIbge municipio) throws Exception {
		int result = -1;
		String query = "DELETE FROM MUNICIPIOSIBGE WHERE MUI_CODIGO = "+municipio.getId()+" ";
		try {
			st = conexao.connect().createStatement();
			result = st.executeUpdate(query);
			conexao.connect().close();
		} catch ( SQLException e ) {
			e.printStackTrace();
		}
		return result;
	}

	@Override
	public ResultSet pesquisaMunicipiosIbge() throws Exception {
		ResultSet rs = null;
		String query = "SELECT * FROM MUNICIPIOSIBGE";
		try {
			st = conexao.connect().createStatement();
			rs = st.executeQuery(query);
			conexao.connect().close();
			return rs;
		} catch ( SQLException e ) {
			e.printStackTrace();
		}
		return rs;
	}

	@Override
	public ResultSet pesquisaMunicipioIbge(int id) throws Exception {
		ResultSet rs = null;
		String query = "SELECT * FROM MUNICIPIOSIBGE WHERE MUI_CODIGO = "+id+" ";
		try {
			st = conexao.connect().createStatement();
			rs = st.executeQuery(query);
			conexao.connect().close();
			return rs;
		} catch ( SQLException e ) {
			e.printStackTrace();
		}
		return rs;
	}

}
