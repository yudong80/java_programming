package com.yudong80.java.mystroage;

import java.util.HashMap;
import java.util.Map;

public class Storage {
	private static final int DEFAULT_CAPACITY = 10;
	
	private String storageName;
	private int capacity = DEFAULT_CAPACITY;
	private Map<Product, Integer> products;
		
	public Storage(String name, int capacity) { 
		this.storageName = name;
		this.capacity = capacity;
		
		products = new HashMap<>();
	}
	
	public boolean deposit(Product product, int cnt) {
		//1. 이미 있는 경우 
		
		//2. 없는 경우 
		
		//3. 가득찬 경우 
				
		return true;
	}
	
	public boolean withdraw(Product product, int cnt) { 
		
		return true;
	}
}
