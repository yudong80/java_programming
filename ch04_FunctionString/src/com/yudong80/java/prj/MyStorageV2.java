package com.yudong80.java.prj;

import java.util.Scanner;

public class MyStorageV2 {
	static String EMPTY = "����";
	static int EMPTY_COUNT = 0;
	
	static void showMenu() { 
		System.out.println("MyStorage v2");
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
		System.out.println("���� �̸��� �Է��ϼ���? ");
		
		//1. ����ִ� ���� ã�� 
		String input = s.next();
		int emptySlot = -1; //not empty
		for (int i=0; i< products.length; ++i) {
			String product = products[i];
			if (EMPTY.equals(product)) {
				emptySlot = i;
				break;
			}
		}
		
		//2. ����ִ� ������ ���ٸ� ���� �߻� 
		if (emptySlot < 0) {
			System.out.println("â�� ����á���ϴ�. ����� �Ұ��մϴ�.");
			return;
		}
		
		//3. ��� ���� 
		products[emptySlot] = input;
		System.out.println("����� �Ϸ�Ǿ����ϴ�. ��ǰ �����: ");
		for (String product: products) {
			System.out.println(product);
		}
	}

	static void deposit(Scanner s, String[] products, int[] counts) {
		System.out.println("������ �߰��մϴ�(�԰�)");
		System.out.println("���� ��ϵ� ���� ���:");
		for (String product: products) {
			System.out.println("> " + product);
		}
		
		//1. ���� ����  ã��
		System.out.println("�߰��� ���� �̸��� �Է��ϼ���? ");	
		String input = s.next();
		int foundIdx = -1; //not found
		for (int i=0; i< products.length; ++i) {
			String product = products[i];
			if (input.equals(product)) {
				foundIdx = i;
				break;
			}
		}
		
		//2. ����ִ� ������ ���ٸ� ���� �߻� 
		if (foundIdx < 0) {
			System.out.println("ã�� ������ �����ϴ�. �԰��� �� �����ϴ�.");
			return;
		}
		
		//3. �߰� ���� 
		System.out.println("�߰��� ������ �Է��ϼ���? ");
		int cnt = s.nextInt();
		counts[foundIdx] += cnt;
		
		System.out.println("�԰� �Ϸ�Ǿ����ϴ�. ��ǰ ��Ȳ��: ");
		for (int i=0; i< products.length; ++i) {
			System.out.println("> " + products[i] + ": " + counts[i] + "��");
		}
	}

	static void withdraw(Scanner s, String[] products, int[] counts) {
		System.out.println("������ �����ϴ�(���)");
		System.out.println("���� ��ϵ� ���� ���:");
		for (String product: products) {
			System.out.println("> " + product);
		}
		
		//1. ���� ����  ã��
		System.out.println("���� ���� �̸��� �Է��ϼ���? ");	
		String input = s.next();
		int foundIdx = -1; //not found
		for (int i=0; i< products.length; ++i) {
			String product = products[i];
			if (input.equals(product)) {
				foundIdx = i;
				break;
			}
		}
		
		//2. ����ִ� ������ ���ٸ� ���� �߻� 
		if (foundIdx < 0) {
			System.out.println("ã�� ������ �����ϴ�. ����� �� �����ϴ�.");
			return;
		}
		
		//3. ������ ���� 
		System.out.println("���� ������ �Է��ϼ���? ");
		int cnt = s.nextInt();
		counts[foundIdx] -= cnt;
		
		System.out.println("��� �Ϸ�Ǿ����ϴ�. ��ǰ ��Ȳ��: ");
		for (int i=0; i< products.length; ++i) {
			System.out.println("> " + products[i] + ": " + counts[i] + "��");
		}
	}
	
	static void search(String[] products, int[] counts) {
		System.out.println("���� ��ϵ� ���� ���:");
		for (int i=0; i< products.length; ++i) {
			System.out.println("> " + products[i] + ": " + counts[i] + "��");
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
				deposit(s, products, counts);
				break;
			case 3: //withdraw
				withdraw(s, products, counts);
				break;
			case 4:
				search(products, counts);
				break;
			}
		}
		s.close();
	}	
}