package com.example;

public class IdenticalArray {
	public static void main(String[] args) {
		int[]a= {20,30,40};
		int[]b= {20,30,40};
		if(a.length==b.length) {
			int c=0;
			for(int i=0;i<a.length;i++) {
				if(a[i]==b[i]) {
					c++;
					
				}
			}
			if(c==a.length) {
				System.out.println("identicalarray");
			}
			else {
				System.out.println("not a identical array");
			}
		}
	}

}
