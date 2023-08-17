package com.jspiders;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DeleteStudent {
	public static void main(String[] args) {
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/myjdbc","root","root");
		Statement statement=connection.createStatement();
	ResultSet resultSet =statement.executeQuery("select * from student1");
	while(resultSet.next()) {
		System.out.println("student Id:"+resultSet.getInt(1));
		System.out.println("student Name:"+resultSet.getString(2));
		System.out.println("**************************");
	}
		connection.close();
		//System.out.println("data saved");
		}
		catch(ClassNotFoundException |SQLException e) {
			e.printStackTrace();
		}
		
	}

}


