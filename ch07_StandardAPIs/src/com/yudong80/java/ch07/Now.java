package com.yudong80.java.ch07;

import java.util.Calendar;
import java.util.Date;

public class Now {
	public static void main(String[] args) {
		//1. Date Ŭ������ ���� �ð� ��� 
		Date date = new Date(); 
		System.out.println("���� �ð�:" + date.toString());
		
		//2. Calendar Ŭ������ ���� �ð� ��� 
		Calendar cal = Calendar.getInstance();
		System.out.println("���� �ð�:" + cal.getTime());
	}
}
