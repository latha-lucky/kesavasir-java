package arrayprogramms.com;

public class Array5 {
	public static void main(String[] args) {
		int[]arr=new int[10];
		int k=0;
		for(int i=1;i<=5;i++) {
			arr[k]=i*2;
			k++;
		}
		for(int i=1;i<=5;i++) {
			arr[k]=i*3;
			k++;
		}
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}
	
	

}
