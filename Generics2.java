package colletionprogramms.com;

import java.util.ArrayList;

public class Generics2 {
	public static void main(String[] args) {
		int a=25;
		double b=3.5;
		ArrayList l=new ArrayList();
		l.add(a);
		l.add(b);
		l.add('Z');
		for(Object obj:l) {
			System.out.println(obj);
		}
	}

}
