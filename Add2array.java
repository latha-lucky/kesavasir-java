class Add2array
{   public static void add(int[] a)
	{
		for(int i=0;i<=a.length-1;i++)
		{
			if(i%2==0)
			{
				System.out.println(a[i]);
			}
		}
	}
	public static void main(String[] args) 
	{
		int [] a={3,7,9,10,11};
		add(a);
	}
}