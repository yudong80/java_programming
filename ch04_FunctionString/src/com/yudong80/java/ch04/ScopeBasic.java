package com.yudong80.java.ch04;

public class ScopeBasic {
	static int CONSTANT = 999;
	
	String title = "ScopeBasic";
	
	public static void main(String[] args) {
		//1. ���� ���� 
		int number = 333;
		System.out.println("�������� number�� ���� " + number);
		
		//2. ��� ���� (5�� ����)
//		String str = title;
		System.out.println("������� title�� ������ �� �����ϴ�.");
		
		//3. static ����
		System.out.println("static ������ CONSTANT�� ���� " + CONSTANT);
		
		//4. ��ȣ���� scope
		for(int i=0; i < 5; ++i) { 
			System.out.println(" i = " + i);
		}
		System.out.println("�߰�ȣ�� ����� i ������ ������ �� �����ϴ�.");
		
		//5. �ٸ�  �޼����� scope
		int seven = 7;
		boolean isNaturalNumber = isNaturalNumber(seven);
		System.out.println("isNaturalNumber() �޼��忡 �ִ� ������ ������ �� �����ϴ�.");
	}
	
	static boolean isNaturalNumber(int num) { 
		if (num >= 0) {
			return true;
		}
		return false;
	}
}
