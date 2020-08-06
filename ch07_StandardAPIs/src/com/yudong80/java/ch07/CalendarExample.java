package com.yudong80.java.ch07;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class CalendarExample {
	public static void main(String[] args) {
		//1. ��¥ ��� ���ϱ�
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy�� MM�� dd��");
		
		//2. ���� ��¥ 
		Calendar cal = Calendar.getInstance();
		String today = dateFormat.format(cal.getTime());
		System.out.println("������ " + today);
		
		//3. ���� ��¥ 
		cal.add(Calendar.DATE, -1);
		String yesterday = dateFormat.format(cal.getTime());
		System.out.println("������ " + yesterday);
		
		//4. 5���� �� 
		Calendar now = Calendar.getInstance();
		now.add(Calendar.MONTH, +5);
		String afterFiveMonths = dateFormat.format(now.getTime());
		System.out.println("5������ ��¥�� " + afterFiveMonths);
	}
}
