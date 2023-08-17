class Inc
{
	public static void main(String[] args)
	 {
		int a = 5;
		int b =10;
		int res = a++ + 10 + ++b + 25 + ++a;
		System.out.println(res);
		System.out.println(a);
		System.out.println(b);
	}
}