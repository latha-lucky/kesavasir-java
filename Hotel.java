package com.jspiders.p1;

public class Hotel {
	Food orderFood(int choice) {
		if(choice==1) {
			Idly i=new Idly();
			return i;
			
		}
		else if(choice==2) {
			Dosa d=new Dosa();
			return d;
		}
		else {
			Puri p=new Puri();
			return p;
		}
	}

}
