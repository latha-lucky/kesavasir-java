class Largestarray
{   public static void largest(int [] a)
	{    
		int max=a[0];
		for(int i=0;i<=a.length;i++)
		{
			for(int j=i+1;j<=a.length-1;j++)
			{
				if(a[j]>max)
				{
					max=a[j];
				}
			}
		}
		System.out.println(max);
	}
	public static void main(String[] args) 
	{
		int [] a={1,2,30,40,50};
		largest(a);
	}
}