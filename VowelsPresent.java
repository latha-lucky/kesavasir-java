package com.example;

import java.util.Scanner;

public class VowelsPresent {
	public static void main(String[] args) {
		Scanner ip=new Scanner(System.in);
		System.out.println("enter string input");
		String s=ip.nextLine();
		s=s.toLowerCase();
		int c1=0,c2=0,c3=0,c4=0,c5=0;
		for(int i=0;i<s.length ();i++) {
			char c=s.charAt(i);
			if(c=='a') {
				c++;
			}
			else if(c=='e') {
				c2++;
			}
			else if(c=='i') {
				c3++;
			}
			else if(c=='o') {
				c4++;
			}
			else if(c=='u') {
				c5++;
			}
		}
		System.out.println("a:"+c1);
		System.out.println("e:"+c2);
		System.out.println("i:"+c3);
		System.out.println("o:"+c4);
		System.out.println("u:"+c5);
		
	}

}



