package com.yudong80.java.mystroage;

import com.yudong80.java.common.Log;

public class User {
	private String name;
	private String password;
	
	public User(String name, String password) { 
		this.name = name;
		this.password = password;
	}
	
	public String getName() { 
		return name;
	}
	
	public boolean confirmPassword(String pw) {
		if (password == null) { 
			Log.e("confirmPassword() : password가 null 입니다. -> return false");
			return false;
		}
		
		return password.equals(pw);
	}
}
