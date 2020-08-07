package com.yudong80.java.ch07;

import java.util.Random;

public class RandomExample {
	public static void main(String[] args) {
		Random r = new Random();
		final int NUMBERS = 10;
		
		//1. ������ ����
		System.out.println("������(int��): ");
		for (int i=0; i< NUMBERS; ++i) {
			System.out.print(r.nextInt() + " ");
		}		
		
		//2. ������ ����(bounded) 
		System.out.println("\n������(int��, bounded): ");
		for (int i=0; i< NUMBERS; ++i) {
			System.out.print(r.nextInt(1000) + " ");
		}		
		
		//3. double �� ���� 
		System.out.println("\n������(double��): ");
		for (int i=0; i< NUMBERS; ++i) {
			System.out.print(r.nextDouble() + " ");
		}		

		//4. float �� ���� 
		System.out.println("\n������(float��): ");
		for (int i=0; i< NUMBERS; ++i) {
			System.out.print(r.nextFloat() + " ");
		}		
	}
}
