package arrayprogramms.com;

public class Array10 {
	static void demo(int n) {
		if(n>=10) {
			System.out.println(n);
			demo(n+1);
		}
	}
	public static void main(String[] args) {
		demo(1);
	}

}
