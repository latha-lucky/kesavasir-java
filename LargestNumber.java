package com.example;

public class LargestNumber {
	public static void main(String[] args) {
		int[] a= {5,55,6,76,16,9};
		for(int i=0;i<a.length;i++)
		{
			int val=-1;
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]<a[j])
				{
					val=a[j];
					break;
				}
			}
			a[i]=val;
		}
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]+" ");
		}
	}

}
