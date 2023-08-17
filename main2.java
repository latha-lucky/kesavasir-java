class Cigar1
{  
 public  boolean party(int cigar,boolean isweekend)
	{
		if(isweekend==false && cigar>=40 && cigar>=60)
		{
			return true;
		}
		else if(isweekend==true && cigar>=40)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
class Maincigar
  {
public static void main(String[] args) 
{
 System.out.println(new Cigar1().party(30,false));
}
   }
}