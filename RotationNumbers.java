package com.example;

public class RotationNumbers {
	public static void main(String[] args) {
			int[]arr= {10,20,8,7,6,5};
			int n=0;
			for(int j=1;j<=n;j++) {
				int prev=arr[0];
				arr[0]=arr[arr.length-1];
				for(int i=1;i<arr.length;i++) {
					int temp=arr[i];
					arr[i]=prev;
					prev=temp;
				}
				System.out.println(arr[j]);
			}
			
	}

}
