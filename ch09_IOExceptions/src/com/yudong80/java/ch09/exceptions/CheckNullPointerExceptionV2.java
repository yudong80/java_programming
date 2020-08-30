package com.yudong80.java.ch09.exceptions;

public class CheckNullPointerExceptionV2 {	
	static String[] getLoginUsers(int page) {
		if (page == 100) {
			return new String[] {"A", "B", "C"};
		}
		
		//�� �޼���� null�� ��ȯ�� �� �ֽ��ϴ�. 
		return null;
	}
		
	public static void main(String[] args) {
		//1. �������� ��� 
		String[] users = getLoginUsers(100);
		System.out.println("�α����� ������� ���� " + users.length + "�Դϴ�.");
		
		//2. NullPoinerException �߻� 
		String[] anotherUsers = getLoginUsers(200);
		//System.out.println("�α����� �Ǵٸ� ������� ���� " + anotherUsers.length + "�Դϴ�.");
		
		//3. NPE ��ó�ϱ� 
		int userCount = 0; 
		if (anotherUsers != null) {
			userCount = anotherUsers.length;
		}
		System.out.println("�α����� �Ǵٸ� ������� ���� " + userCount + "�Դϴ�.");
	}
}


