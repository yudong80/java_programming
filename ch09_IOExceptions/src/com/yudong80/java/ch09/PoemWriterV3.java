package com.yudong80.java.ch09;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class PoemWriterV3 {
	private static final String DEFAULT_INPUT_FILE = "poem.txt";
	private static final String DEFAULT_OUTPUT_FILE = "poem_copy.txt";
	private static final String EMPTY_STRING = "";
	
	private String outputFile;
	
	public PoemWriterV3(String outFile) { 
		this.outputFile= outFile;
	}
	
	public String readInputPoem(String inputFile) {
		StringBuilder sb = new StringBuilder();
		String line;
		
		try (BufferedReader br = new BufferedReader(new FileReader(inputFile))){
			while((line = br.readLine()) != null) {
				sb.append(line).append('\n');
			}
		} catch (FileNotFoundException e) {
			System.out.println("FileNotFoundException �߻�: " + e.getMessage());
			return EMPTY_STRING;
		} catch (IOException ioe) {
			System.out.println("IOException �߻�: " + ioe.getMessage());			
			return EMPTY_STRING;
		}  		
				
		return sb.toString();
	}
	
	public void writeOutput(String content) {
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(outputFile))){
			bw.write(content);
			bw.flush();    
		} catch (IOException ioe) {
			System.out.println("IOException �߻�: " + ioe.getMessage());
		} 
	}
		
	public static void main(String[] args) {
		//1. PoemWriter ��ü ���� 
		PoemWriterV3 poemWriter = new PoemWriterV3(DEFAULT_OUTPUT_FILE);
		
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
