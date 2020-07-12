package com.yudong80.java.ch06.inner;

class OuterClass {
	private int outerAge = 21;
	
	public void printOuterAge() {
		System.out.println("�ܺ� Ŭ������ ����? " + outerAge);
		
		//�ܺ� Ŭ���������� ���� Ŭ������ ������ �� ���� 
		//System.out.println("���� Ŭ������ ����? " + innerAge); //������ ����
	}
	
	class InnerClass {
		private int innerAge = 25;

		public void printInnerAge() {
			System.out.println("�ܺ� Ŭ������ ����? " + outerAge);
			printOuterAge();
			
			System.out.println("���� Ŭ������ ����? " + innerAge);
		}		
	}
}

public class InnerClassExample {
	public static void main(String[] args) {
		OuterClass outer = new OuterClass();
		OuterClass.InnerClass inner = outer.new InnerClass();
		
		outer.printOuterAge();
		inner.printInnerAge();
	}
}
