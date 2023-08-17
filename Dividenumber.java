package com.jspiders.p1;

import java.util.Scanner;

public class Dividenumber {

	public static void main(String[] args) {
		Scanner ip=new Scanner(System.in);
		System.out.println("enter a number");
		int n=ip.nextInt();
		if(n%15==0) {
			System.out.println("fizzbuzz");
		}
		else if(n%5==0){
			System.out.println("fizz");
			
		}
		else if(n%3==0) {
			System.out.println("buzz");
		}
		else {
			System.out.println("bye");
		}

	}

}
