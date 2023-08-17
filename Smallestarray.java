class Smallestarray
{   public static void smallest(int [] a)
	{    
		int min=a[0];
		for(int i=0;i<=a.length;i++)
		{
			for(int j=i+1;j<=a.length-1;j++)
			{
				if(a[j]<min)
				{
					min=a[j];
				}
			}
		}
		System.out.println(min);
	}
	public static void main(String[] args) 
	{
		int [] a={1,2,30,40,50};
		smallest(a);
	}
}