package com.example;

public class MostRepatedString {
	public static void main(String[] args) {
		String s="hi hello bye hello  hello hello welcome hi hello hi";
		String[]arr1=s.split(" ");
		String[]arr2=s.split(" ");
		int max=0;
		int min=arr1.length;
		String ans1=" ";
		String ans2=" ";
		for(int i=0;i<arr1.length;i++) {
			int c=0;
			for(int j=0;j<arr2.length;j++) {
				if(arr1[i].equals(arr2[i])) {
					c++;
					arr2[j]=" ";
					
				}
			}
			if(c>0&&c>max) {
				max=c;
				ans1=arr1[i];
				
			}
			if(c>0 &&c<min ) {
				min=c;
				ans2=arr1[i];
			
		}
	
	}
		System.out.println("most repated-"+ans1);
		System.out.println("least reptated-"+ans2);

}




}
