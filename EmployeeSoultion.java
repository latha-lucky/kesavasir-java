package colletionprogramms.com;
import java.util.TreeSet;

public class EmployeeSoultion {
	public static void main(String[] args) {
		Employee1 e1=new Employee1(133);
		Employee1 e2=new Employee1(453);
		Employee1 e3=new Employee1(523);
		
		TreeSet<Employee1>t=new TreeSet<Employee1>();
		t.add(e1);
		t.add(e2);
		t.add(e3);
		for(Employee1 e:t) {
			System.out.println(e);
		}
	}

}
