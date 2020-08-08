package com.yudong80.java.ch08.list;

import java.util.ArrayList;
import java.util.List;

public class ListExampleV1 {
	public static void main(String[] args) {
		//0. ������ �غ� 
		List<String> planets = preparePlanetList();
		
		//1. add(index, E) �޼��� 
		planets.add(3, "ȭ��");
		System.out.println("ȭ�� �߰� ��:: " + planets);
		
		//2. addAll() �޼��� 
		List<String> otherPlanets = new ArrayList<>();
		otherPlanets.add("��");
		otherPlanets.add("�伺");
		otherPlanets.add("õ�ռ�");
		planets.addAll(otherPlanets);
		System.out.println("�༺ �߰� ��: " + planets);
			
		//3. clear() �޼��� 
		planets.clear();
		System.out.println("clear() ��: " + planets);
		
		//4. isEmpty() �޼���
		boolean isEmpty = planets.isEmpty();
		int size = planets.size();
		System.out.println("planets ����Ʈ ����ִ°�? " + isEmpty + " >> size? " + size);

	}
	
	static List<String> preparePlanetList() {
		List<String> p = new ArrayList<>();
		p.add("����");
		p.add("�ݼ�");
		p.add("����"); 
		return p;
	}
}
