package com.jspiders.p1;

import java.util.Scanner;

public class Positivenumber {

	public static void main(String[] args) {
		Scanner ip=new Scanner(System.in);
		System.out.println("enter a number");
		int n1=ip.nextInt();
		if(n1>=0) {
			System.out.println("positive number");
		}
		else {
			System.out.println("negative");
		}

	}

}
