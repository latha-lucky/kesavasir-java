package com.jspiders1;

public class SwapTwoNumbers {
	static void SwapLogicOne(int a,int b) {
		System.out.println("BeforeSwap a="+a+"b="+b);
		int temp=a;
		a=b;
		b=temp;
		System.out.println("AfterSwap a="+a+"b="+b);
		
	}
	static void SwapLogicTwo(int a,int b) {
		System.out.println("BeforeSwap a="+a+"b="+b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("AfterSwap a="+a+"b="+b);
		}
	static void SwapLogicThree(int a,int b) {
		System.out.println("BeforeSwap a="+a+"b="+b);
		a=a^b;
		b=a^b;
		a=a^b;
		System.out.println("BeforeSwap a="+a+"b="+b);
	}

public static void main(String[] args) {
	
}
}

