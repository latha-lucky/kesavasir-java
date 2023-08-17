package com.jspiders.p1;

import java.util.Scanner;

public class Awesomenumber {

	public static void main(String[] args) {
		Scanner ip=new Scanner(System.in);
		System.out.println("enter a number");
		int n=ip.nextInt();
		int n1;
		if(n/3==0 && n/7==0 && n/9==0) {
			System.out.println("awesome number");
		}
		else {
			System.out.println("not a awesome number");
		}

	}

}
