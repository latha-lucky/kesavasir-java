package com.example;

import java.util.Scanner;

public class FrequnecyOfCharcter {
	public static void main(String[] args) {
		Scanner ip=new Scanner(System.in);
		System.out.println("enter String input");
		String s=ip.nextLine();
		System.out.println("enter the key input");
		char key=ip.next().charAt(0);
		int c=0;
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if(ch==key) {
				c++;
			}
		}
		System.out.println(c);
		
	}

}



