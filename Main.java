class Account
{
	String name="latha";
	long accno=1236789l;
	String ifsc="icic345";
	double bal=0.0;
	String branch="btr";
	static String bankname="icici";
	public static void showbankname()
	{
		System.out.println(bankname);
	}
	public void showaccountdetails()
	{
		System.out.println(name);
		System.out.println(accno);
		System.out.println(ifsc);
		System.out.println(bal);
		System.out.println(branch);
	}
	public void deposit(double amt)
	{
		bal=bal + amt;
		System.out.println(bal);
	}
	public void withdraw(double amt)
	{
		bal=bal -amt;
		System.out.println(bal);
	}
}
class Main
{
	public static void main(String[] args) 
	{
		new Account().showaccountdetails();
		new Account().showbankname();
		new Account().deposit(1000.0);
		new Account().withdraw(400);
	}
}