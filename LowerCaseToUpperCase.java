package com.example;



public class LowerCaseToUpperCase {
	public static void main(String[] args) {
		String s="Hello13@HI@bYE123";
		String s2=" ";
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if(ch>='a'&&ch<='z') {
				ch-=32;
				s2=s2+ch;
			}
			else if (ch>='A'&&ch<='Z') {
					ch+=32;
					s2=s2+ch;
				}
			else {
				s2=s2+ch;
			}
		}
			System.out.println(s2);
		}
	}


