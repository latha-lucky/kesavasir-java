class Inc5
{
	public static void main(String[] args)
	 {
		int a = 5;
		int b = 15;
		int res = b - a + a++ + b + 25;
		System.out.println(res);
		System.out.println(a);
		System.out.println(b);
	}
}