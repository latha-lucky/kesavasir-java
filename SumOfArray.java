package com.example;

import java.util.Scanner;

public class SumOfArray {
	public static void main(String[] args) {
		Scanner ip=new Scanner(System.in);
		System.out.println("enter array elements");
		int size=ip.nextInt();
		int[]arr=new int[size];
		for(int i=0;i<arr.length;i++) {
			arr[i]=ip.nextInt();
		System.out.println("--------------");
		int sum=0;
		for(int j=0;j<arr.length;j++) {
			sum=sum+arr[i];
		}
		System.out.println(sum);
	}

	}
}
