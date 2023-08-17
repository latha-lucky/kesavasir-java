package com.ty;

import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Student s1=new StudentImp();
		while(true) {
		System.out.println("1:add student\n2:delete student\n3:updateStudent\n4:geAlltStudent\n5:deleteAllStudent\n6:getStudentById");
		System.out.println("enter your chioce");
		int ch=sc.nextInt();
		
		switch(ch) {
		case 1:
			s1.addStudent();
			break;
		case 2:
			s1.deleteStudent();
			break;
		case 3:
			s1.updateStudent();
			break;
		case 4:
			s1.getAllStudent();
			break;
		case 5:
			s1.deleteAllStudent();
			break;
		case 6:
			s1.getStudentById();
			break;
			default:
				System.out.println("invalid chioce");
			
		}
	}

}
}
