package com.jspiders.p1;

public class Customerdosa {
	public static void main(String[] args) {
		Hotel hotel=new Hotel();
		Food obj=hotel.orderFood(22);
		if(obj instanceof Idly) {
			System.out.println("eating idly");
		}
		else if(obj instanceof Dosa) {
			System.out.println("eating dosa");
		}
		else {
			System.out.println("eating puri");
		}
		
	}

}
