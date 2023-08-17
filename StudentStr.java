package com.jspider.p1;

public class StudentStr {
	public static void main(String[] args) {
		StudentStr s=new StudentStr();
		System.out.println(s);
		System.out.println(s.toString());
		System.out.println("=======================");
		System.out.println(s.hashCode());
		System.out.println("===================");
		  
		
		StudentStr s1=new StudentStr();
		StudentStr s2=new StudentStr();
		System.out.println(s1.equals(s2));
		System.out.println(s1==s2);
	}

}
