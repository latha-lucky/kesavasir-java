package com.example;

import java.util.ArrayList;
import java.util.Collections;

public class LargestNumberInOrderToRightSide {
	public static void main(String[] args) {
		int[]arr= {10,2,77,18,23,78,18,8};
		for(int i=0;i<arr.length;i++) {
			ArrayList<Integer>l=new ArrayList<Integer>();
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]<arr[j]) {
					l.add(arr[j]);
				}
			}
			if(l.size()==0) {
				arr[i]=-1;
			}
			else {
				Collections.sort(l);
				arr[i]=l.get(0);
			}
		}
		for(int ele:arr) {
			System.out.println(ele+" ");
		}
	}

}
