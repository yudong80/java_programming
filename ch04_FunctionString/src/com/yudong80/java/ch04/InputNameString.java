package com.yudong80.java.ch04;

import java.util.Scanner;

public class InputNameString {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);	
		System.out.println("�̸��� �Է��ϼ���? ");
		String name = s.nextLine();
		s.close();
		
		System.out.println(name + "�� �ݰ����ϴ�!");
	}
}
