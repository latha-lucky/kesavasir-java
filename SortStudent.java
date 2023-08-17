package example;

import java.util.TreeSet;

public class SortStudent {
	public static void main(String[] args) {
		Student s1=new Student(23,"tom");
		Student s2=new Student(24,"latha");
		Student s3=new Student(21,"sunny");
		
		SortStudentByAge age=new SortStudentByAge();
		SortStudentByName name=new SortStudentByName();
		
		TreeSet<Student>t=new TreeSet<Student>(name);
		t.add(s1);
		t.add(s2);
		t.add(s3);
		
		for(Student s:t) {
			System.out.println(s);
		}
	}

}
