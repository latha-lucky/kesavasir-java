package com.jspiders.p1;

import java.util.Scanner;

public class Evennumber1 {

	public static void main(String[] args) {
		Scanner ip=new Scanner(System.in);
		System.out.println("enter a number");
		int n=ip.nextInt();
		if(n%2==0) {
			System.out.println(n+":is a even number");
		}
		else {
			System.out.println(n+":is a odd number");
		}

	}

}
