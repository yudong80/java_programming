package com.yudong80.java.ch03;

public class IfNested {
	public static void main(String[] args) {
		//1. 2�ܰ� if 
		int value = 100; 
		
		if (value > 50) {
			System.out.println(value + "�� 50���� Ů�ϴ�.");
			if (value > 60) {
				System.out.println(value + "�� 60���� Ů�ϴ�.");
			}
		}
		
		//2. 3�ܰ� if
		int length = 655; 
		
		if (length > 1000) { 
			System.out.println(length + "�� 1000���� Ů�ϴ�.");
		} else { 
			if (length > 500) { 
				System.out.println(length + "�� 500���� Ů�ϴ�.");
				if (length > 600) { 
					System.out.println(length + "�� 600���� Ů�ϴ�.");					
				}
			} 
		}
	}
}
