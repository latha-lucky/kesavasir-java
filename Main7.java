class Account3
{
	String name;
	long accno;
	String ifsc;
	double bal;
	String branch;
    String bankname;
	public Account(String name,long accno,String ifsc,double bal,String branch,String bankname)
	{
		this.name=name;
		this.accno=accno;
		this.ifsc=ifsc;
		this.bal=bal;
		this.branch=branch;
		this.bankname=bankname;
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
class Main7
{
	public static void main(String[] args) 
	{
		 Account a1=new Account("latha","1234456l",1123,23000.0,"btm","icici");
		 a1.showaccountdetails();
		
		
	}
}