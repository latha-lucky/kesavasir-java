package com.example;

import java.util.Scanner;

public class SumOfDigitString {
	public static void main(String[] args) {
		Scanner ip=new Scanner(System.in);
		System.out.println("enter string input");
		String s=ip.nextLine();
		int sum=0;
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if(ch>'0'&&ch<='9') {
				int n=ch-48;
				sum=sum+n;
			}
		}
		System.out.println(sum);
	}

}
