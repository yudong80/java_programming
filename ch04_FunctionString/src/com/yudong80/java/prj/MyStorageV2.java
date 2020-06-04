package com.yudong80.java.prj;

import java.util.Scanner;

public class MyStorageV2 {
	static String EMPTY = "����";
	static int EMPTY_COUNT = 0;
	
	static void showMenu() { 
		System.out.println("MyStorage v1");
		System.out.println("--------------------------");
		System.out.println("1. ���� ���� ����ϱ� "); 
		System.out.println("2. ���� �ֱ�(�԰�)"); 
		System.out.println("3. ���� ����(���)");
		System.out.println("4. ��� ��ȸ");
		System.out.println("5. �����ϱ�");		
		System.out.println("--------------------------");
	}
	
	static int selectMenu(Scanner s) { 
		System.out.print("���ϴ� �޴��� �����ϼ���? ");
		int select = s.nextInt();
		return select;
	}
	
	static void register(Scanner s, String[] products) {
		System.out.println("���ο� ������ ����մϴ�");
		System.out.println("���ϴ� �޴��� �����ϼ���? ");
		
		String input = s.next();
		int emptyIdx = -1; //not empty
		for (int i=0; i< products.length; ++i) {
			String product = products[i];
			if (EMPTY.equals(product)) {
				emptyIdx = i;
				break;
			}
		}
		
		if (emptyIdx < 0) {
			System.out.println("â�� ����á���ϴ�. ����� �Ұ��մϴ�.");
			return;
		}
		
		products[emptyIdx] = input;
		System.out.println("����� �Ϸ�Ǿ����ϴ�. ��ǰ �����: ");
		for (String product: products) {
			System.out.println(product);
		}
	}
	
	public static void main(String[] args) {	
		Scanner s = new Scanner(System.in);
		String[] products = { EMPTY, EMPTY, EMPTY, EMPTY, EMPTY };
		int[] counts = { 0, 0, 0, 0, 0 };
		
		while(true) {
			//1. �޴��� ǥ���Ѵ� 
			showMenu();
			
			//2. �޴��� ���� 
			int menu = selectMenu(s);
			if (menu == 5) {
				System.out.println("���α׷��� �����մϴ�. ������ ������.");
				break;
			}
			
			switch(menu) {
			case 1: //register
				register(s, products);
				break;
			case 2: //deposit 
				System.out.println("â�� ������ �ֽ��ϴ� <�۾���>");
				break;
			case 3: //withdraw
				System.out.println("â���� ������ �����ɴϴ� <�۾���>");
				break;
			case 4: //search 
				System.out.println("â���� ������ ��ȸ�մϴ� <�۾���>");				
				break;
			}
		}
		s.close();
	}	
}