package com.yudong80.java.ch07;

import java.util.StringTokenizer;

public class StringTokenizerExample {
	public static void main(String[] args) {
		//1. ���� ������ (�̸�, ����, ����, ���� ��)
		String grades = "�谭�� 80 90 100";
		
		//2. ���� ������ ��� 
		StringTokenizer st = new StringTokenizer(grades);
		while(st.hasMoreTokens()) {
			String token = st.nextToken();
			System.out.println(token);
		}	
	}
}
