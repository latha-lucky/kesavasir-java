class Inc6
{
	public static void main(String[] args)
	 {
		int a = 5;
		int b = 15;
		int res = b + b++ - ++a + 20;
		System.out.println(res);
		System.out.println(a);
		System.out.println(b);
	}
}