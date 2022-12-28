package com.myjava.Abstraction;

import java.util.Scanner;

public class ABC_Bank extends Bank {
	
	ABC_Bank(int cId, double amount){
		super(cId,amount);
	}
	
	 public static void main(String[] args) {
		 long withDrawAmount;
		 double depositAmount,balance;
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter customer ID:");
		 int id=sc.nextInt();
		 ABC_Bank obj=new ABC_Bank(id, 234567.07);
		 System.out.println("Choose option: 1. Withdraw  2. Deposit  3. Check Balance");
		 int option=sc.nextInt();
		 switch(option){
		 case 1:
			 System.out.println("Enter the amount to be withdrwan:");
			 withDrawAmount=sc.nextLong();
			 obj.withdraw(withDrawAmount);
			 break;
		 case 2:
			 System.out.println("Enter the amount to be deposited:");
			 depositAmount=sc.nextDouble();
			 obj.deposit(depositAmount);
			 break;
			 
		 case 3:
			 System.out.println("Balance is "+obj.checkBalance());
			 break;
			 
			 default :
				 System.out.println("please select proper option to proceed further");
		 }
		 

		 
	 }
     public void withdraw(long withDrawAmount){
    	 double totalAmount=amount;
    	 System.out.println("Current bal:"+amount);
    	 amount=totalAmount-withDrawAmount; 
    	 System.out.println("Amount withdraw:"+withDrawAmount);
    	 System.out.println("bal after withdraw: "+amount);
		 
	 }
	 public void deposit(double money){
		 double totalAmount=amount;
    	 System.out.println("Current bal:"+amount);
    	 amount=amount+money;
    	 System.out.println("bal after deposit: "+amount);
	 }
	 public double checkBalance(){
		 return amount;
	 }
	
}

