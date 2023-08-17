package com.jspiders.p1;

public class Citizenmain {
	static void selectState(India obj) {
		if (obj instanceof Karnataka) {
			System.out.println("state=karnataka");
			Karnataka k= (Karnataka)obj;
			System.out.println("PM:"+k.pm+"CM:"+k.cm);
		}
		else if(obj instanceof TamilNadu) {
			System.out.println("state=TamilNadu");
			TamilNadu t=(TamilNadu)obj;
			System.out.println("PM:"+t.pm+"CM:"+t.cm);
		}
		else if(obj instanceof Goa) {
			System.out.println("state=Goa");
			Goa g=(Goa) obj;
			System.out.println("PM:"+g.pm+"CM:"+g.cm);
			
		}
	}
	public static void main(String[] args) {
		selectState(new Karnataka());
		selectState(new TamilNadu());
		selectState(new Goa());
		
	}

}
