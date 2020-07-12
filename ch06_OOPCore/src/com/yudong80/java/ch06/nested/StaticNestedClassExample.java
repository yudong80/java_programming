package com.yudong80.java.ch06.nested;

class OuterClass {
	private int outerAge = 22;
	private static int outerStaticAge = 38;
	
	public void printOuterAge() {
		System.out.println("�ܺ� Ŭ������ ����? " + outerAge);
		
		//�ܺ� Ŭ���������� ���� Ŭ������ ������ �� ���� 
		//System.out.println("���� Ŭ������ ����? " + innerAge); //������ ����
	}
	
	private static void printOuterStaticAge() {
		System.out.println("�ܺ� Ŭ������ ���� ����? " + outerStaticAge);
	}
	
	static class InnerClass {
		private int innerAge = 25;

		public void printInnerAge() {		
			System.out.println("���� Ŭ������ ����? " + innerAge);
			
			//�ܺ� Ŭ������ static ��� ������ ���� ���� 
			System.out.println("�ܺ� Ŭ������ ���� ����? " + outerStaticAge);
		}
		
		public void printStaticOuterAge() {
			printOuterStaticAge();
		}
	}	
}

public class StaticNestedClassExample {
	public static void main(String[] args) {
		OuterClass outer = new OuterClass();
		OuterClass.InnerClass inner = new OuterClass.InnerClass();
		
		outer.printOuterAge();
		inner.printInnerAge();
		inner.printStaticOuterAge();
	}
}
