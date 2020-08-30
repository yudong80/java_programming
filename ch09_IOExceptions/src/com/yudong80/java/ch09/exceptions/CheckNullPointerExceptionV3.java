package com.yudong80.java.ch09.exceptions;

public class CheckNullPointerExceptionV3 {		
	public static void main(String[] args) {
		String text = "Hello Java";
		
		//1. �������� ��� 
		boolean endsWithJava = text.endsWith("Java");
		System.out.println(text + "�� Java�� ��������? " + endsWithJava);
				
		//2. NPE �߻� 
		boolean endsWithNull = text.endsWith(null);
		System.out.println(text + "�� null�� ��������? " + endsWithNull);
	}
}


