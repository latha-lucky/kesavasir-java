package com.jspider.p1;

public class MethodsStr {
	public static void main(String[] args) {
		String s="Software Engineer";
		System.out.println(s.length());
		System.out.println(s.toUpperCase());
		System.out.println(s.toLowerCase());
		System.out.println(s.startsWith("soft"));
		System.out.println(s.endsWith("eer"));
		System.out.println(s.indexOf('f'));
		System.out.println(s.charAt(1));
		System.out.println(s.contains("ware"));
		
		
		String a="hello";
		String b="hello";
		String c="hELlo";
		System.out.println(a.equals(b));
		System.out.println(a.equals(c));
		System.out.println(a.equalsIgnoreCase(c));
				
		
	}

}
