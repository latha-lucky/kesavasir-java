package com.jspiders.p1;

public class Mainbean {

	public static void main(String[] args) {
		Studentbean s1=new Studentbean(24);
		s1.setAge(23);
		int age=s1.getAge();
		System.out.println(age);
		System.out.println(s1.getAge());

	}

}
