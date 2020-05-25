package com.yudong80.java.ch03;

public class SwitchExtended {
	public static void main(String[] args) {
		String[] planets = {
				"����", "�ݼ�", "����", "ȭ��", "��", "�伺",
		};
		
		for (String planet : planets) {
			switch (planet) {
			case "����":	//fall-through
			case "�ݼ�": //fall-through
			case "ȭ��": //fall-through
			case "��": //fall-through
			case "�伺":
				System.out.println(planet + "���� ���� ���� ����!");
				break;
			case "����": 
				System.out.println(planet + "�� ���� ���� ����!");
			}	
		}
	}
}
