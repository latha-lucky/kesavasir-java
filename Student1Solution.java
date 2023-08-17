package colletionprogramms.com;
import java.util.TreeSet;

public class Student1Solution {
	public static void main(String[] args) {
		Student1 s1=new Student1(22);
		Student1 s2=new Student1(23);
		Student1 s3=new Student1(21);
		
		TreeSet<Student1>t=new TreeSet<Student1>();
		t.add(s1);
		t.add(s2);
		t.add(s3);
		for(Student1 s:t) {
			System.out.println(s);
		}
	}

}
