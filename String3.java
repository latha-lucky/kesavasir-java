package com.jspiders.p1;

public class String3 {

	public static void main(String[] args) {
		String s1="hello";
		int n=s1.length();
		for(int i=0;i<=n;i++) {
			System.out.println(i);
		}
		System.out.println("==================");
		for(int i=0;i<=n-1;i++) {
			System.out.println(i);
		}
		System.out.println("================");
		for(int i=0;i<=s1.length()-1;i++) {
			System.out.println(i);
		}

	}

}
