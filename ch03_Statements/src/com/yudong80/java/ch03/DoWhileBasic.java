package com.yudong80.java.ch03;

public class DoWhileBasic {
	public static void main(String[] args) {
		String[] planets = {
			"����", "�ݼ�", "����", "ȭ��", "��", "�伺",
		};
		
		int i = 0;
		do { 
			String dest = planets[i];
		
			System.out.println(dest + "(��)�� ���� ������ ����!");
			i += 1;
		} while (i < planets.length);
	}
}
