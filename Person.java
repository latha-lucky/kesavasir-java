package com.jspiders.p1;

abstract  class Person {
	abstract void eat();	
}
class Jack extends Person{
	void eat() {
		System.out.println("eating biryani");
	}
	public static void main(String[] args) {
		Jack j=new Jack();
		j.eat();
		
	}
}
