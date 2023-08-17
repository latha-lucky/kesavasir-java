class Add1array
{   public static void add(int[] a)
	{
		for(int i=1;i<=a.length-1;i=i+2)
		{
			System.out.println(a[i]);
		}
	}
	public static void main(String[] args) 
	{
		int [] a={1,2,3,4,5,6,7};
		add(a);
	}
}