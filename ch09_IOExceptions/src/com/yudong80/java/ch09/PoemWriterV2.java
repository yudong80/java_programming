package com.yudong80.java.ch09;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class PoemWriterV2 {
	private static final String DEFAULT_INPUT_FILE = "poem.txt";
	private static final String DEFAULT_OUTPUT_FILE = "poem_copy.txt";
	private static final String EMPTY_STRING = "";
	
	private String outputFile;
	
	public PoemWriterV2(String outFile) { 
		this.outputFile= outFile;
	}
	
	public String readInputPoem(String inputFile) {
		BufferedReader br; 
		
		try {
			br = new BufferedReader(new FileReader(inputFile));
		} catch (FileNotFoundException e) {
			System.out.println("FileNotFoundException �߻�: " + e.getMessage());
			return EMPTY_STRING;
		}
		
		
		StringBuilder sb = new StringBuilder();
		String line;
		
		try {
			while((line = br.readLine()) != null) {
				sb.append(line).append('\n');
			}
		} catch (IOException ioe) {
			System.out.println("IOException �߻�: " + ioe.getMessage());
			
			//IOException �߻��ÿ��� �� ���ڿ��� ��ȯ�ϱ�� �� 
			return EMPTY_STRING; 
		} finally {
			try {
				if (br != null) {
					br.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			} 
		}	 		
				
		return sb.toString();
	}
	
	public void writeOutput(String content) {
		BufferedWriter bw = null;
		try {
			bw = new BufferedWriter(new FileWriter(outputFile));
			bw.write(content);
			bw.flush();    
		} catch (IOException ioe) {
			System.out.println("IOException �߻�: " + ioe.getMessage());
		} finally {
			try {
				if (bw != null) {
					bw.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			} 
		}
	}
		
	public static void main(String[] args) {
		//1. PoemWriter ��ü ���� 
		PoemWriterV2 poemWriter = new PoemWriterV2(DEFAULT_OUTPUT_FILE);
		
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
