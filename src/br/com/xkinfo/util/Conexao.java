package br.com.xkinfo.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
	private String host = "dbsq0005.whservidor.com";;
	private String user = "xkinfo2";;
	private String pass = "xk2009";
	private String database = "xkinfo2";
	private String portNumber = "1433";
	public Connection conexao;

	public Connection connect() {

		String url;
		url = "jdbc:sqlserver://"+ host +":" + portNumber + ";databaseName=" +database;

		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			conexao = DriverManager.getConnection(url,user, pass);
			return conexao;
		} catch( SQLException e ) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		} catch ( ClassNotFoundException e ) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		return conexao;
	}
}