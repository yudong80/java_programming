package com.yudong80.java.ch03;

import java.util.Scanner;

public class ArrayStringExampleV2 {
	public static void main(String[] args) {
		String[] cities = new String[10];
		
		Scanner s = new Scanner(System.in);
		int count = 3;
		for (int idx=0; idx < count; ++idx) {
			System.out.println((idx+1) + "��° ���ø� �Է��ϼ���");
			cities[idx] = s.nextLine();
		}
		s.close();
		
		System.out.println("-----------------------");
		System.out.println("�Է��� ������ ������ " + count);
		System.out.println("ù��° ���ô� " + cities[0]);
		System.out.println("������ ���ô� " + cities[count-1]);
	}
}
