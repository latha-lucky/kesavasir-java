class Degree
{
	public static boolean degree(String degreeStream)
	{
		if(degreeStream == "cs" || degreeStream == "is" || degreeStream =="it")
		{
			return true;
		}
		else
		{
			return false;

		}
	}
	public static void main(String[] args) 
	{
		System.out.println(degree("it"));
	}
}