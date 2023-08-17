package arrayprogramms.com;

import java.util.Scanner;

public class Array2 {
	public static void main(String[] args) {
		Scanner ip=new Scanner(System.in);
		System.out.println("enter the size of array");
		int size=ip.nextInt();
		int arr[]=new int[size];
		System.out.println("please enter the elements");
		for(int i=0;i<arr.length;i++) {
			arr[i]=ip.nextInt();
		}
		System.out.println("array elements are:");
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]+" ");
		}
		
	}

}
