package com.yudong80.java.ch03;

public class SwitchBasic {
	public static void main(String[] args) {
		String[] planets = {
				"����", "�ݼ�", "����", "ȭ��", "��", "�伺",
		};
		
		for (String planet : planets) {
			switch (planet) {
			case "����": 
				System.out.println(planet + "�� ���� ���� ����!");
				break;
			default: 
				System.out.println(planet + "���� ���� ���� ����!");
			}	
		}
	}
}
