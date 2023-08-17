package com.example;

import java.util.Scanner;

public class FabioncciSeries {
	public static void main(String[] args) {
		Scanner ip=new Scanner(System.in);
		System.out.println("enter a number");
		int n=ip.nextInt();
		int n1=0,n2=1;
		int sum=0;
		int i=1;
		while(i<=n) {
			System.out.println(n1);
			sum=n1+n2;
			n1=n2;
			n2=sum;
			i++;
		}

	}

}


