package com.example;

import java.util.Scanner;

public class FactorsOfNumbers {
	public static void main(String[] args) {
		Scanner ip=new Scanner(System.in);
		System.out.println("enter a number");
		int n=ip.nextInt();
		for(int i=1;i<=n;i++) {
			if(n%i==0) {
				System.out.println(i+" "+n);
			}
		}
	}

}
