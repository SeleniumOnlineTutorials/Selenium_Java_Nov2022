package com.myjava.Abstraction;

abstract public class Bank {
	
	int customerID;
	double amount;
	Bank(int cId, double amount){
		this.customerID=cId;
		this.amount=amount;
	}
	
	void customerDetails(){
		System.out.println("Customer ID:"+customerID);
		System.out.println("Amount:"+amount);
	}
	
	abstract public void withdraw(long withDrawAmount); //abstract methods, unimplemented methods
	abstract public void deposit(double money);
	abstract public double checkBalance();

}
