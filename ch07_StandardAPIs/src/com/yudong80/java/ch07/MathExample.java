package com.yudong80.java.ch07;

public class MathExample {
	public static void main(String[] args) {
		//1. ���밪 
		double a = 108.3;
		float b = 99.337f;
		
		System.out.println(a + "�� ���밪: " + Math.abs(a));
		System.out.println(b + "�� ���밪: " + Math.abs(b));
		
		//2. �ִ밪 & �ּҰ�
		int[] positiveNumbers = {100, 200, 90};
		int max = 0;
		for (int number : positiveNumbers) {
			max = Math.max(max, number);
		}
		System.out.println("�ִ밪�� " + max);
	
		double[] realNumbers = {8974.3, -20000, 100.9};
		double min = Double.MAX_VALUE;
		for (double number : realNumbers) {
			min = Math.min(min, number);
		}
		System.out.println("�ּҰ��� " + min);
		
		//3. �ݿø�, �ø�, ���� 
		System.out.print("�ݿø�: {");
		for (double number : realNumbers) {
			System.out.print(Math.round(number) + ",");
		}
		System.out.println("}");
		
		System.out.print("�ø�: {");
		for (double number : realNumbers) {
			System.out.print(Math.ceil(number) + ",");
		}
		System.out.println("}");

		System.out.print("����: {");
		for (double number : realNumbers) {
			System.out.print(Math.floor(number) + ",");
		}
		System.out.println("}");
		
		//4. �����Լ� 
		int base = 10;
		int exp = 3;
		double res = Math.pow(base, exp);
		System.out.println (base + "^" + exp + " = " + res);
	}
}
