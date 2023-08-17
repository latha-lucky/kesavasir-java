package com.jspiders;

import java.util.LinkedHashMap;
import java.util.Set;

public class Solution {
	public static void main(String[] args) {
		LinkedHashMap<String,Integer>l=new LinkedHashMap<String,Integer>();
		l.put("Tom", 20);
		l.put("Jerry", 21);
		l.put("latha", 22);
		Set<String>keys=l.keySet();
		for(String key:keys) {
			System.out.println(key+"is"+l.get(key)+"years of old");
		}
	}

}
