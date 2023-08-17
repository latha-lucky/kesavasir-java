class Add
{
  public static void arrayu(int[] a) 
  {
  	for(int i=1;i<=a.length-1;i=i+2)
  	{
  		System.out.println(a[i]);
  	}
  }
  public static void main(String[] args) 
  {
  	int[]a={2,3,5,6,7,9,88};
  	arrayu(a);
  }
}