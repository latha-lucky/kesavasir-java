package com.example;

public class SortingSwapNumber {
	public static void main(String[] args) {
		int[]arr= {5,1,3,4,2};
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		for(int ele:arr) {
			System.out.println(ele);
		}
	}

}
