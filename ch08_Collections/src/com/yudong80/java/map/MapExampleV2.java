package com.yudong80.java.map;

import java.util.HashMap;
import java.util.Map;

public class MapExampleV2 {
	public static void main(String[] args) {
		//0. �ڷ� �غ� 
		Map<String, String> capitalMap = MapBasic.prepareCapitalMap();
				
		//1. putAll() �޼��� 
		Map<String, String> others = new HashMap<>();
		others.put("������", "�ĸ�");
		others.put("������", "���帮��");
		others.put("���ѹα�", "����(Seoul)"); //Ű�� ��ġ�� ���� �Էµ� 
		capitalMap.putAll(others);
		
		System.out.println("putAll() �� ��: " + capitalMap);

		//2. putIfAbsent() �޼���
		capitalMap.putIfAbsent("��Ż����", "�θ�");

		System.out.println("putIfAbsent() �� ��: " + capitalMap);
	}
}