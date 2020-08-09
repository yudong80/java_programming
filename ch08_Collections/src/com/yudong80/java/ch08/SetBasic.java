package com.yudong80.java.ch08;

import java.util.HashSet;
import java.util.Set;

public class SetBasic {
	public static void main(String[] args) {
		//0. �ڷ� �غ� 
		Set<String> alphabets = prepareAlphabets();
		
		//1. add() �޼��� 
		alphabets.add("B"); //�ߺ� ��Ҵ� �߰����� ���� 
		System.out.println("����: " + alphabets);
		
		//2. remove() �޼��� 
		alphabets.remove("B");
		System.out.println("B ������ ����: " + alphabets);
		
		//3. size() �޼��� 
		System.out.println("���� ũ��: " + alphabets.size());
		
		//4. ���� ��ȸ 
		for (String a : alphabets) {
			System.out.println("���ĺ�: " + a);
		}
	}
	
	static Set<String> prepareAlphabets() {
		Set<String> set = new HashSet<>();
		set.add("A");
		set.add("B");
		set.add("C");
		set.add("D");
		return set;
	}
}
