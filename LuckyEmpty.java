package com.example;

public class LuckyEmpty {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int emp_id=12345678;
		int sum=0,rem=0;
		for(int i=1;i<=4;i++)
		{
		rem=emp_id%10;
		sum=sum+rem;
		emp_id=emp_id/10;
		}
		if(sum%2==1)
		{
		System.out.println("Lucky Employ");
		}
		else
		{
		System.out.println("Not a Lucky Employ");
		}

		}

		}



