class Inc2
{
	public static void main(String[] args) 
	{
		int a = 10;
		int b = 15;
		int res = ++a + a++ +b + b++;
		System.out.println(res);
		System.out.println(a);
		System.out.println(b);
	}
}