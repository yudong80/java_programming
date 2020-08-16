package com.yudong80.java.ch09;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class PoemReaderV1 {
	private static final String POEM_FILE = "poem.txt";

	public static void main(String[] args) throws IOException {
		//1. FileReader ���� 
		BufferedReader br = new BufferedReader(new FileReader(POEM_FILE));
		
		//2. ����� �۰� ��� 
		String title = br.readLine();
		String author = br.readLine();
		System.out.println("����: " + title);
		System.out.println("�۰�: " + author);
		
		//3. ���� ��� 
		String line;		
		while ((line = br.readLine()) != null) {
			System.out.println(line);
		}
						
		br.close(); //����� �ݵ�� �ݾ� �ݴϴ� 		
	}
}
