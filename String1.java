package com.jspiders.p1;

public class String1 {

	public static void main(String[] args) {
		String s1="hello";
		String s2=new String("hello");
		String s3="hello";
		String s4=new String("hello");
		System.out.println(s1==s3);
		System.out.println(s2==s4);
		System.out.println("======================");
		System.out.println(s1.equals(s3));
		System.out.println(s2.equals(s4));

	}

}
