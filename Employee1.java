package colletionprogramms.com;

public class Employee1 implements Comparable<Employee1> {
	int id;
	Employee1(int id){
		this.id=id;
	}
	public String toString() {
		return "ID:"+id;
	}
	public int compareTo(Employee1 e) {
		return this.id-e.id;
	}

}
