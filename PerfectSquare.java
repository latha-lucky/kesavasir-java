package com.example;

public class PerfectSquare {
	public static void main(String[] args) {
		int n=4;
		boolean flag=false;
		for(int i=1;i<=n;i++)
		{
			if(i*i==n)
			{
				flag=true;
			}
		}
		if(flag==false)
		{
			System.out.println("not a perfect squre");
		}
		else {
			System.out.println("perfect Square");
		}

	}
	}


