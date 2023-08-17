class Sample3
{
	static int a;
	public static void test(int b)
	{
		int c=10;
		System.out.println(c);
		System.out.println(a);
	}
	public static void main(String[] args) 
	{
		System.out.println(a);
		test(8);
	}

}