package com.example;

import java.util.Scanner;

public class TrvesringString {
	public static void main(String[] args) {
		Scanner ip=new Scanner(System.in);
		System.out.println("enter string input");
		String s=ip.nextLine();
		for(int i=0;i<s.length();i++) {
			System.out.println(s.charAt(i));
		}

	}

}


