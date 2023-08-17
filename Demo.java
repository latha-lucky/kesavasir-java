package com.jspiders;

import java.util.HashMap;

public class Demo {
	public static void main(String[] args) {
		HashMap map=new HashMap();
		map.put(10, "guldu");
		map.put("Dinaga", 45.6);
		map.put(45.1, 555);
		System.out.println(map);
		System.out.println(map.get(10));
		System.out.println(map.containsKey("dinga"));
		System.out.println(map.containsValue(555));
		System.out.println("==========");
		System.out.println(map);
		map.remove(10);
		System.out.println(map);
		System.out.println("==========");
		System.out.println(map.isEmpty());
		map.clear();
		System.out.println(map.isEmpty());
		
	}

}
