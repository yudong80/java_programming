package com.yudong80.java.ch04;

public class StringReplaceIsEmpty {
	public static void main(String[] args) {
		//1. replace() 
		String javaWiki = "Java is a general-purpose programming language. Java";
		String python = javaWiki.replace("Java", "Python");
		
		System.out.println("���� ����: " + javaWiki);
		System.out.println("ġȯ�� ����: " + python);
		
		//2. isEmpty() 
		String msg = ""; //default
		System.out.println("�� ���ڿ��ΰ���? " + msg.isEmpty());
		
		msg = "���ο� �޽����� �����߽��ϴ�.";
		System.out.println("�� ���ڿ��ΰ���? " + msg.isEmpty());
	}
}
