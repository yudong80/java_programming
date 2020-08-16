package com.yudong80.java.ch09;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderExampleV1 {
	private static final int EOF = -1;
	
	public static void main(String[] args) throws IOException {
		//1. FileReader ���� 
		FileReader fr = new FileReader("hello.txt");
		
		//2. �ѱ��ھ� �б� 
		int readInt; 
		while (EOF != (readInt = fr.read())) {
			char ch = (char) readInt;
			System.out.println("�Է� ������: " + ch);	
		}
		
		fr.close(); //����� �ݵ�� �ݾ� �ݴϴ� 		
	}
}
