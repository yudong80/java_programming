package com.yudong80.java.ch09.exceptions;

public class TryCatchSameExample {
	public static void main(String[] args) {
		//1. try catch �� (catch�� ���)
		try {
			throw new ArithmeticException("���� �߻�");						
		} catch (NullPointerException | ArithmeticException e) {
			System.out.println("NullPointerException Ȥ�� ArithmeticException �߻�: " + e.getMessage());
		} 
	}
}
