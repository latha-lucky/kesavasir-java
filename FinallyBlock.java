package example;

public class FinallyBlock {
	public static void main(String[] args) {
		System.out.println("start");
		try {
			System.out.println(10/0);
		}
		catch(Exception e) {
			System.out.println("handled");
		}
		finally {
			System.out.println("inside finally block");
		}
		System.out.println("end");
	}

}
