package com.simplilearn.jdbc.statement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class StatementUpdateExample {

	public static void main(String[] args) throws SQLException{
		
		System.out.println("Welcome to JDBC STATEMENT Example");
		
		try {
			//1. Load the Driver 
			//Class.forName("com.mysql.jdbc.Driver");
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("1. Driver Loded Successfully ");
			
			//2. Get the Connection
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/simplilearn", "root","root12345");	
			System.out.println("2.Connection Established ");
				
			//3 Create the Statement
			Statement stmt = conn.createStatement();
			System.out.println("3.Create the  Statement ");
			
			//4.Prepare the Query and execute
			
			stmt.executeUpdate("UPDATE Employees SET FIRST = 'Riddhi', LAST= 'Frestie' WHERE ID = 105;");
			System.out.println("4.Prepare the Query and execute ");
			
			//Executes the given SQL statement, 
			//which may be an INSERT, UPDATE, or DELETE statement 
			//or an SQL statement that returns nothing, such as an SQL DDL statement.


			//UPDATE Employees SET FIRST = 'Riddhi', LAST= 'Frestie' WHERE ID = 105;
			
			
			// 5. Close the Resource
			System.out.println("5.Close the Resource");
			conn.close();
			stmt.close();
			//rs.close();
			
		} catch (ClassNotFoundException e) {						
			e.printStackTrace();
		}

	}

}
