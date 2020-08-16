package com.yudong80.java.ch09;

import java.io.FileReader;
import java.io.IOException;

public class BeforeBufferedReader {
	private static final int EOF = -1;
	private static final String TARGET_TEXT_FILE = "sample-2mb-text-file.txt";
	
	public static void main(String[] args) throws IOException {
		//1. FileReader ���� 
		FileReader fr = new FileReader(TARGET_TEXT_FILE);
		
		//2. �ѱ��ھ� �б� 
		long sTime = System.currentTimeMillis(); 
		while (EOF != fr.read()) {
			//do nothing 
		}
		
		long readTime = System.currentTimeMillis() - sTime;
		System.out.println(TARGET_TEXT_FILE + "�� �д� �ð�: " + readTime + "ms");
				
		fr.close(); //����� �ݵ�� �ݾ� �ݴϴ� 		
	}
}
