package colletionprogramms.com;

import java.util.ArrayList;
import java.util.Collections;

public class SortExample {
	public static void main(String[] args) {
		ArrayList<Integer>l=new ArrayList<Integer>();
		l.add(30);
		l.add(20);
		l.add(10);
		for(Integer i:l) {
			System.out.println(i);
		}
		System.out.println("============");
		Collections.sort(l);
		for(int i:l) {
			System.out.println(i);
		}
		System.out.println("=================");
		Collections.reverse(l);
		for(int i:l)
		System.out.println(i);
	}

}
