package com.jspiders.p1;

public class Evennumber {

	public static void main(String[] args) {
		int n=45328;
		int rem=0;
		int sum=0;
		while(n!=0) {
			rem=n%10;
			if(rem%2==0) {
				sum=sum+rem;
			}
			n=n/10;
		
			System.out.println(sum);
		}

	}

}
