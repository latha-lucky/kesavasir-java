class Account
{
	String name="latha";
	Long accno=2488969l;
	double bal=0.0;
	String ifsc="icic456";
	String branch="btr";
	static String bankname="icicic";
	public static void showbankname()
	{
		System.out.println(bbankname);
	}
	public void showdetails()
	{
		System.out.println(name);
		System.out.println(accno);
		System.out.println(ifsc);
		System.out.println(branch);
		System.out.println(bankname);
	}
	public void despoit(double amt)
	{
		bal=bal+amt;
		System.out.println(bal);
	}
	public void withdraw(double amt) 
	{
		bal=bal-amt;
		System.out.println(bal);
	}
}
class Main2
{
	public static void main(String[] args) 
	{
		new Account().showdetails();
		new Account().showbankname();
		new Account().despoit(10000.0);
		new Account().withdraw(300);

	}
}