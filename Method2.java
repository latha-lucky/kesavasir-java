class Method2
{
	public static void method1()
	{
	  System.out.println("method1");	
	}
	public static void method2()
	{
		System.out.println("method2");
	}
	public static void main(String[] args)
	{
		System.out.println("main method");
		method2();
		method1();
	}
}