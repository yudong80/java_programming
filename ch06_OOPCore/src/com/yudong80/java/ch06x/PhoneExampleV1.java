package com.yudong80.java.ch06x;

public class PhoneExampleV1 {
	public static void main(String[] args) {
		//1. NovaPhone ��ü ����
		Phone phone = new NovaPhone("010-1111-2222", "NovaX");
		
		boolean valid = phone.validate("NOVA:888-9999");
		if (valid) {
			//2. ù��° ��ȭ �õ� 
			phone.call("013-4444-5555");
			
			//3. �ι�° ��ȭ �õ� 
			phone.call("010-1111-2222");
		}
	}
}
