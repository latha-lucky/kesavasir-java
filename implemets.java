package com.jspiders.p1;

interface  Paytm {
	int id=967;
	void paytment();

}
class User implements Paytm{
	public void paytment() {
		System.out.println("paying through paytm");
	}
	public static void main(String[] args) {
		System.out.println("id:"+Paytm.id);
		User user=new User();
		user.paytment();
	}
}
