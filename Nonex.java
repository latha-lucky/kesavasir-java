class Nonex
{
	int a=100;
	public void test()
	{
		System.out.println("test()of sample class");
	}
	public static void main(String[] args) 
	{
		new Nonex().test();
		System.out.println(new Nonex().a);
	}
}