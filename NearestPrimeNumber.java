package com.ty;

public class NearestPrimeNumber {
	static boolean isPrime(int n) {
		int c=0;
		for(int i=1;i<=n;i++) {
			if(n%i==0) {
				c++;
			}
		}
		if(c==2) {
			return true;
		}
		else {
			return false;
		}
	}
	public static void main(String[] args) {
		int n=7;
		if(isPrime(n)==true) {
			System.out.println(n+" "+0);
		}
		else {
			int b=0,f=0;
			for(int i=n; ;i++) {
				boolean ans=isPrime(i);
				if(ans==true) {
					break;
					
				}
				f++;
				
			}
			System.out.println(n+f+" "+f);
		}
	}


}
