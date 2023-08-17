class Inc3
{
	public static void main(String[] args) 
	{
		int a = 30;
		int b = 20;
		int res = b + ++a + 20 + a++ + b++;
		System.out.println(res);
		System.out.println(a);
		System.out.println(b);
	}
}
