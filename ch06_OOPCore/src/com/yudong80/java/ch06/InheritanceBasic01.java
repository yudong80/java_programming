package com.yudong80.java.ch06;

class ParentClass {
	public int publicField = 999;;
	private String privateField;
	
	public void publicMethod(String arg) {
		System.out.println("�θ� Ŭ������ public method �Դϴ�. arg? " + arg);
	}
	
	private void privateMethod() {
		System.out.println("�θ� Ŭ������ private method �Դϴ�. ��ӵ��� �ʽ��ϴ�.");
	}
}

class ChildClass extends ParentClass{
	//���� ����
}

public class InheritanceBasic01 {
	public static void main(String[] args) {
		//1. �θ� Ŭ������ ���� 
		ParentClass parent = new ChildClass();
		parent.publicMethod("�θ� Ŭ������ ����");
		System.out.println("�θ� Ŭ������ public field ��? " + parent.publicField);

		//2. �ڽ� Ŭ������ ����
		ChildClass child = new ChildClass(); 
		child.publicMethod("�ڽ� Ŭ������ ȣ��");
		System.out.println("�ڽ� Ŭ������ public field ��? " + child.publicField);
	}
}

 