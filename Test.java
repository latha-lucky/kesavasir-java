package example;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		System.out.println("start");
		Scanner scan=new Scanner(System.in);
		System.out.println("enter first no:");
		int a=scan.nextInt();
		System.out.println("enter second no:");
		int b=scan.nextInt();
		scan.close();
		try {
			System.out.println(a/b);
		}
		catch( Exception e){
			System.out.println("do not divide by o");
			
		}
		
	}

}
