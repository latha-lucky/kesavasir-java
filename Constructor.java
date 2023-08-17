class Sample3
{
	public Sample()
	{
		System.out.println("zero");
	}
	public Sample3(int n)
	{
		System.out.println("int n");
	}
	public Sample3(double n)
	{
		System.out.println("double n");
	}
	public Sample3(double n,int n)
	{
		System.out.println("double n,int n");
	}
	pubilc Sample3(int n,double n)
	{
		System.out.println("int n,double n");
	}
}
public static void main(String[] args) 
{
	new Sample3();
	new Sample3(10);
	new Sample3(3.00);
	new Sample3(30.0,30);
	new Sample3(40,45.0);
}