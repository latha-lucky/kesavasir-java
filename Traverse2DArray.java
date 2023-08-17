package com.example;
import java.util.Scanner;

public class Traverse2DArray {
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
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}

}
