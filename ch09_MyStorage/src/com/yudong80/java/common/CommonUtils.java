package com.yudong80.java.common;

import java.util.Scanner;

public class CommonUtils {
	public static void print(String str) {
		System.out.println(str);
	}
	
	public static int readInt(String msg) {
		System.out.print(msg + " ");
		Scanner s = new Scanner(System.in);
		int input = s.nextInt();
		s.close();
		return input;
	}
}
