package colletionprogramms.com;
import java.util.TreeSet;

public class Employee2Solution {
	public static void main(String[] args) {
		Employee2 e1=new Employee2("tom",234);
		Employee2 e2=new Employee2("sunny",534);
		Employee2 e3=new Employee2("ntr",4234);
		
		TreeSet<Employee2>t=new TreeSet<Employee2>();
		t.add(e1);
		t.add(e2);
		t.add(e3);
		
		for(Employee2 e:t) {
			System.out.println(e);
		}
			
		
		
	}

}
