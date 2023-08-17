package colletionprogramms.com;

import java.util.ArrayList;

public class StudentSolution {
	public static void main(String[] args) {
	Student s1=new Student(20,"jerry");
	Student s2=new Student(21,"jhon");
	Student s3=new Student(22,"tom");
	
	ArrayList<Student>l=new ArrayList<Student>();
	l.add(s1);
	l.add(s2);
	l.add(s3);
	for(Student s:l) {
		System.out.println(l);
	}
	System.out.println("================");
	for(int i=0;i<l.size();i++) {
		System.out.println(l.get(i));
	}
	
	
	}

}
