package com.example;
import java.util.Scanner;

public class SunnyNumber {
	public static void main(String[] args)
	{
	System.out.println();
	Scanner ip=new Scanner(System.in);
	int n=ip.nextInt();
	boolean flag=false;
	for(int i=1;i<=n;i++)
	{
	if(i*i==n+1)
	{
	flag=true;
	}
	}
	if(flag==false)
	{
	System.out.println("it is sunny number");
	}
	else{
	System.out.println("it is not sunny number");
	}
	}
	}


