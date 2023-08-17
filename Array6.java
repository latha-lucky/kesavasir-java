package arrayprogramms.com;

public class Array6 {
	public static void main(String[] args) {
		String s="hello hi";
		char arr[]=new char[s.length()];
		for(int i=0;i<s.length();i++) {
			arr[i]=s.charAt(i);
		}
		for(char ele:arr) {
			System.out.println(ele);
		}
		System.out.println("======================");
		char arr2[]=s.toCharArray();
		for(char ele:arr2) {
			System.out.println(ele);
		}
	}

}
