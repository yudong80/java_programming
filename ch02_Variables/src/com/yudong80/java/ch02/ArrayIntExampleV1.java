package com.yudong80.java.ch02;

public class ArrayIntExampleV1 {
	public static void main(String [] args) { 
		int[] grades = {80, 95, 92, 70};
		
		System.out.println("����: " + grades[0]);
		System.out.println("����: " + grades[1]);
		System.out.println("����: " + grades[2]);
		System.out.println("����: " + grades[3]);
		
		double average = (grades[0] + grades[1] + grades[2] + grades[3]) / grades.length;
		
		System.out.println("������ ��� ����: " + average);		
	}
}
