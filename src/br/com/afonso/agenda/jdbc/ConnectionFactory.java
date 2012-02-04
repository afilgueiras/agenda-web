package br.com.afonso.agenda.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @author afonso.jota@gmail.com (Afonso J. Filgueiras)
 */
public class ConnectionFactory {

	String dataBase = "ESTUDO";

	public Connection getConnection() {

		try {
			return DriverManager.getConnection("jdbc:mysql://localhost/"
					+ dataBase, "root", "afonsojota");
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}

	}

}
