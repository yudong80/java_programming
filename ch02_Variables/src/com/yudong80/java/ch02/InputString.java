package com.yudong80.java.ch02;

import java.util.Scanner;

public class InputString {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("�̸��� �Է��ϼ���? ");
		String name = s.nextLine();
		
		System.out.println("��� ���� �Է��ϼ���? ");
		String city = s.nextLine();
		
		System.out.println(city + "�� ��� " + name + "�� �ݰ����ϴ�!");
	}
}
