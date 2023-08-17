class Reverse
{   public static void reversearray(int [] a)
	{
		for(int index=a.length-1;index>=0;index--)
		{
			System.out.println(a[index]);
		}
	}
	public static void main(String[] args) 
	{
		int [] a={1,2,3,4,5,6,7};
		reversearray(a);
	}
}