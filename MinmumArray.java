package com.example;

import java.util.Scanner;

public class MinmumArray {
	public static void main(String[] args) {
		Scanner ip=new Scanner(System.in);
		int size=ip.nextInt();
		int[]arr=new int[size];
		for(int i=0;i<arr.length;i++) {
			arr[i]=ip.nextInt();
			System.out.println("===============");
		
		int min=0;
		for(int i1=0;i1<arr.length;i1++) {
			if(min>arr[i1]){
				min=arr[i1];
			}
		}
		System.out.println(min);
	}

}
}
