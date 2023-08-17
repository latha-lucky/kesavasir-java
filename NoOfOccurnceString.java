package com.example;

public class NoOfOccurnceString {
	public static void main(String[] args) {
		String s="hi hello bye hi hello hi";
		String[]arr1=s.split(" ");
		String[]arr2=s.split(" ");
		for(int i=0;i<arr1.length;i++) {
			int c=0;
			for(int j=0;j<arr2.length;j++) {
				if(arr1[i].equals(arr2[i])) {
					c++;
					arr2[j]=" ";
					
				}
			}
			if(c>0) {
				System.out.println(arr1[i]+"-"+c);
			}
		}
	}

}
