class Pat5
{   public static void pat(int n)
	{   
		int count=1;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(j+" ");
				
			}
			System.out.println();
			count++;
		}
	}
	public static void main(String[] args) 
	{
		pat(3);
	}
}

			
		
			
		

	
	
