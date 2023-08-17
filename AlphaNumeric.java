package com.example;
import java.util.Scanner;

public class AlphaNumeric {
	public static void main(String[] args)
	{
	Scanner ip=new Scanner(System.in);
	char c=ip.next().charAt(0);
	if((c>='a' && c<='z')||(c>='A' && c<='Z'))
	{
	System.out.println("alpha");}
	else if(c>='0' && c<='9'){
	System.out.println("numeric");}
	else{
	System.out.println("special character");}
	}

}


