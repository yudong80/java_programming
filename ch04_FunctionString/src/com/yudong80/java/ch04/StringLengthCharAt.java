package com.yudong80.java.ch04;

public class StringLengthCharAt {
	public static void main(String[] args) {
		//1. length() ����
		String java = "Java";
		int len = java.length();
		System.out.println(java + "��  ���̴� " + len + " �Դϴ�.");
		
		String emptyString = "";
		System.out.println("�� ���ڿ���  ���̴� " + emptyString.length() + " �Դϴ�.");
		
		//2. charAt() ����
		String[] stars = {
				"�����ڸ�", "�ֵ����ڸ�", "���ڸ�",
		};
		
		for (String star : stars) {
			char firstChar = star.charAt(0);
			char lastChar = star.charAt(star.length() -1);
			System.out.println(star + "�� ù��° ���ڴ� " + firstChar + " �Դϴ�");
			System.out.println(star + "�� ������ ���ڴ� " + lastChar + " �Դϴ�");
		}
	}
}
