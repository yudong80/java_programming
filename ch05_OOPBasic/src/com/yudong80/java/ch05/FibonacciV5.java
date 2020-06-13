package com.yudong80.java.ch05;

public class FibonacciV5 {
	int[] numbers; //�ɹ� ���� 
	
	void generateNumbers(int cnt) { //�޼��� 
		int a = 1;
		int b = 1;
		
		numbers = new int[cnt];
		for (int i=1; i <= numbers.length; ++i) {
			numbers[i-1] = a + b;
			a = b;
			b = numbers[i-1];
		}		
	}
	
	void printNumbers() { //�޼���
		System.out.println("���: ");
		for (int number : numbers) {
			System.out.println(number);
		}
	}
	
	public static void main(String[] args) {
		System.out.println("�ĺ���ġ ���� �����");	
		FibonacciV5 f = new FibonacciV5();
		f.generateNumbers(10);
		f.printNumbers();
	}
}
