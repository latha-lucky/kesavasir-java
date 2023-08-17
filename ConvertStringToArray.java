package com.example;

public class ConvertStringToArray {
	public static void main(String[] args) {
		String s="hello hi how are you";
		int sp=0;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)==' ') {
				sp++;
			}
		}
		String []arr=new String[sp+1];
		String s2=" ";
		int k=0;
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if(ch==' ') {
				arr[k]=s2;
				s2=" ";
				k++;
			}
			else {
				s2=s2+ch;
			}
		}
		arr[k]=s2;
		for(String ele:arr) {
			System.out.println(ele);
		}

}
}
