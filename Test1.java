package example;

public class Test1 {
	public static void main(String[] args) {
		System.out.println("start");
		try {
			System.out.println(10/0);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("end");
	}

}
