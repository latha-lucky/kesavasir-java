package com.example;

import java.util.Scanner;

public class ComparsingEachElements {
	public static void main(String[] args) {
		int[]arr= {2,3,6,7,8};
	
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				System.out.println(arr[i]+" "+arr[j]);
			}
		}
	}

}
