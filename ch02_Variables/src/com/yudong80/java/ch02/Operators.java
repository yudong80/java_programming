package com.yudong80.java.ch02;

public class Operators {
	public static void ���������() {    
		int added = 100 + 200;
		int subtracted = 500 - 300;
		int multiplied = 10 * 20;
		double divided = 100 / 3;
		
		System.out.println("���� ���: 100 + 200 = " + added);
		System.out.println("���� ���: 500 - 300 = " + subtracted);
		System.out.println("���� ���: 10 * 20 = " + multiplied);
		System.out.println("������ ���: 100 / 3 = " + divided);

		int �� = 100 / 3;
		int ������ = 100 % 3;
		System.out.println("��: 100 / 3 = " + ��);
		System.out.println("������: 100 / 3 = " + ������);
		
		++added;
		--subtracted;
		System.out.println("����: ++added = " + added);
		System.out.println("����: --subtracted = " + subtracted);		
	}
	
	public static void ���Կ�����() { 
		int studentNo = 100;
		String studentName = "Dong Hwan Yu";
		double grade = 4.0;
		
		System.out.println("�й�: " + studentNo);
		System.out.println("�̸�: " + studentName);
		System.out.println("����: " + grade);
		
		double v = 100;
		v+=3;	System.out.println("v += 3: " + v);
		v-=3;	System.out.println("v -= 3: " + v);
		v*=3;	System.out.println("v *= 3: " + v);
		v/=3;	System.out.println("v /= 3: " + v);
		v%=3;	System.out.println("v %= 3: " + v);		
	}
	
	public static void �񱳿�����() {
		int a = 100;
		int b = 100;
		int c = 200;
		int d = 95;
		
		System.out.println("a �� b�� ����? " + (a == b));
		System.out.println("a �� c�� �ٸ���? " + (a != c));
		System.out.println("c �� a���� ũ��? " + (c > a));
		System.out.println("a �� c���� �۴�? " + (a < c));
		System.out.println("a �� d �̻��̴�? " + (a >= d));
		System.out.println("a �� c �����̴�? " + (a <= c));		
	}
	
	public static void ��������() {
		int a = 4;
		boolean inTheMiddle = 3 < a && a < 5;
		boolean isNaturalNumber = a > 0 || a == 0; 
		boolean isPositive = !( a < 0);
		
		System.out.println("a �� 3���� ũ�� 4���� �۴�? " + inTheMiddle);
		System.out.println("a �� �ڿ����̴�? " + isNaturalNumber);
		System.out.println("a �� ����̴�? " + isPositive);
	}
	
	public static void ��Ʈ������() {
		int a = 0x0A;  		//1100
		int mask1 = 0x01; 	//0001
		int mask2 = 0x02;	//0010
		int mask3 = 0x04;	//0100
		int mask4 = 0x08;	//1000
		
		System.out.println("16���� a�� ù��° �ڸ�����? " + (a & mask1));
	}
	
	public static void main(String[] args) { 
//		���������();
//		���Կ�����();
//		�񱳿�����();
		��������();
//		��Ʈ������();
	}
}
