package com.jspiders.p1;

public class Personbank {

	public static void main(String[] args) {
		BankImpl bank=new BankImpl();
		bank.deposit(2000);
		bank.withdraw(1000);
		bank.checkbalance();
	}

}
