package com.yudong80.java.ch08;

import java.util.ArrayList;
import java.util.List;

public class ListBasic {
	public static void main(String[] args) {
		//1. List ���� (ArrayList Ŭ����) 
		List<Integer> intList = new ArrayList<>();
		List<Double> doubleList = new ArrayList<>();
		List<String> stringList = new ArrayList<>();
		
		//2. ������ �Է� 
		intList.add(1);
		intList.add(2);
		intList.add(3);
		
		//intList.add("���ڿ�"); --> ������ ���� �߻� 
		
		doubleList.add(3.14);
		doubleList.add(100.57);
		doubleList.add(-3000.1);
		
		stringList.add("����");
		stringList.add("��");
		stringList.add("����");
		
		//3. ���� ������ ��ȸ  
		System.out.println("intList[0] = " + intList.get(0));
		System.out.println("intList[1] = " + intList.get(1));
		System.out.println("intList[2] = " + intList.get(2));
		
		//4. �ݺ����� ���� ������ ��ȸ 
		for (int i=0; i< doubleList.size(); ++i) {
			System.out.println("doubleList[" + i + "] = " + doubleList.get(i));
		}
		
		for (String planet : stringList) {
			System.out.println("�༺: " + planet);
		}
		
		//5. List�� ���� ��� 
		System.out.println("intList = " + intList);
		System.out.println("doubleList = " + doubleList);
		System.out.println("stringList = " + stringList);
	}
}
