class Copyarray
{   public static void copyarray(int [] a)
	{
		int [] res=new int[a.length];
		for(int i=0;i<=res.length-1;i++)
		{
			//res[i] = a[i];
			System.out.println(res[i]);
		}
	}
	public static void main(String[] args) 
	{
		int [] a={1,2,3,4};
		copyarray(a);
	}
}