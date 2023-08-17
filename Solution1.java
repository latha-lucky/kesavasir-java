package com.jspiders;

import java.util.LinkedHashMap;
import java.util.Set;

public class Solution1 {
	public static void main(String[] args) {
		Student s1=new Student(100,"A");
		Student s2=new Student(200,"C");
		Student s3=new Student(300,"B");
		
		LinkedHashMap<Student,Integer>l=new LinkedHashMap<Student,Integer>();
		l.put(s1, 50);
		l.put(s2, 60);
		l.put(s3, 70);
		
		Set<Student>keys=l.keySet();
		for(Student key:keys) {
			System.out.println(key+"marks"+l.get(key));
		}
		
	}

}
