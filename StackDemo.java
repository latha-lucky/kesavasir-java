package colletionprogramms.com;

import java.util.Stack;

public class StackDemo {
	public static void main(String[] args) {
		Stack<Integer>s=new Stack<Integer>();
		s.add(10);
		s.add(20);
		s.add(30);
		for(int i:s) {
			System.out.println(i);
		}
		System.out.println("===================");
		System.out.println(s.pop());
		System.out.println(s.pop());
		System.out.println(s.pop());
	}

}
