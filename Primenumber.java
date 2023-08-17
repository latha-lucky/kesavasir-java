package com.jspiders.p1;

public class Primenumber {

	public static void main(String[] args) {
		int n=98;
		int sum=0;
		int rem=0;
		while(n!=0) {
			rem=n%10;
			sum=sum+rem;
			n=n/10;
		}
		boolean ans=PrimeNo( sum);
		if(ans==true) {
			System.out.println("prime no");
		}
		else {
			System.out.println("not prime no");
		}
			
		}

	private static boolean PrimeNo(int sum) {
		// TODO Auto-generated method stub
		return false;
	}
	}
		
