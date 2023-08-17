package com.example;

import java.util.Scanner;

public class SumOfDigts {
	public static void main(String[] args) {
		Scanner ip=new Scanner(System.in);
		System.out.println("enter a number");
		int n=ip.nextInt();
		int sum=0;
		int rem=0;
		while(n!=0) {
			rem=n%10;
			sum=sum+rem;
			n=n/10;
		}
		System.out.println(sum);

	}

}
