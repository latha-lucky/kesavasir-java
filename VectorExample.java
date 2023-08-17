package colletionprogramms.com;

import java.util.Vector;

public class VectorExample {
	public static void main(String[] args) {
		Vector v=new Vector();
		v.add(10);
		v.add(1.5);
		v.add("Java");
		for(Object i:v) {
			System.out.println(i);
		}
	}

}
