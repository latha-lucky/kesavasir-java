package com.example;

public class LargestWord {
	public static void main(String[] args) {
		String s="hello bye hi all";
		String []arr=s.split(" ");
		if(s.length()>0) {
			int max=arr[0].length();
			String ans=arr[0];
			for(String ele:arr) {
				if(max<ele.length()) {
					max=ele.length();
					ans=ele;
				}
			}
			System.out.println(ans);
		}
		else {
			System.out.println(-1);
		}
	}

}
