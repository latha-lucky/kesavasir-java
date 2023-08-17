package com.jspider.p1;

public class Person {
	int age;
	String name;
	Person(int age,String name){
		this.age=age;
		this.name=name;
	}
	public String toString() {
		return name+" "+age;
	}
}

