package com.example;

import java.util.Scanner;

public class ComprasingEachElementsInString {
	public static void main(String[] args) {
		Scanner ip=new Scanner(System.in);
		System.out.println("enter string input");
		String s=ip.nextLine();
		char[]arr=s.toCharArray();
		for(int i=0;i<arr.length;i++) {
			for(int j=0;i<arr.length;j++) {
				System.out.println(arr[i]+" "+arr[j]);
				
			}
		}
	}

}
