package com.yudong80.java.ch04;

import java.util.Scanner;

public class EvenOddNumbersV2 {
	public static boolean isEven(int num) { 
		return num % 2 == 0;
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		//0���� ������ ���α׷� ���� 
		while(true) {
			System.out.println("[¦��Ȧ�� �Ǻ���] ���� �Է��ϼ���? ");
			int num = s.nextInt();
			
			if (num < 0) break;
			
			if (isEven(num)) {
				System.out.println(num + "�� ¦���Դϴ�.");
			} else {
				System.out.println(num + "�� Ȧ���Դϴ�.");
			}
		}
		
		System.out.println("���α׷��� ����Ǿ����ϴ�.");
		s.close();
	}
}