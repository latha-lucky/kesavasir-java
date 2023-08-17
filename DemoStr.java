package com.jspider.p1;

public class DemoStr {
	public static void main(String[] args) {
		String s=new String("A");
		System.out.println(s);
		System.out.println(s.toString());
		System.out.println("=================");
		System.out.println(s.hashCode());
		
		
		String s1=new String();
		String s2=new String();
		System.out.println(s1.equals(s2));
		
	}

}
