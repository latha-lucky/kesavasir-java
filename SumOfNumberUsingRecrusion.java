package com.jspiders;

public class SumOfNumberUsingRecrusion {
	static int sum(int n) {
		if(n==0) {
			return 0;
		}
		else {
			return n+sum(n-1);
		}
	}
	public static void main(String[] args) {
		System.out.println(sum(5));
	}
	

}
