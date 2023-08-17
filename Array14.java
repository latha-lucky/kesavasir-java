package arrayprogramms.com;

public class Array14 {
	public static void main(String[] args) {
		int n=456;
		int hour=n/60;
		int min=n%60;
		if(hour<=24) {
			System.out.println(hour+":"+min);
			System.out.println(hour+"hr:"+min+"min");
		}
		else {
			System.out.println("invalid timeformate");
		}
		
	}

}
