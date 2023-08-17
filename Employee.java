package com.jspiders;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Employee {
	public static void main(String[] args) {
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/myjdbc","root","root");
		Statement statement=connection.createStatement();
		statement.execute("insert into employeedetails values(2,'tom',40000,'software')");
		connection.close();
		System.out.println("Data saved");
		}
		catch(ClassNotFoundException |SQLException e) {
			e.printStackTrace();
		}
		
	}

}



