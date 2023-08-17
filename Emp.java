class Emp
{
	String ename="latha";
	int eid=12345;
	double bal=0.0;
	String companyname="intel";
	public static void showcompanyname()
	{
		System.out.println(companyname);
	}
	public static void showEmpdetails()
	{
		System.out.println(ename);
		System.out.println(eid);
		System.out.println(bal);
	}
	public void deposit(double amt)
	{
		bal=bal + amt;
		System.out.println(bal);
	}
}
class Main1
{
	public static void main(String[] args) 
	{
		new Emp().showcompanyname();
		new Emp().showEmpdetails();
		new Emp().deposit(5600.0);
	}
}