package com.example;

import java.util.Scanner;

public class SquarePerfectNumber {
	public static void main(String[] args) {
		Scanner ip=new Scanner(System.in);
		System.out.println("enter a number");
		int n=ip.nextInt();
		boolean flag=false;
		for(int i=1;i<=n;i++) {
			if(i*i==n) {
				flag=true;
			}
		}
		if(flag==false) {
			System.out.println("not a perfectsquare");
		}
		else {
			System.out.println("perfectsquare");
		}
	}

}
