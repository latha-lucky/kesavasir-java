package com.jspiders.p1;

public class Travel {

	public static void main(String[] args) {
		Country c=new Country();
		India obj=c.selectState(3);
		if(obj instanceof Karnataka) {
			System.out.println("travelling karnataka");
		}
		else if(obj instanceof TamilNadu) {
			System.out.println("travelling tamilNadu");
		}
		else if(obj instanceof Goa) {
			System.out.println("travelling goa");
		}
		else {
			System.out.println("stay home");
		}

	}

}
