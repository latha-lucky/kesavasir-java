package colletionprogramms.com;

import java.util.LinkedList;

public class Empolyeesolution {
	public static void main(String[] args) {
		Employee e1=new Employee("tom",2000.0);
		Employee e2=new Employee("jhon",20000.0);
		Employee e3=new Employee("jerry",3000.0);
		
		LinkedList<Employee>l=new LinkedList<Employee>();
		l.add(e1);
		l.add(e2);
		l.add(e3);
		for(Employee e:l) {
			System.out.println(e);
		}
		
	}

}
