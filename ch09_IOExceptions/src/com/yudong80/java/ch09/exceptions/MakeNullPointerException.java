package com.yudong80.java.ch09.exceptions;

public class MakeNullPointerException {
	public static void main(String[] args) {
		//1. null ��ü ����� 
		Object nullObj = null;
		
		//2. NullPointerException �߻�
		// � �޼��带 ȣ���ص� �׽��ϴ�. 
		nullObj.toString();
		
		//3. �� �� ���� ���� 
		System.out.println("�� ������ ������� �ʽ��ϴ�");
	}
}
