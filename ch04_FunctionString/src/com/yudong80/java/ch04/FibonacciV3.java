package com.yudong80.java.ch04;

import java.util.Scanner;

public class FibonacciV3 {
	static int getUserInput() {
		Scanner s = new Scanner(System.in);	
		System.out.println("���� ������ �Է��ϼ���");
		int num = s.nextInt();
		s.close(); //����ϸ� �ִ��� ���� �ݾ� �ݴϴ� 
		return num;
	}
	
	static void getFibonacci(int fibonacci[]) {
		int a = 1;
		int b = 1;
		
		int num = fibonacci.length;
		for (int i=1; i <= num; ++i) {
			fibonacci[i-1] = a + b;
			a = b;
			b = fibonacci[i-1];
		}
	}
	
	public static void main(String[] args) {
		System.out.println("�ĺ���ġ ���� �����");
		
		int num = getUserInput();
		
		int[] fibonacci = new int[num]; 
		getFibonacci(fibonacci);
		
		System.out.println("���: ");
		for (int i=0; i < num; ++i) {
			System.out.println(fibonacci[i]);
		}
	}
}
