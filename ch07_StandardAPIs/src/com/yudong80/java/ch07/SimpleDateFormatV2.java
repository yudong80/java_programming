package com.yudong80.java.ch07;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class SimpleDateFormatV2 {
	public static void main(String[] args) {
		//1. Date Ŭ������ ���� �ð� ��� 
		Date now = new Date();
		
		//2. �پ��� ���� ��� ���� 
		SimpleDateFormat timeFormat = new SimpleDateFormat("h:mm a");
		SimpleDateFormat dateAndDay = new SimpleDateFormat("yyyy�� MM�� dd�� EEEE");
		SimpleDateFormat time24based = new SimpleDateFormat("HH:mm:ss");
		SimpleDateFormat timeAMPM = new SimpleDateFormat("h:mm a", Locale.US);
		
		System.out.println("���� �ð�: " + timeFormat.format(now));
		System.out.println("��¥�� �ð�: " + dateAndDay.format(now));
		System.out.println("���� �ð�(24�ð� ����): " + time24based.format(now));
		System.out.println("���� �ð�(AM/PM ����): " + timeAMPM.format(now));
	}
}
