package com.example;

public class NumberConvertedToString {
	public static void main(String[] args) {
		String[]arr= {"zero","one","two","three","four","six","seven","eight","nine"};
		int n=15678;
		int rem=0;
		String ans="";
		while(n!=0) {
			rem=n%10;
			ans=arr[rem]+ans;
			n=n/10;
		}
		System.out.println(ans);
	}

}
