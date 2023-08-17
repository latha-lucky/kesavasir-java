package com.jspiders.p1;

public class Customer1 {
	public static void main(String[] args) {
		Amazon a=new Amazon();
		Electronics obj=a.selectorder(2);
		if(obj instanceof Mobile) {
			System.out.println("ordering mobile");
		}
		else if(obj instanceof Laptop) {
			System.out.println("ordering laptop");
		}
		else if(obj instanceof Headphone) {
			System.out.println("ordering headphone");
		}
		else {
			System.out.println("noting order");
		}
		
	}

}
