package com.yudong80.java.ch08;


import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class CollectionsExample {
	public static void main(String[] args) {
		//0. ������ �غ� 
		List<String> aList = ListExampleV1.preparePlanetList();
		Map<String, String> aMap = MapBasic.prepareCapitalMap();
		Set<String> aSet = SetBasic.prepareAlphabets();
		
		//1. unmodifiableList/Map/Set() �޼��� 
		aList = Collections.unmodifiableList(aList);
		aMap = Collections.unmodifiableMap(aMap);
		aSet = Collections.unmodifiableSet(aSet);
		
		//aList.add("����"); //��Ÿ�� ���� �߻� 
		//aMap.put("Ű", "����"); //��Ÿ�� ���� �߻�
		//aSet.add("����"); //��Ÿ�� ���� �߻�
		
		//2. swap() �޼��� 
		List<String> modifiableList = prepareSolarSystem();
		System.out.println("swap ��: " + modifiableList);
		
		Collections.swap(modifiableList, 0, 1);
		System.out.println("swap ��: " + modifiableList);
		
		//3. shuffle() �޼��� 
		System.out.println("shuffle ��: " + modifiableList);
		
		Collections.shuffle(modifiableList);
		System.out.println("shuffle ��: " + modifiableList);	
	}
	
	static List<String> prepareSolarSystem() {
		List<String> base = ListExampleV1.preparePlanetList();
		base.add("��");
		base.add("�伺");
		base.add("õ�ռ�");
		return base;
	}
}
