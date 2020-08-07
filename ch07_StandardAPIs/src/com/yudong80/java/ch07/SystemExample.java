package com.yudong80.java.ch07;

import java.util.Random;

public class SystemExample {
	public static void main(String[] args) {
		//1. �ð����� 
		long sTime = System.currentTimeMillis();
		long sNano = System.nanoTime();
		
		createDummyObjects(100_000);
		
		long timeMills = System.currentTimeMillis() - sTime;
		long timeNano = System.nanoTime() - sNano;
		System.out.println("�ð�����: " + timeMills + "ms ");
		System.out.println("�ð�����: " + timeNano + "ns ");
		
		//2. ȯ�溯�� (environment variables)
		System.out.println(System.getenv());
		System.out.println("PATH: " + System.getenv("PATH"));
	}
	
	static void createDummyObjects(int number) {
		Random r = new Random();
		for (int i=0; i < number; ++i) {
			new String("Dummy" + r.nextInt());
		}
	}
}
