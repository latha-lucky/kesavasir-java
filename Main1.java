class Emp
{
	String ename="latha";
	int eid=12345;
	double bal=0.0;
	double sal=50000.0;
	String email="latha@123";
	static String companyname="intel";
	public static void showcompanyname()
	{
		System.out.println(companyname);
	}
	public void showEmpdetails()
	{
		System.out.println(ename);
		System.out.println(eid);
		System.out.println(bal);
		System.out.println(sal);
		System.out.println(email);
	}
	public void salcredit(double amt)
	{
		bal=bal + sal;
		System.out.println(bal);
	}
}
class Main1
{
	public static void main(String[] args) 
	{
		new Emp().showcompanyname();
		new Emp().showEmpdetails();
		new Emp().salcredit(50000.0);
	}
}