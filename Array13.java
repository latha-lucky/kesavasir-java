package arrayprogramms.com;

public class Array13 {
	public static void main(String[] args) {
		int n1=5;
		int key=5;
		int count=0;
		for(int n=2; ;n++) {
			int c=0;
			for(int i=1;i<=n;i++) {
				if(n%i==0) {
					c++;
				}
			}
			if(c==2) {
				c++;
			}
			if(key==count) {
				System.out.println(n);
				break;
			}
		}
	}

}
