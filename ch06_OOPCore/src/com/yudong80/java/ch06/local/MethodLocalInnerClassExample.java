package com.yudong80.java.ch06.local;

class OuterClass {
	private int outerAge = 21;
	
	public void printOuterAge() {
		System.out.println("�ܺ� Ŭ������ ����? " + outerAge);
	
		class InnerClass {
			private int innerAge = 25;

			public void printInnerAge() {
				System.out.println("�ܺ� Ŭ������ ����? " + outerAge);
				System.out.println("���� Ŭ������ ����? " + innerAge);
			}		
		}

		InnerClass inner = new InnerClass();
		inner.printInnerAge();
	}
}

public class MethodLocalInnerClassExample {
	public static void main(String[] args) {
		OuterClass outer = new OuterClass();
		outer.printOuterAge();
	}
}