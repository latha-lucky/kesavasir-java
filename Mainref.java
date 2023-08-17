class Emp
{
	String ename="latha";
	int eid=12345;
	double balance=0.0;
	double sal=2300.0;
	static String companyname="intel";
	public static void showcompanyname()
	{
		System.out.println(companyname);
	}
	public void showEmpdetails()
	{
		System.out.println(ename);
		System.out.println(eid);
		System.out.println(balance);
		System.out.println(sal);
	}
	public void salcredit(double amt)
	{
		balance=balance + sal;
		System.out.println(balance);
	}
}
class Mainref
{
	public static void main(String[] args) 
	{
		
		Emp a1=new Emp();
		System.out.println(a1);
		a1. showcompanyname();
		a1. showEmpdetails();
		a1. salcredit(2000.0);
	}
}