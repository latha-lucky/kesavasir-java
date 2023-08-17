package com.ty;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Courses {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/jspiders","root","root");
			Statement statement=connection.createStatement();
			//statement.execute("update courses set cname='jdbc' where cid=4");
			ResultSet resultSet =statement.executeQuery("select * from courses where trainer='udaysir'");
			while(resultSet.next()) {
				System.out.println("courses cid:"+resultSet.getInt(1));
				System.out.println("courses cname:"+resultSet.getString(2));
				System.out.println("courses fees:"+resultSet.getInt(3));
				System.out.println("courses duration:"+resultSet.getInt(4));
				System.out.println("courses trainer:"+resultSet.getString(5));
				
				System.out.println("**************************");
			}
			connection.close();
			
			}
			catch(ClassNotFoundException |SQLException e) {
				e.printStackTrace();
			}
			
		}

	}


	  
	


