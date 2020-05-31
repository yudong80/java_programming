package com.yudong80.java.ch04;

import java.util.Scanner;

public class FibonacciV2 {
	static int getUserInput() {
		Scanner s = new Scanner(System.in);	
		System.out.println("수열 개수를 입력하세요");
		int num = s.nextInt();
		s.close(); //사용하면 최대한 빨리 닫아 줍니다 
		return num;
	}
	
	public static void main(String[] args) {
		System.out.println("파보나치 수열 만들기");
		
		int num = getUserInput();
		
		int a = 1;
		int b = 1;
		
		int[] fibonacci = new int[num];
		for (int i=1; i <= num; ++i) {
			fibonacci[i-1] = a + b;
			a = b;
			b = fibonacci[i-1];
		}
		
		System.out.println("결과: ");
		for (int i=0; i < num; ++i) {
			System.out.println(fibonacci[i]);
		}
	}
}
