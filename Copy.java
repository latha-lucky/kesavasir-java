class Copy
{
	public static void array(int[] a) 
	{
		int[]res=new int[a.length];
		for(int i=0;i<=a.length-1;i++)
		{   
			res[i]=a[i];
			System.out.println(a[i]);
		}
	}
	public static void main(String[] args) 
	{
		int[]a={1,2,3,4,5,6};
		array(a);
	}
}
