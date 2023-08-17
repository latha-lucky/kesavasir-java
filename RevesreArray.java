package com.example;

import java.util.Scanner;

public class RevesreArray {
	public static void main(String[] args) {
		
	Scanner ip=new Scanner(System.in);
	System.out.println("enter the size of array");
    int size=ip.nextInt();
	int arr[]=new int[size];
	System.out.println("please enter the elements ");
	for(int i=arr.length;i>=0;i--) {
		arr[i]=ip.nextInt();
	}
	System.out.println("array elements are:");
	for(int i=arr.length;i>=0;i--) {
		System.out.println(arr[i]+" ");
	}
	
}


}
