package com.example;

import java.util.Scanner;

public class CountOfDigits {
	public static void main(String[] args) {
		Scanner ip=new Scanner(System.in);
		System.out.println("enter a number");
		int n=ip.nextInt();
		int c=0;
		while(n!=0) {
			n=n/10;
			c++;
		}
		System.out.println("count of digits:"+c);
	}

}
