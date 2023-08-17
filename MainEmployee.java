class Employee
{
	String name;
	int eid;
	double sal;
	public Employee (String name,int eid,double sal) 
	{
		this.name=name;
		this.eid=eid;
		this.sal=sal;
	}
	public void showEmpdetails()
	{
		System.out.println(name);
		System.out.println(eid);
		System.out.println(sal);
	}
	public void updatesal(double newsal)
	{
		sal=sal+new sal;
		System.out.println(sal);
	}
}
class MainEmployee1
{
	public static void main(String[] args) 
	{
		Employee e1=new Employee("latha",101,30000.0);
		e1.showEmpdetails();
		System.out.println("----------------------");
		Employee e2=new Employee("chinnu",102,40000.0);
		e2.showEmpdetails();
	}
}