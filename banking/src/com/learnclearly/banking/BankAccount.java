package com.learnclearly.banking;

import java.util.Random;

public class BankAccount {
	private int actNumber;
	private String customerName;
	private int actBalance;
	public BankAccount() {
		super();
		// TODO Auto-generated constructor stub
	}
	public BankAccount(int actNumber, String customerName, int actBalance) {
		super();
		this.actNumber = actNumber;
		this.customerName = customerName;
		this.actBalance = actBalance;
	}
	public int getActNumber() {
		return actNumber;
	}
	public void setActNumber(int actNumber) {
		this.actNumber = actNumber;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public int getActBalance() {
		return actBalance;
	}
	public void setActBalance(int actBalance) {
		this.actBalance = actBalance;
	}
	public void deposit(int depositAmount) {
		 actBalance += depositAmount;
		  Random r = new Random();
		// after performing deposit we need to store the deposit details in 
		 // an object of a Transaction class
		 // and then store that object in some collection such as Linked List
		 // for future reference
		  Transaction t = new Transaction ( r.nextInt ( ) ,
				  actNumber , depositAmount , " deposit " , actBalance ) ;
		TransactionDetails.addTransaction(t);
		System.out.println("deposite completed and transaction stored...!!");
	}
	
	
	public void withdraw(int withdrawAmount) {
		 Random r = new Random();
		if(withdrawAmount > actBalance) {
			try {
			throw new InsufficientBalanceException();
			}catch (InsufficientBalanceException e) {
				e.printStackTrace();
			}
		}
			
		actBalance -= withdrawAmount;
		Transaction t = new Transaction ( r.nextInt ( ) ,
				actNumber , withdrawAmount , " withdraw " , actBalance ) ;
		TransactionDetails.addTransaction(t);
		System.out.println(" Withdraw completed and transaction stored...!!");
	}
	
	
	

}
