package colletionprogramms.com;
import java.util.TreeSet;

public class TreeSet1 {
	public static void main(String[] args) {
		TreeSet<String>t=new TreeSet<String>();
		t.add("B");
		t.add("C");
		t.add("A");
		for(String s:t) {
			System.out.println(s);
		}
		
	}

}
