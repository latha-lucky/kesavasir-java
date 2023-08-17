class Array
{    public static void printarray(int[] a)
	{
		for(int index=0;index<=a.length-1;index++)
		{
			System.out.print(a[index]);
		}
	}
	public static void main(String[] args) 
	{
		int [] a={10,20,30,40,50};
		printarray(a);
	}
}