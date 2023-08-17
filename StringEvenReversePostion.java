package com.example;
import java.util.Scanner;

public class StringEvenReversePostion {
	public static void main(String[] args) {
		Scanner ip=new Scanner(System.in);
		String s=ip.nextLine();
		String[] a=s.split(" ");
		for(int i=0;i<=a.length-1;i++)
		{
			if(i%2==1) {
				String s2="";
				for(int j=a[i].length()-1;j>=0;j--) {
					char ch=a[i].charAt(j);
					s2=s2+ch;
				}
				System.out.print(s2+" ");
				s2=" ";
	
			}
			else {
				System.out.print(""+a[i]+" ");
			}
		}
	}

}
