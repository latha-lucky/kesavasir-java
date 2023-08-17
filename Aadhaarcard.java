package com.jspiders.p1;

public class Aadhaarcard {
	String name="Tom";
	int Aadhaarno=2345;
	private static Aadhaarcard ac;
	private Aadhaarcard() {
		System.out.println("Aadhaar generated");
	}
	public static Aadhaarcard getInstance() {
		if(ac==null) {
			ac=new Aadhaarcard();
		}
		return ac; 
	}

}
