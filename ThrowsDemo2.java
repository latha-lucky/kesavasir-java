package example;

public class ThrowsDemo2 {
	static void display() throws Exception{
		for(int i=0;i<5;i++) {
			System.out.println(i);
			Thread.sleep(10000);
		}
	}
	public static void main(String[] args) {
		try {
			display();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}
