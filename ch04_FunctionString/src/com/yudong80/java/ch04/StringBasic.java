package com.yudong80.java.ch04;

public class StringBasic {
	public static void main(String[] args) {
		//1. String�� ���ڿ� ������ �ǹ��մϴ�. 
		String station = "��ȭ��";
		System.out.println(station + "���� �����Ͽ����ϴ�.");
		
		//2. String�� ���̸� ������ �ֽ��ϴ�. 
		System.out.println(station + " ������ ���̴� " + station.length() + " �Դϴ�.");
		
		//3. String�� char�� �̷���� �ֽ��ϴ�. 
		System.out.println("�̹����� ");
		for (int i=0; i < station.length(); ++i) {
			char c = station.charAt(i);
			System.out.println(c);
		}
		System.out.println("�Դϴ�.");
		
		//4. String�� ���Ҵ��� �� �ֽ��ϴ�.
		station = "������";
		System.out.println("���� ���� " + station + "���г���.");		
	}
}
