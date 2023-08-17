package com.jspiders.p1;

public class Solution1 {
	static void dispaly(Father obj) {
		if(obj instanceof Son) {
			Son s=(Son)obj;
			System.out.println(s.x+" "+s.y);
		}
		else if(obj instanceof Daughter) {
			Daughter d=(Daughter)obj;
			System.out.println(d.x+" "+d.z);
		}
	}
	public static void main(String[] args) {
		dispaly(new Daughter());
		System.out.println("===============");
		dispaly(new Son());
		
	}

}
