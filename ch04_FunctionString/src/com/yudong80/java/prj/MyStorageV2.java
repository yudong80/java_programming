package com.yudong80.java.prj;

import java.util.Scanner;

public class MyStorageV2 {
	static String EMPTY = "없음";
	static int EMPTY_COUNT = 0;
	
	static void showMenu() { 
		System.out.println("MyStorage v1");
		System.out.println("--------------------------");
		System.out.println("1. 물건 정보 등록하기 "); 
		System.out.println("2. 물건 넣기(입고)"); 
		System.out.println("3. 물건 빼기(출고)");
		System.out.println("4. 재고 조회");
		System.out.println("5. 종료하기");		
		System.out.println("--------------------------");
	}
	
	static int selectMenu(Scanner s) { 
		System.out.print("원하는 메뉴를 선택하세요? ");
		int select = s.nextInt();
		return select;
	}
	
	static void register(Scanner s, String[] products) {
		System.out.println("새로운 물건을 등록합니다");
		System.out.println("원하는 메뉴를 선택하세요? ");
		
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
			System.out.println("창고가 가득찼습니다. 등록이 불가합니다.");
			return;
		}
		
		products[emptyIdx] = input;
		System.out.println("등록이 완료되었습니다. 제품 목록은: ");
		for (String product: products) {
			System.out.println(product);
		}
	}
	
	public static void main(String[] args) {	
		Scanner s = new Scanner(System.in);
		String[] products = { EMPTY, EMPTY, EMPTY, EMPTY, EMPTY };
		int[] counts = { 0, 0, 0, 0, 0 };
		
		while(true) {
			//1. 메뉴를 표시한다 
			showMenu();
			
			//2. 메뉴를 고른다 
			int menu = selectMenu(s);
			if (menu == 5) {
				System.out.println("프로그램을 종료합니다. 다음에 만나요.");
				break;
			}
			
			switch(menu) {
			case 1: //register
				register(s, products);
				break;
			case 2: //deposit 
				System.out.println("창고에 물건을 넣습니다 <작업중>");
				break;
			case 3: //withdraw
				System.out.println("창고에서 물건을 가져옵니다 <작업중>");
				break;
			case 4: //search 
				System.out.println("창고의 물건을 조회합니다 <작업중>");				
				break;
			}
		}
		s.close();
	}	
}