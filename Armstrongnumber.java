package com.jspiders.p1;

import java.util.Scanner;

public class Armstrongnumber {

	public static void main(String[] args) {
		Scanner ip=new Scanner(System.in);
		System.out.println("enter a number");
		int n=ip.nextInt();
		int n1=n,n2=n;
		int c=0;
		while(n!=0) {
			c++;
			n=n/10;
		}
		int rem=0,sum=0;
		while(n1!=0) {
			rem=n1%10;
			int pow=1;
			for(int i=1;i<=c;i++) {
				pow=pow*rem;
			}
			sum=sum+pow;
			n1=n1/10;
		}
		if(n2==sum) {
			System.out.println("armstrong number");
		}
		else {
			System.out.println("not armstrong number");
		}
		

	}

}
