package com.yudong80.java.ch03;

public class IfElse {
	public static void main(String[] args) {
		//2. if�� else 
		int grade = 88; 
		
		if (90 < grade && grade <= 100) {
			System.out.println("����� ������ A");
		} else if (80 < grade && grade <= 90) {
			System.out.println("����� ������ B");
		} else if (70 < grade && grade <= 80) {
			System.out.println("����� ������ C");			
		} else if (60 < grade && grade <= 70) {
			System.out.println("����� ������ D");
		} else {
			System.out.println("����� ������ F");
		}
	}
}
