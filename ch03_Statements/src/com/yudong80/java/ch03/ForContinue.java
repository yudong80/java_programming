package com.yudong80.java.ch03;

public class ForContinue {
	public static void main(String[] args) {
		int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8};
		for (int i=0; i < numbers.length; ++i) {
			int num = numbers[i];
			if (num < 5) {
				continue; //for �������� �������մϴ�.
			}
			
			System.out.println("�̹� ���ڴ� " + num + " �Դϴ�.");
		}
	}
}