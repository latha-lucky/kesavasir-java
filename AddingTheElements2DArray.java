package com.example;

import java.util.Scanner;

public class AddingTheElements2DArray {
	public static void main(String[] args) {
		Scanner ip=new Scanner(System.in);
		int[][]arr1= {{1,2,3},{4,5,6},{7,8,9}};
		int[][]arr2= {{9,11,99},{10,100,6},{12,77,88}};
		int[][]arr3=new int[3][3];
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				arr3[i][j]=arr1[i][j]+arr2[i][j];
			}
		}
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				System.out.print(arr3[i][j]+" ");
			}
			System.out.println();
		}
	}
}
		