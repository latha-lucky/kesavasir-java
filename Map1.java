package com.jspiders;

import java.util.LinkedHashMap;
import java.util.TreeMap;
import java.util.Set; 

public class Map1 {
	public static void main(String[] args) {
		LinkedHashMap<Integer,String>s=new LinkedHashMap<Integer,String>();
		s.put(10,"Idly");
		s.put(20, "Biryani");
		s.put(30, "Dosa");
		System.out.println("===============");
		Set<Integer>keys=s.keySet();
		for(int key:keys) {
			System.out.println(key+" "+s.get(key));
		}
		System.out.println("=============");
		TreeMap<String,Integer>t=new TreeMap<String,Integer>();
		t.put("B", 10);
		t.put("C", 20);
		t.put("A",30);
		Set<String>setofkeys=t.keySet();
		for(String key:setofkeys) {
			System.out.println(key+" "+t.get(key));
		}
	}

}
