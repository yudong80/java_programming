package com.yudong80.java.ch07;

import java.util.UUID;

public class UUIDExample {
	public static void main(String[] args) {
		//1. UUID �����ϱ� 
		UUID[] uuids = {
			UUID.randomUUID(),
			UUID.randomUUID(),
			UUID.randomUUID()
		};
				
		for (UUID id : uuids) {
			System.out.println("�����ĺ���: " + id);
		}
	}
}
