package com.yudong80.java.mystroage;

import static com.yudong80.java.common.CommonUtils.print;
import static com.yudong80.java.common.CommonUtils.readInt;;

public class MyStorageMain {
	private static final String VERSION = "v0.1";
	
	public void run() { 
		print("===================================");
		print("   MyStroage " + VERSION);
		print("===================================");
		print("1) ����� ���");
		print("2) �����ϱ�");
		print("3) ������");
		print("4) ��ȸ�ϱ�");
		print("5) �����ϱ�");
		print("-----------------------------------");
		int func = readInt("���ϴ� ����� �Է��ϼ���?");	
		
		switch(func) { 
		
		}
	}
	
	public static void main(String[] args) {
		new MyStorageMain().run();
	}
}
