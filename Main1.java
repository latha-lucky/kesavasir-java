class Nonex1
{
	int a =200;
	public void dis()
	{
		System.out.println("dis()of sample class");
	}
	public void test()
	{
		System.out.println("test()of sample class");
		dis();
	}
}
class Main1
{
	public static void main(String[] args) 
	{
		new Nonex1().test();
		System.out.println(new Nonex1().a);
	}
}