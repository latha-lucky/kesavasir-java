package com.jspider.p1;

public class Carequals {
	String brand;
	int cost;
	public Carequals(String brand, int cost) {
		this.brand = brand;
		this.cost = cost;
	}
	public boolean equals(Object obj) {
		Carequals c=(Carequals)obj;
		return this.brand ==(c.brand) && this.cost==c.cost;
	}
	
}
