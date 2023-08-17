class Nonex1
{
	int a =200;
	public void test()
	{
		System.out.println("test()of sample class");
	}
	public void display()
	{
		System.out.println("display()of sample class");
	}
}
class Main1
{
	public static void main(String[] args) 
	{
		new Nonex1().test();
	}
}