package com.example;

public class RotationNumber1 {
	static int[]rotation(int[]arr,int n){
		for(int j=1;j<=n;j++) {
			int prev=arr[0];
			arr[0]=arr[arr.length-1];
			for(int i=1;i<arr.length;i++) {
				int temp=arr[i];
				arr[i]=prev;
				prev=temp;
			}
		}
		return arr;
		
	}
	public static void main(String[] args) {
		int []arr= {10,6,5,7,8,9};
		int[]ans =rotation(arr,4);
		for(int ele:ans) {
			System.out.println(ele+" ");
		}
	}

}
