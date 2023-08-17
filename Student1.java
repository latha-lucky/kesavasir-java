package com.ty;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;

public class Student1 {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/jspiders","root","root");
			
	       // PreparedStatement preparedStatement=connection.prepareStatement("insert into student1 values(?,?)");
	        PreparedStatement preparedStatement=connection.prepareStatement("delete from student1 where id=?");
//			preparedStatement.setInt(1,5);
			//preparedStatement.setString(2,"devi");
			//preparedStatement.setInt(1, 7);
			//preparedStatement.setString(2, "tom");
	        preparedStatement.setInt(1, 5);                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      
			preparedStatement.execute();
			connection.close();
			System.out.println("data saved");
			
		} catch (ClassNotFoundException  |SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	

}
