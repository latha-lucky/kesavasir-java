package com.ty;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class StudentImp implements Student {
	Scanner sc=new Scanner(System.in);

	@Override
	public void addStudent() {
		System.out.println("enter the student id");
		int id=sc.nextInt();
		System.out.println("enter the student name");
		String name=sc.next();
		System.out.println("enter the student age");
		int age=sc.nextInt();
		System.out.println("enter the student marks");
		int marks=sc.nextInt();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/database","root","root");
			
			PreparedStatement ps=con.prepareStatement("insert into student values(?,?,?,?)");
			ps.setInt(1, id);
			ps.setString(2, name);
			ps.setInt(3, age);
			ps.setInt(4,marks);
			ps.execute();
		} catch (ClassNotFoundException e) {
		
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public void deleteStudent() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection cs=DriverManager.getConnection("jdbc:mysql://localhost:3306/database","root","root");
			PreparedStatement ps=cs.prepareStatement("delete from student where id=?");
			int id=sc.nextInt();
			ps.setInt(1, id);
			ps.execute();
			System.out.println("data deleted");
			
					
		}
		catch(ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	
	
		
		
	}


	@Override
	public void updateStudent() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection cs=DriverManager.getConnection("jdbc:mysql://localhost:3306/database","root","root");
			PreparedStatement ps=cs.prepareStatement("update student set name='chinnu' where id=?");
			int id =sc.nextInt();
			ps.setInt(1,id);
			ps.execute();
			
					
		}
		catch(ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	
	
		
		
	}

	@Override
	public void getAllStudent() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/database","root","root");
			Statement statement=connection.createStatement();
			//statement.execute("update courses set cname='jdbc' where cid=4");
			ResultSet resultSet =statement.executeQuery("select * from student");
			while(resultSet.next()) {
				System.out.println("student id:"+resultSet.getInt(1));
				System.out.println("student name:"+resultSet.getString(2));
				System.out.println("student  age:"+resultSet.getInt(3));
				System.out.println("student  marks:"+resultSet.getInt(4));
				//System.out.println("courses trainer:"+resultSet.getString(5));
				
				System.out.println("**************************");
			}
			connection.close();
			
			}
			catch(ClassNotFoundException |SQLException e) {
				e.printStackTrace();
			}
		
		
	}

	@Override
	public void deleteAllStudent() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/database","root","root");
			
			PreparedStatement ps=con.prepareStatement("delete * from student");
			//int id=sc.nextInt();
		
			//ps.setInt(1, id);
			//ps.setString(2, name);
			//ps.setInt(3, age);
			//ps.setInt(4,marks);
			ps.execute();
		} catch (ClassNotFoundException e) {
		
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
		
		
	

	@Override
	public void getStudentById() {
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/database","root","root");
			Statement statement=connection.createStatement();
			//statement.execute("update courses set cname='jdbc' where cid=4");
			ResultSet resultSet =statement.executeQuery("select * from student where id=4");
			while(resultSet.next()) {
				System.out.println("student id:"+resultSet.getInt(1));
				System.out.println("student name:"+resultSet.getString(2));
				System.out.println("student  age:"+resultSet.getInt(3));
				System.out.println("student  marks:"+resultSet.getInt(4));
				//System.out.println("courses trainer:"+resultSet.getString(5));
				
				System.out.println("**************************");
			}
			connection.close();
			
			}
			catch(ClassNotFoundException |SQLException e) {
				e.printStackTrace();
			}
		
		
	}
		
	}




	 