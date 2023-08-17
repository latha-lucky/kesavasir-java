package com.example;

import java.util.Scanner;

public class PrimeNumber {
	public static void main(String[] args) {
		Scanner ip=new Scanner(System.in);
		System.out.println("enter a number");
		int n=ip.nextInt();
		int c=0;
		for(int i=1;i<=n;i++) {
			if(n%i==0) {
				c++;
				
			}
		}
		if(c==2) {
			System.out.println("prime number");
		}
		else {
			System.out.println("not a prime number");
		}
	}

}
