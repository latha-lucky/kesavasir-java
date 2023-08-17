package com.jspiders.p1;

import java.util.Scanner;

public class Marksnumber {

	public static void main(String[] args) {
		Scanner ip=new Scanner(System.in);
		System.out.println("enter a number");
		int n=ip.nextInt();
		int marks=100;
		if(marks>=90 && marks>100) {
			System.out.println('A');
		}
		else if(marks>=75) {
			System.out.println('B');
		}
		else if(marks>=60) {
			System.out.println('C');
		}
		else if(marks>=45) {
			System.out.println('D');
		}
		else if(marks>=35) {
			System.out.println('E');
	    }
		else {
			System.out.println("fail");
		}
	}
}
