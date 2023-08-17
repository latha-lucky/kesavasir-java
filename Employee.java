package com.jspiders;

public class Employee implements Comparable<Employee> {
	int id;
	String name;
	Employee(int id,String name){
		this.id=id;
		this.name=name;
	}
	public String toString() {
		return "Id:"+id+" "+"Name:"+name;
	}
	public int compareTo(Employee e) {
		return this.id-e.id;
	}

}
