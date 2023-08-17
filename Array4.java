package arrayprogramms.com;

public class Array4 {
	public static void main(String[] args) {
		int[]arr1= {1,0,5,8,2,0,7,0,12};
		int[]arr2=new int[arr1.length];
		int k=0;
		for(int i=0;i<arr1.length;i++) {
			if(arr1[i]==0) {
				arr2[k]=arr1[i];
				k++;
			}
		}
		for(int i=0;i<arr1.length;i++) {
			if(arr1[i]!=0) {
				arr2[k]=arr1[i];
				k++;
			}
		}
		for(int i=0;i<arr2.length;i++) {
			System.out.println(arr2[i]+" ");
		}
	}

}
