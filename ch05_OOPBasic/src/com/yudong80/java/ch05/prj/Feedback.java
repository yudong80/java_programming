package com.yudong80.java.ch05.prj;

public class Feedback {
	private String customerName;
	private String shopName;
	private String foodName;
	private int grade;
	
	public Feedback(String cust, String shop, String food, int grd) {
		customerName = cust;
		shopName = shop;
		foodName = food;
		grade = grd;
	}
	
	public String getCustomerName() {
		return customerName;
	}
	
	public String getShopName() {
		return shopName;
	}
	
	public String getFoodName() {
		return foodName;
	}
	
	public int getGrade() {
		return grade;
	}
	
	public String getStars() {
		final String star = "¡Ú";
		String res = "";
		
		for (int i=0; i< grade; ++i) {
			res += star;
		}
		
		return res;
	}
	
	public void printInfo() {
		System.out.println("[°í°´´Ô: " + customerName + 
				", °¡¸ÍÁ¡: " + shopName +
				", À½½Ä: " + foodName + 
				", º°Á¡: " + getStars());
	}
}
