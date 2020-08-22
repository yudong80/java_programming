package com.yudong80.java.ch09.exceptions;

import java.util.HashMap;
import java.util.Map;

public class MakeNullPointerExceptionV2 {
	static Map<String, String> createRegionCodeMap() {
		Map<String, String> map = new HashMap<>();
		map.put("����", "02");
		map.put("��⵵", "031");
		map.put("������", "033");
		return map;
	}
	
	public static void main(String[] args) {
		//1. ���� ��ȣ �˻��ϱ�
		Map<String, String> regionCodes = createRegionCodeMap();
		String nullObj = regionCodes.get("���"); 
		
		//2. NullPointerException �߻�
		if(nullObj.equals("031")) {
			System.out.println("����� ������� �ʽ��ϴ�!!");
		}
	}
}
