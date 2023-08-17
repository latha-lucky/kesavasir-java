package arrayprogramms.com;

public class Array9 {
	static void demo(int n) {
		if(n>=1) {
			System.out.println("hello");
			demo(n-1);
		}
	}
	public static void main(String[] args) {
		demo(7);
	}
}
	