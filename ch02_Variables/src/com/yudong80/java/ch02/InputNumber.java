package com.yudong80.java.ch02;

import java.util.Scanner;

public class InputNumber {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("ù��° ���ڸ� �Է��ϼ���? ");
		int first = s.nextInt();
		
		System.out.println("�ι�° ���ڸ� �Է��ϼ���? ");
		int second = s.nextInt();
		
		int added = first + second;
		System.out.println("�� ������ ���� " + added + " �Դϴ�.");
	}
}
