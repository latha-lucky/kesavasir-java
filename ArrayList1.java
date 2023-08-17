package colletionprogramms.com;

import java.util.ArrayList;

public class ArrayList1 {
	public static void main(String[] args) {
		ArrayList l=new ArrayList();
		l.add(10);
		l.add(2.5);
		l.add(10);
		l.add(null);
		l.add("java");
		System.out.println(l);
		System.out.println(l.get(1));
		System.out.println(l.size());
		System.out.println(l.contains("java"));
		System.out.println("===================");
		System.out.println(l);
		l.remove(1);
		System.out.println(l);
		System.out.println("=================");
		System.out.println(l.isEmpty());
		l.clear();
		System.out.println(l.isEmpty());
		System.out.println("====================");
		
		ArrayList x=new ArrayList();
		ArrayList y=new ArrayList();
		ArrayList i=new ArrayList();
		i.add(20);
		i.add(10);
		
		ArrayList j=new ArrayList();
		j.add(30);
		System.out.println(i);
		System.out.println(j);
	}

}
