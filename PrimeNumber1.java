package com.example;

public class PrimeNumber1 {
	public static void main(String[] args) {
		int n1=5;
		int key=55567;
		int count=0;
		for(int n=2; ;n++) {
			int c=0;
			for(int i=1;i<=n;i++) {
				if(n%i==0) {
					c++;
				}
			}
			if(c==2) {
				count++;
			}
			if(key==count) {
				System.out.println(n);
				break;
			}
		}
	}

}
