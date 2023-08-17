package example;
import java.util.Comparator;

public class SortHotelByRating implements Comparator<Hotel> {
	
		public int compare(Hotel x,Hotel y) {
			return x.rating.compareTo(y.rating);
		}

	}


