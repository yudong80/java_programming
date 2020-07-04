package com.yudong80.java.ch06;

public class BankAccount {
	protected String accountNumber;
	protected int balance;
	
	public BankAccount(String accNumber) {
		accountNumber = accNumber;
		balance = 0;
	}
	
	public void deposit(int amount) {
		balance += amount;
	}
	
	public void withdraw(int amount) {
		if (amount > balance) {
			System.out.println("�ܰ� �����ϴ�.");
			return;
		}
		
		balance -= amount;
	}
	
	public int getBalance() {
		return balance;
	}
}