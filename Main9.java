class Person
{
	String name;
	int age;
	char gender;
	Person(String name,int age,char gender)
	  {
	  	this.name=name;
	  	this.age=age;
	  	this.gender=gender;
	   }
}
class Student extends Person
{
   String usn;
   double marks;
   String collegename;
   {
   	Student(String name,int age,char gender,String usn,double marks,String collegename)
	  super( name, age,gender)
	  this.usn=usn;
	  this.marks=marks;
	  this.collegename=collegename;
   	
   }
}
class Employee extends Student
{
   int eid;
   double salary;
   String designation;
   Empolyee(String name,int age,char gender,String usn,double marks,String collegename,int eid,double salary,String designation)
	  super( name, age,gender)
	  this.eid=eid;
	  this.salary=salary;
	  this.designation=designation;
}
class Main9
{
	public static void main(String[] args) 
	{
		Person p1=new Person("latha",21,'f');
		Student s1= new Student("ramu",22,'M',"cs88990",45.00,"rgukt");
		Employee e1=new Employee("ramu",22,'M',"cs88990",45.00,"rgukt",34567,5400.0,"se");
	}
}