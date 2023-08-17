package com.jspiders;

public class Pattern1UsingRecursion {
	static int i=1;
	static void col(int n) {
		if(n>=1) {
			System.out.print("* ");
			col(n-1);
			
		}
	}
		static void row(int n1) {
			if(i<=n1) {
				col(n1);
				i++;
				System.out.println();
				row(n1);
			}
		}
		public static void main(String[] args) {
			row(5);
		}
	}


