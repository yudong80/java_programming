package com.yudong80.java.ch07;

public class StringBuilderExample {
	public static void main(String[] args) {
		//0. �⺻����
		String title = "Java API doc";
		String pkg = "java.lang";
		String cls = "StringBuilder";
		String desc = "StringBuilder�� ���ڿ��� ��������";
		String seeAlso = "��) StringBuffer Ŭ����";
		
		//1. String�� ����� ���ڿ� ���� 
		String apiDoc = title + "\n" +
				"��Ű��: " + pkg + "\n" +
				"Ŭ����: " + cls + "\n" +
				"����: " + desc + "\n" + 
				"���: " + seeAlso;
		System.out.println(apiDoc);
		System.out.println("-------------------------");
				
		//2. StringBuilder�� ����� ���ڿ� ����
		StringBuilder sb = new StringBuilder();
		sb.append(title).append('\n');
		sb.append("��Ű��: ").append(pkg).append('\n');
		sb.append("Ŭ����: ").append(cls).append('\n');
		sb.append("����: ").append(desc).append('\n');
		sb.append("���: ").append(seeAlso).append('\n');
		
		System.out.println(sb.toString());
	}
}
