package com.jspiders.p1;

class BankImpl implements Bank {
	int balance=5000;
	public void deposit(int amount) {
		System.out.println("depsoting RS"+amount);
		balance=balance+amount;
		System.out.println("amount deposited sccessfuly");
	}
	public void withdraw(int amount) {
		System.out.println("withdraw RS"+amount);
		balance=balance-amount;
		System.out.println("amount withdraw sccessfuly");
	}
	public void checkbalance() {
		System.out.println("checking the balance"+balance);
	}
	@Override
	public void withdarw(int amount) {
		// TODO Auto-generated method stub
		
	}

}
 