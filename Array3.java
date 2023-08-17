package arrayprogramms.com;

public class Array3 {
	 public static void main(String[] args) {
		int []a= {10,20,30};
		int []b= {10,20,30};
		if(a.length==b.length) {
			int c=0;
			for(int i=0;i<a.length;i++) {
				if(a[i]==b[i]) {
					c++;
				}
			}
			if(c==a.length) {
				System.out.println("identical array");
			}
			else {
				System.out.println("not identical array");
			}
				
		}
	}

}
