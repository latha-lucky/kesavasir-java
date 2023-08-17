package arrayprogramms.com;

public class Array1 {
	public static void main(String[] args) {
		int arr[]=new int[5];
		int value=10;
		for(int i=0;i<arr.length;i++) {
			arr[i]=value;
			value=value+10;
		}
		for(int i=0;i<arr.length;i++) {
			System.out.println("index:"+i+"value:"+arr[i]);
		}
	}

}
