package com.yudong80.java.ch03;

public class SwitchInt {
	public static void main(String[] args) {
		int[] monthDays = {31, 29, 31, 30, 31}; //1������ 5������ 
		
		for (int days : monthDays) {
			switch (days) {
			case 29:
				System.out.println("�̹����� 29���Դϴ�.");
				break;
			case 30: 
				System.out.println("�̹����� 30���Դϴ�.");
				break;
			default:
				System.out.println("�̹����� 31���Դϴ�.");
			}
		}
	}
} 
