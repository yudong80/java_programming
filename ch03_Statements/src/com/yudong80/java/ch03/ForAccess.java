package com.yudong80.java.ch03;

public class ForAccess {
	public static void main(String[] args) {
		int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

		//1. �����ְ� �����ϱ� (��: ¦���� ���)  	
		System.out.println("¦���� ����ϱ�");
		for (int i = 1; i < numbers.length; i += 2) {
			System.out.println("¦��: " + numbers[i]);
		}
		
		//2. �������� �����ϱ� 
		System.out.println("�������� ����ϱ�");
		for (int i = 0; i < numbers.length; ++i ) {
			int number = numbers[numbers.length -1 -i];
			System.out.println("����: " + number);
		}
	}
}
