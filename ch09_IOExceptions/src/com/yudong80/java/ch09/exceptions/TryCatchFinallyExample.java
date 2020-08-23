package com.yudong80.java.ch09.exceptions;

public class TryCatchFinallyExample {
	public static void main(String[] args) {
		//1. �������� �ڵ�  
		try {
			System.out.println("�������� �ڵ�");
		} catch (Exception e) {
			System.out.println("Exception �߻�: " + e.getMessage());
		} finally {
			System.out.println("���ܰ� �߻����� �ʾƵ� ����˴ϴ�!");
		}
		
		//2. ��� ���� �߻� 
		try {
			throw new ArithmeticException("��� ���� �߻�"); 			
		} catch (NullPointerException e1) {
			System.out.println("NullPointerException �߻�: " + e1.getMessage());
		} catch (ArithmeticException e2) {
			System.out.println("ArithmeticException �߻�: " + e2.getMessage());
		} finally { 
			System.out.println("�� ������ finally ����˴ϴ�!!");
		}
	}
}