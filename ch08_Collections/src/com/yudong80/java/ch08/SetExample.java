package com.yudong80.java.ch08;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetExample {
	public static void main(String[] args) {
		//0. �ڷ� �غ� 
		Set<String> alphabets = SetBasic.prepareAlphabets();
		
		//1. addAll() �޼��� 
		Set<String> others = new HashSet<>();
		others.add("D");
		others.add("E");
		alphabets.addAll(others);
		
		//2. contains() �޼��� 
		System.out.println("���տ� A ����? " + alphabets.contains("A"));
		System.out.println("���տ� K ����? " + alphabets.contains("K"));
		
		//3. iterator() �޼��� 
		Iterator<String> iterator = alphabets.iterator();
		while (iterator.hasNext()) {
			System.out.println("���ĺ�: " + iterator.next());
		}
		
		//4. toArray() �޼��� 
		String[] alphas = alphabets.toArray(new String[0]);
		System.out.println("���ĺ�[0]: " + alphas[0]);
		
		//5. clear() , isEmpty() �޼��� 
		alphabets.clear();
		System.out.println("clear() �� �� ����? " + alphabets.isEmpty());
	}
}
