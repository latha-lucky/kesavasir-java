class Pat6
{   public static void pat(int n)
	{
		int count=3;
		for(int i=3;i>=1;i--)
		{
			for(int j=3;j>=i;j--)
			{
				System.out.print(j+" ");
				count++;
			}
			System.out.println();
		}
	}
	public static void main(String[] args) 
	{
		pat(3);
	}
}