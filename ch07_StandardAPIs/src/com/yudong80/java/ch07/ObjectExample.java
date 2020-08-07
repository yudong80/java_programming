package com.yudong80.java.ch07;

public class ObjectExample {
	public static void main(String[] args) {
		//1. Object ��ü ����
		Object a = new Object();
		Object b = new Object();
		
		//2. equals() �޼��� 
		boolean isSameEqual = a.equals(a);
		boolean isABEqual = a.equals(b);
		
		System.out.println("���� ��ü�� equals? " + isSameEqual);
		System.out.println("�ٸ� ��ü�� equals? " + isABEqual);
		
		//3. hashCode() �޼��� 
		int hashCodeA = a.hashCode();
		int hashCodeB = b.hashCode();
		String hexHashCodeA = Integer.toHexString(hashCodeA);
		String hexHashCodeB = Integer.toHexString(hashCodeB);
		System.out.println("a ��ü�� hash code? " + hashCodeA + " > hexString? " + hexHashCodeA);
		System.out.println("b ��ü�� hash code? " + hashCodeB + " > hexString? " + hexHashCodeB);
				
		//4. toString() �޼��� 
		System.out.println("a.toString()? " + a.toString());
		System.out.println("b.toString()? " + b.toString());
	}
}
