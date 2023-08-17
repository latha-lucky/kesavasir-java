class Sample1
{
	String name;
	int eid;
	double sal;
	public Sample1(String name,int eid,double sal)
	{
		this.name=name;
		this.eid=eid;
		this.sal=sal;
	}
	public void showdetails()
	{
		System.out.println(name);
		System.out.println(eid);
		System.out.println(sal);
	}
	public  void updatesal(double newsal)
	{
		sal=sal+newsal;
		System.out.println(sal);
	}
}
class Main3
{
	public static void main(String[] args) 
	{
	Sample1 s1=new Sample1("latha",98675,30000.0);
	s1.showdetails();
	Sample1 s2=new Sample1("sree",6578,4000.0);
	s1.showdetails();
	}
}


