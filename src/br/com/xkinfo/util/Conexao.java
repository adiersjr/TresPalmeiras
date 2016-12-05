package br.com.xkinfo.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
	private String host = "192.168.1.251";;
	private String user = "sil";;
	private String pass = "sil2016";
	private String database = "SIL";
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