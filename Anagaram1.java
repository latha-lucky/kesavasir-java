package arrayprogramms.com;

import java.util.Scanner;

public class Anagaram1 {
	static String sortString(String s) {
      char[]arr=s.toCharArray();
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					char temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
			String ans=new String(arr);
			return ans;
		}
		return s;
	}
	public static void main(String[] args) {
		Scanner ip=new Scanner(System.in);
		String s1=ip.nextLine();
		String s2=ip.nextLine();
		String ans1=sortString(s1);
		String ans2=sortString(s2);
	}
}


