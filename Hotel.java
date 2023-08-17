package example;

public class Hotel {
	String name;
	Double rating;
	
	public Hotel(String name, Double rating) {
		this.name = name;
		this.rating = rating;
	}

	@Override
	public String toString() {
		return "Hotel [name=" + name + ", rating=" + rating + "]";
	}
	

}
