class Person1
{
	String name;
	int age;
	char gender;
	public Person(String name,int age,char gender)
	{
		this.name=name;
		this.age=age;
		this.gender=gender;
	}
	void details()
	{
		System.out.println("Name:"+name,"Age:"+age,"Gender:"+gender);
	}
}
class Empolyee extends Person1
{
	int eid;
	double sal;
	String designation;
	public Employee(String name,int age,char gender,int eid,double sal,String designation);
	super(name,age,gender);
	this.eid=eid;
	this.sal=sal;
	this.designation=designation;
}
void details()
{
	System.out.println("Name:"+name,"Age:"+age,"Gender:"+gender,"Eid:"+eid,"Sal:"+sal,"Designation:"+designation);
}
class Main10
{
	public static void main(String[] args) 
	{
		Person1 p1=new Person1("latha",20,'f');
		p1.details();
		System.out.println("=========");
		Employee e1=new Employee("ramu",25,'m',34567,3000.0,"se");
		e1.details();
	}
}