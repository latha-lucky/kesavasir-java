class Vowel
{
	public static void vowel(char options)
	{
		switch(options)
		{
			case 'A':System.out.println("vowel A is selected");
			break;
			case 'E':System.out.println("vowel E is selected");
			break;
			case 'I':System.out.println("vowel I is selected");
			break;
			case 'O':System.out.println("vowel O is selected");
			break;
			case 'U':System.out.println("vowel U is selected");
			break;
			case 'a':System.out.println("vowel a is selected");
			break;
			case 'e':System.out.println("vowel e is selected");
			break;
			case 'i':System.out.println("vowel i is selected");
			break;
			case 'o':System.out.println("vowel o is selected");
			break;
			case 'u':System.out.println("vowel u is selected");
			break;
			default:System.out.println("not a vowel");
		}
	}
	public static void main(String[] args) 
	{
		vowel('A');
		vowel('E');
		vowel('I');
		vowel('S');
	}

}