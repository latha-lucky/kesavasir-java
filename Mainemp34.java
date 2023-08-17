class Employee3
{
	String name;
	int eid;
	double sal;
	int exp;
	public Employee3(String name,int eid,double sal,int exp)
	{
		this.name=name;
		this.eid=eid;
		this.sal=sal;
		this.exp=exp;
	}
	public Employee3(String name,int eid,double sal)
	{
		this.name=name;
		this.eid=eid;
		this.sal=sal;
	}
	public void showempdetails()
	{
		System.out.println(name);
		System.out.println(eid);
		System.out.println(sal);
		System.out.println(exp);
	}
	public void updatesal( double newsal)
	{
		sal=sal+newsal;
		System.out.println("newsal="+sal);
	}

}
class Mainemp34
{
	public static void main(String[] args) 
	{
		Employee3 e1=new Employee3("yash",101,3000.0,7);
		e1.showempdetails();
		System.out.println("----------------------------");
		Employee3 e2= new Employee3("sree",102,3600.0);
		e2.showempdetails();
	}
}