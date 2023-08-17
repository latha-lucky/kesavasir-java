package com.example;

import java.util.Scanner;

public class PalindromeString {
	public static void main(String[] args) {
		Scanner ip=new Scanner(System.in);
		System.out.println("enter string input");
		String s1=ip.nextLine();
		String s2=ip.nextLine();
		for(int i=s1.length()-1;i>=0;i--) {
			s2=s2+s1.charAt(i);
		}
		if(s1.equals(s2)) {
			System.out.println("palindrome");
			
		}
		else {
			System.out.println("not a palindrome");
		}
	}

}
