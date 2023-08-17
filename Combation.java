package com.ty;

import java.util.Scanner;

public class Combation {
	public static void main(String[] args) {
		Scanner ip=new Scanner(System.in);
		String s=ip.nextLine();
		System.out.println(s);
		String s1="";
		int f=0;
		int l=1;
		for(int i=0;i<=s.length();i++) {
			for(int j=f;j<s.length()-l;j++) {
				s1=s1+s.charAt(j);
			}
			System.out.println(s1);
			s1="";
			if(i%2==0) {
				f++;
			}
			else {
				i++;
			}
			if(s1.length()==-1) {
				break;
			}
		}
		
	}

}
