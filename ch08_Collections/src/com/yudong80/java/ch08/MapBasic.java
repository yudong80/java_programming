package com.yudong80.java.ch08;

import java.util.HashMap;
import java.util.Map;

public class MapBasic {
	public static void main(String[] args) {
		//0. �ڷ� �غ� 
		Map<String, String> capitalMap = prepareCapitalMap();
		
		//1. put() �޼��� 
		capitalMap.put("ȣ��", "ĵ����");
		System.out.println("���� �� = " + capitalMap + "\n");
		
		//2. get() �޼���
		String capitalKR = capitalMap.get("���ѹα�");
		String capitalUS = capitalMap.get("�̱�");
		String capitalCN = capitalMap.get("ĳ����");
		System.out.println("���ѹα��� ����? " + capitalKR);
		System.out.println("�̱��� ����? " + capitalUS);
		System.out.println("ĳ������ ����? " + capitalCN);
		
		//3. getOrDefault() �޼��� 
		capitalCN = capitalMap.getOrDefault("ĳ����", "N/A");
		System.out.println("ĳ������ ����? " + capitalCN);
		
		//4. �� ���� ��ȸ 
		System.out.println("\ncapitalMap ��ȸ: ");
		for (String country : capitalMap.keySet()) {
			String capital = capitalMap.get(country);
			System.out.println(country + "�� ������? " + capital);
		}
	}
	
	static Map<String, String> prepareCapitalMap() {
		Map<String, String> map = new HashMap<>();
		map.put("���ѹα�", "����");
		map.put("�̱�", "������DC");
		map.put("������", "����Ȧ��");
		map.put("����", "����");
		return map;
	}
}

