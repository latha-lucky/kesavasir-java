package com.example;

public class StringEvenPosition {
		public static void main(String[] args) {
			String s="hello hi bye welcome";
			String[] arr=s.split(" ");
			for(int i=0;i<arr.length;i++)
			{
				if(i%2==0) {
					System.out.println(arr[i]+" ");
				}
				else {
					String s1=arr[i];
					String s2=" ";
					for(int j=s1.length()-1;j>=0;j--)
					{
						s2=s2+s.charAt(j);
						System.out.println(s2+" ");
					}
				}
			}
		}

	}
