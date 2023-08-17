package com.jspiders.p1;

import java.util.Scanner;

public class Equalnumber {

	public static void main(String[] args) {
		Scanner ip=new Scanner(System.in);
		System.out.println("enter a number");
		int n1=ip.nextInt();
		int n2=ip.nextInt();
		if(n1>n2 || n2>n1) {
			System.out.println("they are not eqaul");
		}
		else {
			System.out.println("they are eqaul");
		}
	}

}
