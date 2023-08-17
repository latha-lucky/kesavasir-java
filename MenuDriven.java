package com.ty;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class MenuDriven {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/jspiders","root","root");
			boolean repeat=true;
			do {
				System.out.println("1:AddMenu\n2:DeleteManu\n3:UpdateManu\n4:GetMenu\n5:EXIT");
				System.out.println("enter your choice");
				int ch=scanner.nextInt();
				switch(ch) {
				case 1:{
					
					PreparedStatement preparedStatement=connection.prepareStatement("insert into hotel values(?,?,?,?,?)");
					//PreparedStatement preparedStatement=connection.prepareStatement("delete  hotel id=1 where name='taj'");
					System.out.println("enter the hotelid");
					preparedStatement.setInt(1, scanner.nextInt());
					
					System.out.println("enter the hotelname");
					preparedStatement.setString(2, scanner.next());
					
					System.out.println("enter the hoteladdress");
					preparedStatement.setString(3, scanner.next());
					
					System.out.println("enter the hotelrating");
					preparedStatement.setString(4, scanner.next());
					
					System.out.println("enter the hotelgst");
					preparedStatement.setString(5, scanner.next());
					
					preparedStatement.execute();
					System.out.println("data saved");
					
					
				}
			
				break;
				case 2:{//deletemenu
					PreparedStatement preparedStatement=connection.prepareStatement("delete from  hotel");
					//System.out.println("enter the id");
					preparedStatement.execute();
					System.out.println("data deleted");
				}
				
			
				break;
				case 3:{ //updatemenu
					PreparedStatement preparedStatement=connection.prepareStatement("update hotel set name='tajss' where id=?");
					System.out.println("enter the id");
					preparedStatement.setInt(1, scanner.nextInt());
					preparedStatement.execute();
					System.out.println("data updated");
				}
				break;
				case 4:{
					Statement statement=connection.createStatement();
					//statement.execute("update courses set cname='jdbc' where cid=4");
					ResultSet resultSet =statement.executeQuery("select * from hotel");
					while(resultSet.next()) {
						System.out.println("hotel  id:"+resultSet.getInt(1));
						System.out.println("hotel name:"+resultSet.getString(2));
						System.out.println("hotel address:"+resultSet.getString(3));
						System.out.println("hotel rating:"+resultSet.getString(4));
						System.out.println("hotel gst:"+resultSet.getString(5));
						
					
				}
				}
					
					
				case 5:{
					
					System.out.println("Thank you!!!!!");		
			}
				
			
			break;
			default:System.out.println("chioce 1 to 5");
			break;
		
		}
			}
		
		while(repeat);
		connection.close();
	
	}

	
			
	catch (ClassNotFoundException  | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}






