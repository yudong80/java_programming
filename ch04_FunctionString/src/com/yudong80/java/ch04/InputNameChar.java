package com.yudong80.java.ch04;

import java.util.Scanner;

public class InputNameChar {
	public static void main(String[] args) {
		System.out.println("�̸��� �Է��ϼ���? ");
		
		System.out.println("�̸��� �����ΰ���? ");
		Scanner s = new Scanner(System.in);
		int nameLength = s.nextInt();
		
		char[] name = new char[nameLength];
		for (int i=0; i < nameLength; ++i) {
			System.out.println((i+1) +  "��° ���ڸ� �Է��ϼ���?");
			char ch = s.next().charAt(0); //nextChar()�� ��� �����ϰ� ���� 
			name[i] = ch;
		}
		s.close();
		
		for (char ch : name) {
			System.out.print(ch);
		}
		System.out.println(" �� �ݰ����ϴ�!");
	}
}
