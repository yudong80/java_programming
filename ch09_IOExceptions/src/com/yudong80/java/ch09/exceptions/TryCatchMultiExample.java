package com.yudong80.java.ch09.exceptions;


public class TryCatchMultiExample {
	public static void main(String[] args) {
		//1. ���� try catch �� 
		try {
			throw new Exception();						
		} catch (NullPointerException e) {
			System.out.println("NullPointerException �߻�: " + e.getMessage());
		} catch (Exception e) {
			System.out.println("Exception �߻�: " + e.getMessage());
		}
	}
}