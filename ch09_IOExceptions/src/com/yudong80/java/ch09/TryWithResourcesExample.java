package com.yudong80.java.ch09;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TryWithResourcesExample {
	private static final String TARGET_TEXT_FILE = "sample-text-file.txt";

	public static void main(String[] args) {
		try (BufferedReader br = new BufferedReader(new FileReader(TARGET_TEXT_FILE))) {
			String line; 
			while ((line = br.readLine()) != null) {
				System.out.println("����: " + line);
			}
		} catch (FileNotFoundException e) {
			System.out.println("FileNotFoundException �߻�: " + e.getMessage());
		} catch (IOException ioe) {
			System.out.println("IOException �߻�: " + ioe.getMessage());
		}
	}
}