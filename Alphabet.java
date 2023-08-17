package com.jspiders.p1;

public class Alphabet {

	public static void main(String[] args) {
		char c='D';
		if(c>='a' && c<='z') {
			System.out.println("alphabet small");
		}
		else if(c<='A'&& c<='Z') {
			System.out.println("alphabet upper");	
		}
		else {
			System.out.println("not alphabet ");
		}

	}

}
