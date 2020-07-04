package com.yudong80.java.ch06;

class SuperClass {
	public int number = 100;
	private String key = "KM-01-9867";
	
	public void print(String msg) {
		System.out.println("������ �޽����� ����մϴ�.\n" + msg);
	}
	
	protected String getKey() {
		return key;
	}
}

class SubClass extends SuperClass {
	public String getSubKey() {
		return "SUB-" + getKey();
	}
}

public class InheritanceBasic02 {
	public static void main(String[] args) {
		//1. ���� Ŭ������ ���� 
		SuperClass sc = new SubClass();
		sc.print("���� Ŭ������ �޼��带 ȣ���մϴ�.");
		System.out.println("key? " + sc.getKey());
	
		//sc.getKey()�� ȣ���� �� �����ϴ� (protected �޼���)
		
		//2. �ڽ� Ŭ������ ����
		SubClass sub = new SubClass();
		System.out.println("subKey? "+ sub.getSubKey());
	}
}
