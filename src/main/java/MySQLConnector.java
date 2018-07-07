package main.java;

import java.sql.*;
import credentials.SQLCredentials;

public class MySQLConnector {
	

	
	private static String connectionString = "jdbc:mysql://localhost:3306/testdb?useSSL=false";
	private static Connection connection;
	private static Statement command;
	private static ResultSet data;

	public static void main(String[] args) {

		try {
			connection = DriverManager.getConnection(
					connectionString, 
					SQLCredentials.getUsername(), 
					SQLCredentials.getPassword());
			command = connection.createStatement();
			command.execute("INSERT INTO sample (first_category) VALUES ('value1')");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		

	}

}
