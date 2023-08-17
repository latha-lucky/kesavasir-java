package colletionprogramms.com;

import java.util.LinkedHashSet;


public class HashSet {
	public static void main(String[] args) {
		HashSet h=new HashSet();
		h.add(100);
		h.add(1.5);
		h.add(true);
		h.add(null);
		h.add(100);
		System.out.println("Size:"+h.size());
		for(Object obj:h) {
			System.out.println(obj);
		}
		System.out.println("=============");
		LinkedHashSet<Integer>lhs=new LinkedHashSet<Integer>();
		lhs.add(25);
		lhs.add(15);
		lhs.add(35);
		lhs.add(25);
		lhs.add(45);
		for(int i:lhs) {
			System.out.println(i);
		}
		
	}

}
