package com.jspiders;

public class Pattern14 {
	public static void main(String[] args) {
		int n=7;
		int x=n/2+1;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if(j==x) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
			if(i<=n/2) {
				x--;
			}
			else {
				x++;
			}
		}
	}

}
