package com.jspider.p1;
 

 class Customer extends HDFC {
	 void deposit() {
		 System.out.println("depo sting amount");
	 }
	 void withdraw() {
		 System.out.println("withdrawing amount");
	 }
	 public static void main(String[] args) {
		 Customer customer=new Customer();
		 customer.deposit();
		 customer.withdraw();
		
	}

}
