package com.yudong80.java.ch03;

public class WhileContinueV1 {
	public static void main(String[] args) {
		int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8};
		int i = 0;
		
		while (i < numbers.length) {
			int num = numbers[i];
			if (num < 5) { 
				continue; //�̷��� �ϸ� �ȵ˴ϴ�!
			}
			
			System.out.println("�̹� ���ڴ� " + num + " �Դϴ�.");
			i += 1;
		}
	}
}