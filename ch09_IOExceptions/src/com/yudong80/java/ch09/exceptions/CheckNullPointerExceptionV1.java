package com.yudong80.java.ch09.exceptions;

public class CheckNullPointerExceptionV1 {
	static boolean isLogin(String id) {
		//NPE �߻� ���ɼ����� 
		if (id.equals("admin")) {
			return true;
		}
		return false;
	}
	
	static boolean isLoginSuccessful(String id) {
		//NPE �߻� ����� 
		if ("admin".equals(id)) {
			return true;
		}
		return false;		
	}
	
	public static void main(String[] args) {
		//1. �������� ��� 
		boolean adminLogin = isLogin("admin");
		
		//2. NPE �߻� 
		boolean nullLogin = isLogin(null);
	}
}