class Pat4
{   public static void pat(int n)
	{
		char count='A';
		{
			for(char i='A';i<=n;i++)
			{
				for(char j='A';j<=n;j++)
				{
					System.out.print(count+" ");

				}
				System.out.println();
				count++;

			}
		}
		     
	}
	public static void main(String[] args) 
	{
		pat('C');
	}
}