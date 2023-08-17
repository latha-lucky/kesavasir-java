class Percentage
{
	public static boolean percentage(double tenth , double pu, double degree)
	{
		if(tenth>=60 && pu>=60 && degree >=60)
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
		System.out.println(percentage(67.0,66.9,57.98));
	}
}