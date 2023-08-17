package com.example;

public class DuckNumber {
	public static void main(String[] args) {

		int n=1080048;
		int rem=0,c=0;
		while(n!=0)
		{
		rem=n%10;
		if(rem==0)
		{
		c++;
		break;
		}
		n=n/10;
		}
		System.out.println(c==1?"Duck no":"Not Duck no");
		}
		}



