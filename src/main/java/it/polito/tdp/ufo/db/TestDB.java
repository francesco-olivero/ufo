package it.polito.tdp.ufo.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class TestDB {

	public static void main(String[] args) {
		String jdbcURL = "jdbc:mysql://localhost?user=root&password=30Franci499";
		
		try {
			Connection conn = DriverManager.getConnection(jdbcURL);
			
			Statement st = conn.createStatement();
			
			String sql = "select distinct shape"
					+ "from sighting"
					+ "where shape<>''"
					+ "order by shape ASC";
			
			conn.close(); // sistema sopporta solo x connesioni, sempre chiuderle
		} catch (SQLException e) {
			e.printStackTrace();
		} 

	}

}
