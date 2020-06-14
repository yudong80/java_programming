package com.yudong80.java.ch05;

public class PersonExampleV3 {
	//��� ����
	private String firstName = "�ڹ�"; 
	private String lastName = "��";
	private int age = 25;
	private int height = 182;

	//������ 
	public PersonExampleV3(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	public PersonExampleV3(String firstName, String lastName, int age) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
	}

	public PersonExampleV3(String firstName, String lastName, int age, int height) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.height = height;
	}
	
	//�޼���
	public void goToOffice(String destination) { 
		System.out.println(getKoreanName() + "���� " + destination + "���� ����մϴ�.");
	}

	private String getKoreanName() {
		return lastName + " " + firstName;
	}
		
	public static void main(String[] args) {
//		PersonExampleV2 p = new PersonExampleV2(); -- ���� �߻� 
		PersonExampleV3 p = new PersonExampleV3("Java", "Kim");
		p.goToOffice("����");
	}
}