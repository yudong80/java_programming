package com.yudong80.java.ch06.anonymous;

class OuterClass {
	private int age = 21;
	protected int newAge = 19;
	
	public void printAge() {
		System.out.println("�ܺ� Ŭ������ ����? " + age);
	}
}

public class AnonymousInnerClassExample {
	public static void main(String[] args) {
		OuterClass outer = new OuterClass() {
			@Override
			public void printAge() {
				System.out.println("���ο� ����? " + newAge);
			}
		};
		
		outer.printAge();
	}
}