package com.jspider.p1;

public class Maincar {
	public static void main(String[] args) {
		Carequals c1=new Carequals("suzki",50000);
		Carequals c2=new Carequals("suzki",50000);
		System.out.println(c1.equals(c2));
		if(c1.equals(c2)) {
			System.out.println("brand and cost are same");
		}
		else {
			System.out.println("brand and cost are not same");
		}
		
	}

}
