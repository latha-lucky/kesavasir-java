package com.jspiders.p1;

import java.util.Scanner;

public class Luckyemply {

	public static void main(String[] args) {
		Scanner ip=new Scanner(System.in);
		System.out.println("enter a number");
		int n=ip.nextInt();
		int sum=0;
		int rem=0;
		for(int i=1;i<=4;i++) {
			rem=n%10;
			sum=sum+rem;
			n=n/10;
		}
		if(sum%2==1) {
			System.out.println("lucky emply");
		}
		else {
			System.out.println("not a lucky emply");
		}

	}

}
