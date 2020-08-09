package com.yudong80.java.map;

import java.util.Map;
import java.util.Set;

public class MapExampleV1 {
	private static final String KEY_FR = "������";
	private static final String KEY_EN = "����";
	
	public static void main(String[] args) {
		//0. �ڷ� �غ� 
		Map<String, String> capitalMap = MapBasic.prepareCapitalMap();
		
		//1. remove() �޼��� 
		System.out.println("���� ��: " + capitalMap);
		capitalMap.remove(KEY_FR); //�������� �ʴ� Ű�� �����ص� ������ �߻����� �ʽ��ϴ�
		capitalMap.remove(KEY_EN);
		System.out.println("���� ������: " + capitalMap);
		
		//2. keySet() �޼��� 
		Set<String> keySet = capitalMap.keySet();
		for (String key : keySet) {
			System.out.println("Ű: " + key);
		}
		
		//3. containsKey() �޼��� 
		boolean hasFranceKey = capitalMap.containsKey(KEY_FR);
		boolean hasEnglandKey = capitalMap.containsKey(KEY_EN);
		System.out.println(KEY_FR + " Ű ����? " + hasFranceKey);
		System.out.println(KEY_EN + " Ű ����? " + hasEnglandKey);
		
		//4. clear(), isEmpty() �޼��� 
		capitalMap.clear();
		System.out.println("clear() �� �� = " + capitalMap);
		System.out.println("isEmpty()? " + capitalMap.isEmpty());
	}
}
