package com.example;

public class MaxElemetsString {
	public static void main(String[] args) {
		String s="hi hello bye hi hello hi";
		String[]arr1=s.split(" ");
		String[]arr2=s.split(" ");
		int max=0;
		String ans=" ";
		for(int i=0;i<arr1.length;i++) {
			int c=0;
			for(int j=0;j<arr2.length;j++) {
				if(arr1[i].equals(arr2[i])) {
					c++;
					arr2[j]=" ";
					
				}
			}
			if(c>0&&c<max) {
				max=c;
				ans=arr1[i];
				
			}
			System.out.println(ans);
		}
	
	}

}


