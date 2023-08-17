class Sample3
{
	public Sample3()
	{
		System.out.println("zero");
	}
	public Sample3(int a)
	{
		System.out.println("int a");
	}
	public Sample3(double a)
	{
		System.out.println("double a");
	}
	public Sample3(double a,int b)
	{
		System.out.println("double a,int b");
	}
	public Sample3(int a,double b)
	{
		System.out.println("int a,double b");
	}
   public static void main(String[] args)
   {
	new Sample3();
	new Sample3(10);
	new Sample3(3.00);
	new Sample3(30.0,30);
	new Sample3(40,45.0);
   }
}