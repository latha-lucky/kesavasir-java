package colletionprogramms.com;
import java.util.TreeSet;

public class BeerSolution {
	public static void main(String[] args) {
		Beer b1=new Beer("B",150,34.5);
		Beer b2=new Beer("B",160,25.5);
		Beer b3=new Beer("B",140,16.5);
		
		TreeSet<Beer>t=new TreeSet<Beer>();
		t.add(b1);
		t.add(b2);
		t.add(b3);
		
		for(Beer b:t) {
			System.out.println(b);
			
			
		}
	}

}
