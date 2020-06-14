package com.yudong80.java.ch05;

public class PersonExampleV2 {
	//��� ����
	String firstName = "�ڹ�"; 
	String lastName = "��";
	int age = 25;
	int height = 182;

	//������ 
	PersonExampleV2(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	PersonExampleV2(String firstName, String lastName, int age) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
	}

	PersonExampleV2(String firstName, String lastName, int age, int height) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.height = height;
	}
	
	//�޼���
	void goToOffice(String destination) { 
		System.out.println(getKoreanName() + "���� " + destination + "���� ����մϴ�.");
	}

	String getKoreanName() {
		return lastName + " " + firstName;
	}
		
	public static void main(String[] args) {
//		PersonExampleV2 p = new PersonExampleV2(); -- ���� �߻� 
		PersonExampleV2 p = new PersonExampleV2("Java", "Kim");
		p.goToOffice("����");
	}
}