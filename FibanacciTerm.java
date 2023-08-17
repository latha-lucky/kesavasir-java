package com.jspiders;

public class FibanacciTerm {
	static int n1=0,n2=1,sum=0;
	static void fib(int n) {
		if(n>1) {
			sum=n1+n2;
			n1=n2;
			n2=sum;
			fib(n-1);
		}
		else {
			System.out.println(n1);
	}
	}
	public static void main(String[] args) {
		fib(10);
	}

}



