package com.example;

import java.util.Scanner;

public class MaximumArray {
	public static void main(String[] args) {
		Scanner ip=new Scanner(System.in);
		int size=ip.nextInt();
		int[]arr=new int[size];
		for(int i=0;i<arr.length;i++) {
			arr[i]=ip.nextInt();
		
		int max=0;
		for(int j=0;j<arr.length;j++) {
			if(max<arr[j]){
				max=arr[j];
			}
		}
		System.out.println(max);
	}

}
}

