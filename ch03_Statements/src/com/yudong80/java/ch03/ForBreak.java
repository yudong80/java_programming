package com.yudong80.java.ch03;

public class ForBreak {
	public static void main(String[] args) {
		int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8};
		
		for(int i=0; i < numbers.length; i++) {
			int num = numbers[i];
			if (num > 5) {
				System.out.println("5���� ũ�� �ݺ����� �ߴ��մϴ�.");
				break; //���Ŀ��� ���̻� �ݺ����� �������� �ʽ��ϴ�.
			}
			
			System.out.println("�̹� ���ڴ� " + num + " �Դϴ�.");
		}
	}
}
