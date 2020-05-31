package com.yudong80.java.ch04;

public class StringSubstringEquals {
	public static void main(String[] args) {
		//1. substring() ����
		String poem = 
		"Two roads diverged in a yellow wood,\n" + 
		"And sorry I could not travel both"; 
		
		String samePoem = poem.substring(0);
		String firstWord = poem.substring(0, 3);
		String secondLine = poem.substring(35);
		System.out.println("���� ������:\n" + samePoem);
		System.out.println("���� ù��° �ܾ��: " + firstWord);
		System.out.println("���� �ι�° ����: " + secondLine);
		
		//2. equals() �� equalsIgnoreCase() ����  
		String apple = "apple";
		String macintosh = "macintosh";
		String mac = "Macintosh";
		
		boolean isSame = apple.equals(mac);
		boolean isSameWord = macintosh.equalsIgnoreCase(mac);
		System.out.println(apple + "�� " + mac + "�� ��������? " + isSame);
		System.out.println(macintosh + "�� " + mac + "�� ���� �ܾ��ΰ���(��ҹ��� ����)? " + isSameWord);
	}
}
