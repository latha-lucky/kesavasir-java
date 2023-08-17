package com.example;

import java.util.Scanner;

public class CountOfVowels {
	public static void main(String[] args) {
		Scanner ip=new Scanner(System.in);
		System.out.println("enter string input");
		String s=ip.nextLine();
		int count=0;
		for(int i=0;i<s.length();i++) {
			char c=s.charAt(i);
			if(c=='a'||c=='e'||c=='i'||c=='u'||c=='o') {
				count++;
				
			}
			
		}
		System.out.println("vowels:"+count);
		
	}

}


