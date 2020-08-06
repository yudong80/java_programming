package com.yudong80.java.ch07;

import java.util.StringTokenizer;

public class CSVParsing {
	public static void main(String[] args) {
		//1. ���� ������ (�̸�, ����, ����, ���� ��)
		String[] grades = {
			"�谭��, 80, 90, 100",
			"������, 70, 100, 88",
			"����ȣ, 88, 33, 77"
		};
		
		//2. ���� ������ ���
		final String delim = ",";
		
		for (String line: grades) {
			StringTokenizer st = new StringTokenizer(line, delim);
			
			//�����Ͱ� ��ȿ���� ���� ��� ���� ó�� 
			if (!st.hasMoreTokens()) continue;
			
			//������ ��� 
			String name = st.nextToken();
			String korean = st.nextToken();
			String english = st.nextToken();
			String math = st.nextToken();
			
			System.out.println(getGradeString(name, korean, english, math));
		}
	}
	
	static String getGradeString(String name, String korean, String english, String math) {
		StringBuilder sb = new StringBuilder();
		sb.append("�̸�: ").append(name).append('\n');
		sb.append("������ ����: {").append(korean).append(", ");
		sb.append(english).append(", ");
		sb.append(math).append("} \n");
		
		return sb.toString();
	}
}
