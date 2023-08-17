package example;
import java.util.Comparator;

public class SortHotelByName implements Comparator<Hotel> {
	
	public int compare(Hotel x,Hotel y) {
		return x.name.compareTo(y.name);
	}

}
