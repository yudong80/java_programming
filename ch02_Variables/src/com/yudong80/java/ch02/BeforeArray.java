package com.yudong80.java.ch02;

public class BeforeArray {
	public static void main(String[] args) {
		int korean = 80;
		int math = 95;
		int english = 92;
		int science = 70;
		
		System.out.println("����: " + korean);
		System.out.println("����: " + math);
		System.out.println("����: " + english);
		System.out.println("����: " + science);
		
		double average = (korean + math + english + science) / 4;
		
		System.out.println("������ ��� ����: " + average);
	}
}
