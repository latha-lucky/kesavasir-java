package arrayprogramms.com;

public class ComparisngString1 {
	public static void main(String[] args) {
		String s="hello";
		char[]arr=s.toCharArray();
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				System.out.println(arr[i]+" "+arr[j]);
			}
		}
	}

}


