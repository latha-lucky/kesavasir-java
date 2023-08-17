package com.jspider.p1;

public class Mainclass1 {

	public static void main(String[] args) {
		Calculator c1=new Calculator();
		c1.square(34);
		c1.square((int)3.9);
		int n=c1.test();
		System.out.println("n value is"+n);

	}

}
