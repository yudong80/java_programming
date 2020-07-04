package com.yudong80.java.ch06;

class DefaultConstructorParentClass {
	
}

class PrivateConstructorParentClass {
	private PrivateConstructorParentClass() {
		
	}
	
	public PrivateConstructorParentClass(String arg) {
		System.out.println("PrivateConstructorParentClass ��ü�� �����Ǿ����ϴ�. arg? " + arg);
	}	
}

class ChildClassA extends DefaultConstructorParentClass {
	public ChildClassA() {
		System.out.println("ChildClassA ��ü�� �����Ǿ����ϴ�.");
	}
}

class ChildClassB extends PrivateConstructorParentClass {

	public ChildClassB(String arg) {
		super(arg);
	}
}

public class InheritanceBasic04 {
	public static void main(String[] args) {
		//1. �θ� Ŭ������ �����ڰ� ���� ��� 
		DefaultConstructorParentClass obj1 = new ChildClassA();
		ChildClassA obj2 = new ChildClassA();
		
		//2. �θ� Ŭ�������� private �����ڸ� �����ϴ� ��� 
		PrivateConstructorParentClass obj3 = new ChildClassB("�θ� Ŭ������ ����");
		ChildClassB obj4 = new ChildClassB("�ڽ� Ŭ������ ����");
	}
}
