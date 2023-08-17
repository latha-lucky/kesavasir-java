class Inc4
{
	public static void main(String[] args)
	{
		int a = 5;
		int b= 15;
		int res = a + b + a++ + b++ - ++a;
		System.out.println(res);
		System.out.println(a);
		System.out.println(b);
	}
	
}