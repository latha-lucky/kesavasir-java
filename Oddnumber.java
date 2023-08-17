package com.jspiders.p1;

public class Oddnumber {

	public static void main(String[] args) {
		int n=5679;
		int i=0;
		int rem=0;
		while(n!=0) {
			rem=n%10;
			if(rem%2!=0) {
				i=i+rem;
			}
			n=n/10;
			System.out.println(i);
		}

	}

}
