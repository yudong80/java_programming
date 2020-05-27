package com.yudong80.java.ch04;

public class StaticBasic {
	static double PIE = 3.141592; 
	
	static boolean isPositive(int num) { 
		return num > 0;
	}
	
	public static void main(String[] args) {
		//1. static�� �޼��� ���ο����� ����� �� �����ϴ�. 
		//static int num = 0; //������ ���� �߻�! 
		
		//2. static�� �Լ� �ܺο� �ִ� ������ �����մϴ�. 
		System.out.println("PIE �� " + PIE + " �Դϴ�.");
		
		//3. static�� �Լ��� ���� �� �ֽ��ϴ�.
		int num = 500;
		boolean isPositive = isPositive(num);
		System.out.println(num + "�� ����ΰ���? " + isPositive);
	}
}
