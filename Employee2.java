package colletionprogramms.com;

 class Employee2 implements Comparable<Employee2> {
	String name;
	int id;
	Employee2(String name,int id){
		this.name=name;
		this.id=id;
	}
	public String toString() {
		return "Name:"+name+ " Id:"+id;
	}
	public int compareTo(Employee2 e) {
		return this.name.compareTo(e.name);
	}

}
