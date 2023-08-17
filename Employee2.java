package com.jspiders.p1;

public class Employee2 {
	void work() {
		System.out.println("Employee working");
	}

}
class Developer extends Employee2{
	void work() {
		super.work();
		System.out.println("developing apps");
	}
}
