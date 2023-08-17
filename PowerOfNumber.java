package com.example;

import java.util.Scanner;

public class PowerOfNumber {
	public static void main(String[] args) {
		Scanner ip=new Scanner(System.in);
		System.out.println("enter a number");
		int pow=ip.nextInt();
		int base=ip.nextInt();
		int exp=ip.nextInt();
		for(int i=1;i<=exp;i++) {
			pow=pow*base;
		}
		System.out.println(pow);
		
	}

}
