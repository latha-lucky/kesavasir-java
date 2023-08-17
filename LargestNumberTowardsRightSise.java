package com.example;

public class LargestNumberTowardsRightSise {
	public static void main(String[] args) {
		int[]arr= {5,55,6,78,16,9};
		for(int i=0;i<arr.length;i++) {
			int value=-1;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]<arr[j]) {
					value=arr[i];
					break;
				}
				arr[i]=value;
			}
			for(int k=0;k<=arr.length;k++) {
				
				System.out.println(arr[i]+" ");
			}
		}
	}

}
