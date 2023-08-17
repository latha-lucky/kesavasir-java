package com.jspiders.p1;

public class PrimeMinister {
	String name="Mr.modi";
	int age=72;
	private static PrimeMinister pm;
	private PrimeMinister() {
		System.out.println("primeminister elected");
	}
	public static  PrimeMinister getInstance() {
		if(pm==null) {
			pm=new PrimeMinister();
		}
		return pm;
	}

}
