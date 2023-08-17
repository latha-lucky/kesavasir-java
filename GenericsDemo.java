package colletionprogramms.com;

import java.util.ArrayList;
import java.util.LinkedList;

public class GenericsDemo {
	public static void main(String[] args) {
		ArrayList<String>l=new ArrayList<String>();
		l.add("sql");
		l.add("web");
		l.add("java");
		for(String s:l) {
			System.out.println(s);
		}
		System.out.println("===================");
		LinkedList<Integer>s=new LinkedList<Integer>();
		s.add(10);
		s.add(25);
		s.add(30);
		for(int i:s) {
			System.out.println(i);
		}
	}
	

}
