package com.yudong80.java.ch09.exceptions;

public class TryCatchExample {
	public static void main(String[] args) {
		//1. null ���� 
		Object nullObj = null;
		
		//2. try catch �� 
		try {
			System.out.println("����Ǵ� ����");
			
			nullObj.toString(); 
			
			System.out.println("����� �������� �ʽ��ϴ�");
			
		} catch (NullPointerException e) {
			System.out.println("NullPointerException �߻�: " + e.getMessage());
		}
		
		//3. Ȯ�� 
		System.out.println("�� ������ ����˴ϴ�!!");
	}
}