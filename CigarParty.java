class CigarParty
{
	public static boolean cigarparty(int cigar , boolean isweekend)
	{
		if(isweekend == false && cigar>=40 && cigar<=60)
		{
			return true;
		}
		else if(isweekend == true && cigar>=40)
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
		System.out.println(cigarparty(30,false));
		System.out.println(cigarparty(50,false));
		System.out.println(cigarparty(70,true));
	}
}