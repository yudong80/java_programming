package com.yudong80.java.mystroage;

public class Product {
	private static final int PRIORITY_HIGH = 100;
	private static final int PRIORITY_MIDDLE = 50;
	private static final int PRIORITY_LOW = 10;
	
	private String name;
	private String desc;
	private int priority;
	
	public Product(String name, String desc, int priority) {
		this.name = name;
		this.desc = desc;
		
		
		
		this.priority = priority;
	}
	
}
