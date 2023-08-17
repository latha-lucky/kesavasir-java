package com.jspiders.p1;

public class Arraydemo1 {
	public static void main(String[] args) {
		int arr[]=new int[5];
		int value=0;
		for(int i=0;i<arr.length;i++) {
			arr[i]=value;
			value=value+10;
		}
		for(int i=0;i<arr.length;i++) {
			System.out.println("index:"+i+"valu:"+arr[i]);
		}
		
	}

}
