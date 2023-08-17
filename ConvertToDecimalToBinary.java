package com.example;

import java.util.Scanner;

public class ConvertToDecimalToBinary {
	public static void main(String[] args) {
		Scanner ip=new Scanner(System.in);
		int n=ip.nextInt();
		int rem=0;
		String s1=" ";
		while(n!=0) {
			rem=n%2;
			s1=rem+s1;
			n=n/2;
		}
		System.out.println(s1);
	}

}
