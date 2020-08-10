package com.yudong80.java.ch08;

import java.util.Arrays;
import java.util.List;

public class ArraysExample {
	public static void main(String[] args) {
		//1. asList() �޼���
		List<String> planets = Arrays.asList(
				"����", "��", "�伺");
		
		List<String> capitals = Arrays.asList(new String[] { 
				"����", "������DC", "����Ȧ��"
		});
		
		String[] alphas = {"A", "B", "C", "D", "E"} ;
		List<String> alphabets = Arrays.asList(alphas);
		
		System.out.println("�༺ ����Ʈ: " + planets);
		System.out.println("���� ����Ʈ: " + capitals);
		System.out.println("���ĺ�: " + alphabets);
		
		//2. copyOf() �޼��� 
		String[] abc = Arrays.copyOf(alphas, 3);
		String[] abcde = Arrays.copyOf(alphas, 5);
		String[] abcde10 = Arrays.copyOf(alphas, 10);			
		
		//3. toString() �޼���
		System.out.println("abc �迭: " + Arrays.toString(abc));
		System.out.println("abcde �迭: " + Arrays.toString(abcde));
		System.out.println("abcde10 �迭: " + Arrays.toString(abcde10));
		
		//4. equals() �޼��� 
		boolean chk1 = Arrays.equals(alphas, abc);
		boolean chk2 = Arrays.equals(alphas, abcde);
		boolean chk3 = Arrays.equals(alphas, abcde10);
		
		System.out.println("alphas �迭 == abc �迭? " + chk1);
		System.out.println("alphas �迭 == abcde �迭? " + chk2);
		System.out.println("alphas �迭 == abcde10 �迭? " + chk3);
		
		//5. fill() �޼��� 
		int[] zeros = new int[5]; //�ʱⰪ�� 0
		System.out.println("zeros �迭: " + Arrays.toString(zeros));
		
		Arrays.fill(zeros, 1);
		System.out.println("fill(1) �迭: " + Arrays.toString(zeros));
	}
}
