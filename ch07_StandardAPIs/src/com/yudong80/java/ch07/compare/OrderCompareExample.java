package com.yudong80.java.ch07.compare;

public class OrderCompareExample {
	public static void main(String[] args) {
		long orderDate = System.currentTimeMillis(); //���� �ð� 
		
		ComparableOrder[] orders = {
			new ComparableOrder("ȫ�浿", "���õ��", "�������", orderDate),
			new ComparableOrder("�ݳ���", "�߱���", "���¥��", orderDate + 100),
			new ComparableOrder("�ڻ��", "�Ͻ���", "���ȸ", orderDate + 200)	
		};
		
		//1. �ֹ� ���� ��� 
		for (Order order : orders) {
			System.out.println(order);
		}
		
		//2. ��� �� 
		boolean chk1 = orders[0].compareTo(orders[1]) < 0;
		System.out.println("order[0] < order[1] ? " + chk1);

		boolean chk2 = orders[0].compareTo(orders[2]) > 0;
		System.out.println("order[0] > order[2] ? " + chk2);
		
		//3. ���� �� 
		boolean cmp = orders[1].compareTo(orders[1]) == 0;
		boolean equals = orders[1].equals(orders[1]);
		System.out.println("order[1] == order[1] ? " + cmp);
		System.out.println("order[1].equals(order[1]) ? " + equals);
		
		//4. ���� �ֱ� �ֹ� ����ϱ� 
		ComparableOrder lastOrder = orders[0]; //default
		for (ComparableOrder order : orders) {
			if (order.compareTo(lastOrder) > 0) {
				lastOrder = order;
			}
		}
		
		System.out.println("������ �ֹ�: " + lastOrder);
	}
}
