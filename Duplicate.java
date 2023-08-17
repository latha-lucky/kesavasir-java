class Duplicate
{   public static void duplicatearray(int [] a)
	{   
		for(int i=0;i<=a.length-1;i++)
		{
			for(int j= i+1;j<=a.length-1;j++)
			{
				if((a[i]==a[j]) && (i!=j))
				{
					System.out.println(a[j]);
				}
			}
		}
	}
	public static void main(String[] args) 
	{
		int [] a={1,3,5,1,3,2,5,6};
		duplicatearray(a);
	}
}