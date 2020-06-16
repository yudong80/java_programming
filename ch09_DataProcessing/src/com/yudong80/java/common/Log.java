package com.yudong80.java.common;

public class Log {
	public static void d(String msg) { 
		System.out.println("[debug]: " + msg);
	}

	public static void i(String msg) { 
		System.out.println("[infor]: " + msg);
	}
	
	public static void e(String msg) { 
		System.out.println("[error]: " + msg);
	}
}
