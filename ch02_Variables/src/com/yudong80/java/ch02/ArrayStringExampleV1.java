package com.yudong80.java.ch02;

import java.util.Scanner;

public class ArrayStringExampleV1 {
	public static void main(String[] args) {
		String[] cities = new String[10];
		
		int idx = 0;
		
		Scanner s = new Scanner(System.in);
		System.out.println("ù��° ���ø� �Է��ϼ���");
		cities[idx++] = s.nextLine();
		
		System.out.println("�ι�° ���ø� �Է��ϼ���");
		cities[idx++] = s.nextLine();
		
		System.out.println("����° ���ø� �Է��ϼ���");
		cities[idx++] = s.nextLine();		
		s.close();
		
		System.out.println("-----------------------");
		System.out.println("�Է��� ������ ������ " + idx);
		System.out.println("ù��° ���ô� " + cities[0]);
		System.out.println("������ ���ô� " + cities[idx-1]);
	}
}
