package com.example;
import java.util.Scanner;

public class MaxWordInString {
	 public static void main(String[] args) {
	        Scanner ip=new Scanner(System.in);
	        String s=ip.nextLine();
	        String[]arr1=s.split(" ");
	        String[]arr2=s.split(" ");
	        int max=0;
	        String ans1=" ";
	        
	        for(int i=0;i<arr1.length;i++) {
	            int c=0;
	            for(int j=0;j<arr2.length;j++) {
	                if(arr1[i].equals(arr2[j])) {
	                    c++;
	                    arr2[j]=" ";
	                    
	                }
	            }
	            if(c>0&&c>max) {
	                c=max;
	                ans1=arr1[i];
	            
	            
	        }
	    
	    }
	        System.out.println(ans1);

	}
	}





