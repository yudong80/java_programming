package com.yudong80.java.ch05;

public class StudentExample {
	//�ɹ� ������ 
	String name = "����";
	String major = "��ǻ�Ͱ���";
	String minor = "�濵��";
	int[] grades = {80, 70, 100, 90};
	
	//�޼���
	void printInfo() {
		System.out.println("�л� �̸�: " + name);
		System.out.println("����: " + major);
		System.out.println("������: " + minor);
		System.out.println("����:");
		for (int grade : grades) {
			System.out.println(grade + "��");
		}
	}
	
	public static void main(String[] args) {
		new StudentExample().printInfo();
	}
}
