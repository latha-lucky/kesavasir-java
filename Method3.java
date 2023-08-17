class Method3
{ 
	public static void test()//2 called by main and called by itself
	{
		System.out.println("hello");//3
		test();// 4 repeat step2
	}
	public static void main(String[] args) // calling method
	{
		test();//1
	}
}