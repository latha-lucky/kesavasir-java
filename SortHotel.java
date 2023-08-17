package example;

import java.util.TreeSet;

public class SortHotel {
	public static void main(String[] args) {
		Hotel h1=new Hotel("A",7.9);
		Hotel h2=new Hotel("C",8.9);
		Hotel h3=new Hotel("D",4.9);
		
		SortHotelByName name=new SortHotelByName();
		SortHotelByRating rating=new SortHotelByRating();
		
		TreeSet<Hotel>t=new TreeSet<Hotel>(name);
		t.add(h1);
		t.add(h2);
		t.add(h3);
		
		for(Hotel h:t) {
			System.out.println(h);
		}
	}

}
