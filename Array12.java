package arrayprogramms.com;

public class Array12 {
	static int fact(int n) {
		if(n==0) {
			return 1;
		}
		else {
			return n*fact(n-1);
		}
	}
	public static void main(String[] args) {
		System.out.println(fact(5));
	}

}
