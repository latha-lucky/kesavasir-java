package com.example;

import java.util.Scanner;

public class PalindromeNumber {
	public static void main(String[] args) {
		Scanner ip=new Scanner(System.in);
		System.out.println("enter a number");
		int n=ip.nextInt();
		int n1=n;
		int rem=0;
		int res=0;
		while(n!=0) {
			rem=n%10;
			res=(res*10)+rem;
			n=n/10;
		}
		System.out.println(res);


	if(n1==res) {
		System.out.println("palindrome");
	}
	else {
		System.out.println("not a palindrome");
	}
}
}

