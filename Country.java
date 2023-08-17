package com.jspiders.p1;

public class Country {
	India selectState(int choice) {
		if(choice==1) {
			return new Karnataka();
		}
		else if(choice==2) {
			return new  TamilNadu();
		}
		else if(choice ==3) {
			return new Goa();
		}
		else {
			return null;
		}
	}

}
