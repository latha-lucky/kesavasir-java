class Sumarray
{   public static void sumarray(int[] a)
	{
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			sum=sum+a[i];
			{
				System.out.println(sum);
			}
		}
	}
	public static void main(String[] args) 
	{
		int []a={1,2,3,4,5,6,7};
		sumarray(a);
	}
}