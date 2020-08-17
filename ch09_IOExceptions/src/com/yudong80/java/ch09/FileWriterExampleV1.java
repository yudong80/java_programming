package com.yudong80.java.ch09;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExampleV1 {
	private static final String TARGET_TEXT_FILE = "diary.txt";
	
	public static void main(String[] args) throws IOException {
		//1. FileWriter ���� 
		FileWriter fw = new FileWriter(TARGET_TEXT_FILE);
		
		//2. write() �޼��� 
		String title = "������ ����\n";
		char[] walk = {'1', '.', ' ', '��', 'å', '��', '��', '\n' };
		char[] reading = {'2', '.', ' ', '��', '��', '��', '��', '\n' };
		
		fw.write(title);
		fw.write(walk);
		fw.write(reading, 0, 5);	
		
		//3. flush() �޼���
		fw.flush(); //��κ��� ���� ���ʿ��� 
		
		//4. close() �޼���
		fw.close(); //����� �ݵ�� �ݾ� �ݴϴ� 			
	}
}
