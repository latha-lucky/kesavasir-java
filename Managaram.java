package com.jspiders;

import java.util.Scanner;
import java.util.TreeSet;

public class Managaram {
	public static void main(String[] args) {
		Scanner ip=new Scanner(System.in);
		String s=ip.nextLine().toLowerCase();
		TreeSet s1=new TreeSet();
		for(int i=0;i<s.length();i++) {
			char c=s.charAt(i);
			if(c>='a'&& c<='z') {
				s1.add(c);
			}
			
		}
		if(s1.size()==26) {
			System.out.println("managram");
		}
		else {
			System.out.println("not a managram");
		}
	}
	

}
