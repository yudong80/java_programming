package com.yudong80.java.ch02;

import java.util.Scanner;

public class InputDouble {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("ù��° �Ǽ��� �Է��ϼ���? ");
		double first = s.nextDouble();
		
		System.out.println("�ι�° �Ǽ��� �Է��ϼ���? ");
		double second = s.nextDouble();
		
		double added = first + second;
		System.out.println("�� �Ǽ��� ���� " + added + " �Դϴ�.");		
	}
}
