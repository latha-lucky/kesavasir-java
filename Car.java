package com.jspiders.p1;

public class Car {
	static {
		System.out.println(1);
	}
	public static void main(String[] args) {
		System.out.println("start");
		Car c=new Car();
		System.out.println("end");
		new Car();
		
	}
	{
		System.out.println(2);
	}
	static {
		System.out.println(3);
	}
	public void start() {
		// TODO Auto-generated method stub
		
	}

}

