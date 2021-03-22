package it.polito.tdp.ufo.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TestDB {

	public static void main(String[] args) {
		String jdbcURL = "jdbc:mysql://localhost?user=root&password=30Franci499";
		
		try {
			Connection connection = DriverManager.getConnection(jdbcURL);
		} catch (SQLException e) {
			e.printStackTrace();
		} 

	}

}
