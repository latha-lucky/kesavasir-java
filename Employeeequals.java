package com.jspider.p1;

public class Employeeequals {
	int id;
	Employeeequals(int age){
		this.id=id;
	}
	public boolean equals(Object obj) {
		Employeeequals e=(Employeeequals)obj;
		return this.id==e.id;
	}
	public static void main(String[] args) {
		Employeeequals e1=new Employeeequals(100);
		Employeeequals e2=new Employeeequals(100);
		System.out.println(e1.equals(e2));
		
	}

}
