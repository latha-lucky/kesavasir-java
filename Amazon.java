package com.jspiders.p1;

public class Amazon {
	Electronics selectorder(int choice) {
		if(choice==1) {
			return new Mobile();
		}
		else if(choice==2) {
			return new Laptop();
		}
		else if(choice==3) {
			return new Headphone();
		}
		else {
			return null;
		}
	}

}
