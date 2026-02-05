package ph.com.bpi.jdbc_maven;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class dbconnection {

	private static final String URL = "jdbc:postgresql://localhost:5432/training_db";
	private static final String USER = "postgres";
	private static final String PASSWORD = "postgres";
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection conn = null;
		
		try {
			conn = DriverManager.getConnection(URL, USER, PASSWORD);
			System.out.println("Connected to PostgreSQL successfully.");
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
	
	

