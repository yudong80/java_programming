package com.yudong80.java.ch02;

public class ArrayBasic {
	public static void �迭�ƴ�() { 
		int first = 1;
		int second = 2;
		int third = 3;
		int fourth = 4;
		int fifth = 5; 
		
		System.out.println("�迭 �ƴ�: " + first + " " + second + " " + third + " " + fourth + " " + fifth);
	}
	
	public static void �迭����() {
		int[] numbers = {1, 2, 3, 4, 5};

		System.out.println("�迭 : " + numbers[0] + " " + numbers[1] + " " + numbers[2] + " " + numbers[3] + " " + numbers[4]);
	}
	
	public static void main(String[] args) {
		�迭�ƴ�();
		�迭����();
	}
}
