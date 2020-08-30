package com.yudong80.java.ch09;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class PoemWriterV1 {
	private static final String DEFAULT_INPUT_FILE = "poem.txt";
	private static final String DEFAULT_OUTPUT_FILE = "poem_copy.txt";

	private String outputFile;
	
	public PoemWriterV1(String outFile) { 
		this.outputFile= outFile;
	}
	
	public String readInputPoem(String inputFile) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader(inputFile));
		StringBuilder sb = new StringBuilder();
		String line;
		
		while((line = br.readLine()) != null) {
			sb.append(line).append('\n');
		}
		
		//��� �Ŀ��� �ݵ�� �ݾ��ݴϴ�. 
		br.close(); 
		
		return sb.toString();
	}
	
	public void writeOutput(String content) throws IOException {
		BufferedWriter bw = new BufferedWriter(new FileWriter(outputFile));
		
		bw.write(content);
		bw.flush(); //������ ������ ���ϴ�.  
		bw.close(); //��� �Ŀ��� �ݵ�� �ݾ��ݴϴ�.
	}
		
	public static void main(String[] args) throws IOException {
		//1. PoemWriter ��ü ���� 
		PoemWriterV1 poemWriter = new PoemWriterV1(DEFAULT_OUTPUT_FILE);
		
		//2. poem.txt ���� �б� 
		String original = poemWriter.readInputPoem(DEFAULT_INPUT_FILE);
		System.out.println("== ���� ���� ==");
		System.out.println(original);
		
		//3. poem_copy.txt ���� ����
		poemWriter.writeOutput(original);
		
		//4. ���� Ȯ�� 
		String copied = poemWriter.readInputPoem(DEFAULT_OUTPUT_FILE);
		System.out.println("== �纻 ���� ==");
		System.out.println(copied);
	}
}
