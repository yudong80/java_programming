package com.yudong80.java.ch06;

public class InheritanceBasic03 {
	public static void main(String[] args) {
		//1. �θ� Ŭ������ ���� 
		BankAccount account = new SavingAccount("ACC-2020-01", 500_000);
		System.out.println("������ �ܰ��? " + account.getBalance() + "��");
		
		account.deposit(100_000);
		account.withdraw(50_000);
		System.out.println("����� �� ������ �ܰ��? " + account.getBalance() + "��");
		
		//account.getMaturedAmount() ȣ�� �Ұ� 
		
		//2. �ڽ� Ŭ������ ���� 
		SavingAccount sav = new SavingAccount("ACC-2020-02", 5_000_000);
		System.out.println("������ �ܰ��? " + sav.getBalance() + "��");
		
		sav.deposit(5_000_000);
		System.out.println("���� ���� ���� �ݾ���? " + sav.getMaturedAmount() + "��");
	}
}
