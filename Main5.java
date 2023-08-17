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
class Main5
{
	public static void main(String[] args) 
	{
       Account a1=new Account();
       System.out.println(a1);
       a1.showaccountdetails();
       a1.showbankname();
       a1.deposit(10000.0);
       a1.withdraw(500);
       System.out.println(" ---------");
       Account a2=new Account();
       System.out.println(a2);
       a2.showaccountdetails();
       a2.showbankname();
       a2.deposit(10000.0);
       a2.withdraw(500.0);

	}
}