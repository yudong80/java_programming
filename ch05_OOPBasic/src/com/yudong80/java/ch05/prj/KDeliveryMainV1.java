package com.yudong80.java.ch05.prj;

import java.util.Scanner;

public class KDeliveryMainV1 {
	private static int SHOP_MAX = 10;
	private static int ORDER_MAX = 20;
	private static int FEEDBACK_MAX = ORDER_MAX;
	
	private Shop[] shops;
	private Order[] orders;
	private Feedback[] feedbacks;
	
	private int shopIdx = 0;
	private int orderIdx = 0;
	private int feedbackIdx = 0;
		
	private Scanner s;
	
	public KDeliveryMainV1() {
		s = new Scanner(System.in);
		initValues();
	}
	
	private void initValues() {
		shops = new Shop[SHOP_MAX];
		orders = new Order[ORDER_MAX];
		feedbacks = new Feedback[FEEDBACK_MAX];
	}
	
	public void close() {
		if (s != null) {
			s.close();
		}
	}
	
	public int selectMainMenu() {
		System.out.println("  KDelivery V1");
		System.out.println("-------------------------------");
		System.out.println("1) ������ ����ϱ�");
		System.out.println("2) ������ ���� ��ȸ�ϱ�");
		System.out.println("3) ���� �ֹ��ϱ�");
		System.out.println("4) ���� ����ϱ�");
		System.out.println("5) �����ϱ�");
		System.out.println("> ������ ���͵帱���? ");
		
		int select = s.nextInt();
		return select;
	}
	
	public void selectAddShopMenu() { 
		final String shopName;
		final String foodName;
		final int price;
		
		System.out.println("�ݰ����ϴ�. �����ִ�!");
		System.out.println("������ ��ȣ�� �����ΰ���?");
		shopName = s.next();
		
		System.out.println("���� �̸��� �����ΰ���?");
		foodName = s.next();

		System.out.println("���� ������ ���ΰ���?");
		price = s.nextInt();

		Shop s = new Shop(shopName);
		s.addFood(0, foodName, price);
		shops[shopIdx++] = s;
		
		System.out.println(">> ���� ó���Ǿ����ϴ�.");
	}
	
	public void selectDashboardMenu() { 
		for (Feedback feedback : feedbacks) {
			if (feedback == null) {
				break;
			}
			feedback.printInfo();
		}
	}
	
	public void selectOrderMenu() {
		final String customerName;		
		final String shopName;
		final String foodName;
		
		System.out.println("�ݰ����ϴ�. ����!");
		System.out.println("�ֹ��� �̸��� �����ΰ���?");
		customerName = s.next();

		System.out.println("������ ��ȣ�� �����ΰ���?");
		shopName = s.next();
		
		System.out.println("���� �̸��� �����ΰ���?");
		foodName = s.next();

		Order s = new Order(customerName, shopName, foodName);
		orders[orderIdx++] = s;
		
		System.out.println(">> ���� ó���Ǿ����ϴ�.");
	}
	
	public void selectFeedbackMenu() {
		final String customerName;		
		final String shopName;
		final String foodName;
		final int grade;
		
		System.out.println("�ݰ����ϴ�. ����!");
		System.out.println("�ֹ��� �̸��� �����ΰ���?");
		customerName = s.next();

		System.out.println("������ ��ȣ�� �����ΰ���?");
		shopName = s.next();
		
		System.out.println("���� �̸��� �����ΰ���?");
		foodName = s.next();

		System.out.println("���ĸ��� �����? (1~ 5����)?");
		grade = s.nextInt();
		
		Feedback f = new Feedback(customerName, shopName, foodName, grade);
		feedbacks[feedbackIdx++] = f;
		
		System.out.println(">> ���� ó���Ǿ����ϴ�.");
	
	}
	public static void main(String[] args) {
		KDeliveryMainV1 kd = new KDeliveryMainV1();
		int menu = 5; //default
		do {
			menu = kd.selectMainMenu();
			
			switch(menu) {
			case 1: kd.selectAddShopMenu(); break;
			case 2: kd.selectDashboardMenu(); break;
			case 3: kd.selectOrderMenu(); break;
			case 4: kd.selectFeedbackMenu(); break;			
			}
			
		} while (menu != 5);
		
		System.out.println("�̿����ּż� �����մϴ�.");
	}
}