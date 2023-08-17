package com.jspiders.p1;

public class Specialnumber {

	public static void main(String[] args) {
		char c='A';
		if(c>='A' && c<='Z') {
			System.out.println("alphabet");
		}
		else if(c>=0 && c<=9) {
			System.out.println("numeric");
		}
		else {
			System.out.println("special");
		}

	}

}
