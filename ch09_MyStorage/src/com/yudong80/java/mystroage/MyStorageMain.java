package com.yudong80.java.mystroage;

import static com.yudong80.java.common.CommonUtils.print;
import static com.yudong80.java.common.CommonUtils.readInt;;

public class MyStorageMain {
	private static final String VERSION = "v0.1";
	
	public void run() { 
		print("===================================");
		print("   MyStroage " + VERSION);
		print("===================================");
		print("1) 사용자 등록");
		print("2) 보관하기");
		print("3) 꺼내기");
		print("4) 조회하기");
		print("5) 종료하기");
		print("-----------------------------------");
		int func = readInt("원하는 기능을 입력하세요?");	
		
		switch(func) { 
		
		}
	}
	
	public static void main(String[] args) {
		new MyStorageMain().run();
	}
}
