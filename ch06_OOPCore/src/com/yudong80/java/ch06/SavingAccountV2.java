package com.yudong80.java.ch06;

public class SavingAccountV2 extends BankAccount {
	private static final double SAVING_ACCOUNT_INTEREST_RATE = 0.02; //2%
	
	private boolean isExpired = false;
	
	public SavingAccountV2(String accNumber, int deposit) {
		super(accNumber);
		super.balance = deposit;
		System.out.println(accNumber + "���°� �����Ǿ����ϴ� (�ܰ�: " + deposit + " ��)");
	}
	
	public int getMaturedAmount() {
		double res = super.balance * (1 + SAVING_ACCOUNT_INTEREST_RATE);
		return (int) res;
	}	
	
	public void expire() {
		isExpired = true;
		balance = getMaturedAmount();
	}

	@Override
	public void deposit(int amount) {
		System.out.println("���� ������ �߰� ������ �� �� �����ϴ�.");
	}
	
	@Override
	public void withdraw(int amount) {
		if(!isExpired) {
			System.out.println("���� ������ �������� ������ �Ұ��մϴ�.");
			return;
		}
		
		super.withdraw(amount);
	}
}