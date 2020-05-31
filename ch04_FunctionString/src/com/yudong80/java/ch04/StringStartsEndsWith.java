package com.yudong80.java.ch04;

public class StringStartsEndsWith {
	public static void main(String[] args) {
		//1. startsWith() 
		String[] poem = {
			"Two roads diverged in a yellow wood", 
			"And sorry I could not travel both",
			"And be one traveller, long I stood",
		};
		
		for (int i=0; i< poem.length; ++i) {
			String line = poem[i];
			boolean startsWithAnd = line.startsWith("And"); 
			System.out.println((i+1) + " ��° ���� And�� �����ϳ���? " + startsWithAnd);
		}
		
		//2. endsWith()
		for (int i=0; i< poem.length; ++i) {
			String line = poem[i];
			boolean endsWithOod = line.endsWith("ood"); 
			System.out.println((i+1) + " ��° ���� ood�� ��������? " + endsWithOod);
		}
	}
}
