package com.yudong80.java.ch05.prj;

public class Shop {
	private static final int FOOD_MAX = 10;
	private static final String EMPTY_FOOD = "";
	private static final int EMPTY_PRICE = 0;
	
	private String shopName;
	private String[] foodNames;
	private int[] prices;
	
	public Shop(String shopName) {
		this.shopName = shopName;
		initValues();
	}
	
	private void initValues() {
		foodNames = new String[FOOD_MAX];
		prices = new int[FOOD_MAX];
		for (int i=0; i < FOOD_MAX; ++i) {
			foodNames[i] = EMPTY_FOOD;
			prices[i] = EMPTY_PRICE;
		}
	}
	
	/** 
	 * �������� ������ �߰�
	 * @param idx �ε���
	 * @param name ��� ���� �̸�
	 * @param price ��� ���� ����
	 */
	public void addFood(int idx, String name, int price) {
		System.out.println(shopName + "�� ����(" + name + ", " + price + ") �߰��Ǿ����ϴ�.");
		foodNames[idx] = name;
		prices[idx] = price;
	}
}
