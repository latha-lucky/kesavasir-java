package example;

public class Demo {
	public static void main(String[] args) {
		System.out.println("start");
		int []a= {10,20,30};
		try {
			System.out.println(a[100]);
		}
		catch(Exception e) {
			System.out.println("invalid index");
		}
		System.out.println("end");
		
	}

}
