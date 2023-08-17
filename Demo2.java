package example;

public class Demo2 {
	public static void main(String[] args) {
		try {
			System.out.println(10/0);
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
			String message=e.getMessage();
			System.out.println(message);
		}
	}

}
