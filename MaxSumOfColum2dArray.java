package com.example;

import java.util.Scanner;

public class MaxSumOfColum2dArray {
	public static void main(String[] args) {
		Scanner ip=new Scanner(System.in);
		int row=ip.nextInt();
		int col=ip.nextInt();
		int[][]arr=new int[row][col];
		for(int i=0;i<arr.length;i++) {
			
			for(int j=0;j<arr.length;j++) {
				arr[i][j]=ip.nextInt();
				
			}
		}
		int max=arr[0][0];
		int ans=0;
		for(int i=0;i<row;i++) {
			int sum=0;
			for(int j=0;j<col;j++) {
				sum=sum+arr[i][j];
				
			}
		if(sum>max) {
			max=sum;
			ans=i;
		}
		}
		System.out.println(ans);
	}



}
