class Different
{
	static int a=200;
	public static void test()
	{
		System.out.println("test()of sample class");
	}
}
class Mainmethod
{
public static void main(String[] args) 
	{
		Different.test();
		System.out.println(Different.a);
	}
}