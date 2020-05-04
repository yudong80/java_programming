package com.yudong80.java;

public class VariableBasic {
	public static void main(String[] args) { 
		//1. 변수 선언 
		int studentNum;
		String name;
		double gradeJava;
		double gradeC;
		double avg;
		
		//2. 변수 정의(초기화) 
		studentNum = 500;
		name = "Dong Hwan Yu";
		gradeJava = 4.0;
		gradeC = 3.8;
		avg = 0;
		
		//3. 계산 (재정의)
		avg = (gradeJava + gradeC) / 2;	
		name = "Yu, DongHwan";
		studentNum = 600;
	}
}
