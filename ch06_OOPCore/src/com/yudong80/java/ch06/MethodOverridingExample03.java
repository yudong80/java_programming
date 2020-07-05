package com.yudong80.java.ch06;

public class MethodOverridingExample03 {
	public static void main(String[] args) {
		//1. ���� ��Ȳ 
		BankAccount acc1 = new SavingAccount("ACC-101", 500_000);
		acc1.deposit(100_000); //�߰� ���� �ȵǾ�� �� 
		acc1.withdraw(300_000); //���������� ���� �Ұ� �ؾ� �� 
		System.out.println("- �ܰ�� " + acc1.getBalance() + "�� �Դϴ�.");
		
		//2. �޼��� �������̵����� ���� �ذ� 
		SavingAccountV2 sav = new SavingAccountV2("ACC-102", 700_000);
		sav.deposit(100_000);
		System.out.println("- �ܰ�� " + sav.getBalance() + "�� �Դϴ�."); //�ܰ� �״���� 
		
		sav.expire();
		System.out.println("- �ܰ�� " + sav.getBalance() + "�� �Դϴ�.");
		sav.withdraw(500_000);
		System.out.println("- �ܰ�� " + sav.getBalance() + "�� �Դϴ�.");
	}
}
