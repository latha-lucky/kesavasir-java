package com.jspiders1;

import java.util.Scanner;

public class SumOfElementsInArray {
	public static void main(String[] args) {
		Scanner ip=new Scanner(System.in);
		int size=ip.nextInt();
		int[]arr=new int[size];
		for(int i=0;i<arr.length;i++) {
			arr[i]=ip.nextInt();
			System.out.println("===============");
			int sum=0;
			for(int j=0;j<arr.length;j++) {
				sum=sum+arr[j];
			}
			System.out.println("SUM:"+sum);
			System.out.println("Avarage:"+(sum/arr.length));
		}
	}

}
