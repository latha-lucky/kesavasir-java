package com.example;

import java.util.Scanner;

public class SumOfNumberInString {
	public static void main(String[] args) {
		Scanner ip=new Scanner(System.in);
		String s=ip.nextLine();
		String[]arr=s.split(" ");
		int sum=0;
		for(String ele:arr) {
			char ch=ele.charAt(0);
			
			if(ch>='0'&&ch<='9') {
				int n=Integer.parseInt(ele);
						sum=sum+n;
			}
		}
		System.out.println(sum);
	}

}
