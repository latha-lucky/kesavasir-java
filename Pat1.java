class Pat1
{   public static void pat(int n)
	{
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				System.out.print("*"+" ");
			}
			System.out.println();
		}

	}
	public static void main(String[] args) 
	{
		pat(3);
	}
}