package com.jspiders;

public class KeshavSirProgramm {
	public static void main(String[] args) {
		int[]arr= {5,14,8,6,3,4,12};
		int[]arr1= {5,14,8,6,3,4,12};
		for(int i=0;i<arr.length;i++) {
			int c=0;
			int j=0;
			for( j=0;j<i;j++);{
				if(arr[i]<arr1[j]) {
					c++;
				}
			}
			arr[i]=c;
			
		}
		for(int ele:arr) {
			System.out.println(ele+" ");
		}
		
	}

}
