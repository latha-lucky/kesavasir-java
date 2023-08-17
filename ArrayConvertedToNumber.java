package com.example;

public class ArrayConvertedToNumber {
	public static void main(String[] args) {
		int[]arr= {4,5,6};
		int ans=0;
		for(int i=0;i<arr.length;i++) {
			ans=(ans*10)+arr[i];
		}
		System.out.println(ans);
	}
}
