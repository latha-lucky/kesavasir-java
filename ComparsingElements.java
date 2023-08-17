package arrayprogramms.com;

public class ComparsingElements {
	public static void main(String[] args) {
		int[]arr= {5,1,3,4,2};
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				System.out.println(arr[i]+" "+arr[j]);
			}
		}
	}

}
