package com.jspider.p1;

public class Studentequalsoverride {
	int age;
	Studentequalsoverride(int age){
		this.age=age;
	}
	public boolean equals(Object obj) {
		Studentequalsoverride s=(Studentequalsoverride)obj;
		return this.age==s.age;
	}
	public static void main(String[] args) {
		Studentequalsoverride s1=new Studentequalsoverride(20);
		Studentequalsoverride  s2=new Studentequalsoverride(20);
		System.out.println(s1.equals(s2));
		
	}
	

}
