package com.yudong80.java.ch08;

import java.util.List;

public class ListExampleV2 {
	private static final String EARTH = "����";
	private static final String SATURN = "�伺";

	public static void main(String[] args) {
		//0. ������ �غ� 
		List<String> planets = ListExampleV1.preparePlanetList();	
		
		//1. contains() �޼��� 
		boolean hasEarth = planets.contains(EARTH);
		boolean hasSaturn = planets.contains(SATURN);
		System.out.println("������ �����ϴ°�? " + hasEarth);
		System.out.println("�伺�� �����ϴ°�? " + hasSaturn);
		
		//2. indexOf() �޼��� 
		int earthIndex = planets.indexOf(EARTH);
		int saturnIndex = planets.indexOf(SATURN);
		System.out.println("������ index? " + earthIndex);
		System.out.println("�伺�� index? " + saturnIndex);
		
		//3. lastIndexOf() �޼��� 
		planets.add("����");
		
		int lastEarthIndex = planets.lastIndexOf(EARTH);
		System.out.println("������ ������ index? " + lastEarthIndex);
		
		//4. remove() �޼��� 
		planets.remove(lastEarthIndex);
		
		//5. set() �޼��� 
		planets.set(earthIndex, "����(Earth)");
		System.out.println("�༺��: " + planets);
		
		//6. toArray() �޼��� 
		String[] planetArr = planets.toArray(new String[0]);
		for (String planet : planetArr) {
			System.out.println("�༺: " + planet);
		}
	}
}
