package example;

public class Demo1 {
	public static void main(String[] args) {
		try {
			System.out.println(10/0);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("invalid index");
		}
		catch(ArithmeticException e) {
			System.out.println("invalid denominator");
		}
		catch(Exception e) {
			System.out.println("super class handle");
		}
		
	}

}
