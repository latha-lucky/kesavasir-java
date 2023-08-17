package com.example;

public class SumOfDuplicateElements {
	public static void main(String[] args) {
		int[]arr1= {10,3,4,7,3,4,9,6,7};
		int[]arr2= {10,3,4,7,3,4,9,6,7};
		int sum=0;
		for(int i=0;i<arr1.length;i++) {
			int c=0;
			for(int j=0;j<arr2.length;j++) {
				if(arr1[i]==arr2[j]) {
					c++;
					arr2[j]=0;
				}
			}
			if(c>1) {
				sum=sum+arr1[i];
			}
		}
		System.out.println(sum);
		
	}

}
