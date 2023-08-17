class Vote
{
	public static void check(int age)
	{
		if(age>=18)
		{
			System.out.println("eligible for voting");
		}
	    else
	{
		System.out.println("not eligible for voting");
	}
}
public static void main(String[] args) 
    {
	check(53);
	check(17);
    }
}
