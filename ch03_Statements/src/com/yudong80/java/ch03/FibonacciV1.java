package com.yudong80.java.ch03;

import java.util.Scanner;

public class FibonacciV1 {
	public static void main(String[] args) {
		System.out.println("�ĺ���ġ ���� �����");
		
		Scanner s = new Scanner(System.in);	
		System.out.println("���� ������ �Է��ϼ���");
		int num = s.nextInt();
		s.close(); //����ϸ� �ִ��� ���� �ݾ� �ݴϴ� 
		
		int a = 1;
		int b = 1;
		
		int[] fibonacci = new int[num];
		for (int i=1; i <= num; ++i) {
			fibonacci[i-1] = a + b;
			a = b;
			b = fibonacci[i-1];
		}
		
		System.out.println("���: ");
		for (int i=0; i < num; ++i) {
			System.out.println(fibonacci[i]);
		}
	}
}