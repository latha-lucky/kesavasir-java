package com.jspider.p1;

public class Hotel {
	String name;
	double  rating;
	Hotel(String name,double rating){
		this.name=name;
		this.rating=rating;
	}
	public boolean equals(Object obj) {
		Hotel h=(Hotel)obj;
		return this.name ==(h.name) && this.rating ==h.rating;
	}

}
