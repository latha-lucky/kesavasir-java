package com.jspiders.p1;

 class Customer extends HDFC {
	 void deposit() {
		 System.out.println("deposting amount");
	 }
	 void withdraw() {
		 System.out.println("withdrawing amount");
	 }
	 public static void main(String[] args) {
		Customer c1=new Customer();
		c1.deposit();
		c1.withdraw();
	}

}

 