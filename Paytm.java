package com.jspider.p1;
 interface  Paytm {
	 int id=101;
	 void payment();

}
 class User implements Paytm{
	 public void payment() {
		 System.out.println("paying through paytm");
	 }
	 public static void main(String[] args) {
		 System.out.println("ID:"+Paytm.id);
		 User user=new User();
		 user.payment();
		
	}
 }
