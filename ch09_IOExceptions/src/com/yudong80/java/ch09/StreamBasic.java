package com.yudong80.java.ch09;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

public class StreamBasic {
	public static void main(String[] args) throws IOException {
		//0. ������ �غ�
		byte[] data = {0, 1, 2};
		
		//1. ������ �б� 
		InputStream is = new ByteArrayInputStream(data);
		System.out.println("�Է� ������: " + is.read());
		System.out.println("�Է� ������: " + is.read());
		System.out.println("�Է� ������: " + is.read());
		
		is.close(); //�ݵ�� ����� �ݾ��־�� �� 
		
		//2. ������ ���� 
		ByteArrayOutputStream os = new ByteArrayOutputStream();
		os.write(1);
		os.write(2);
		os.write(3);
		
		byte[] outputs = os.toByteArray();
		System.out.println("��� ������:" + Arrays.toString(outputs));
		
		os.close(); //�ݵ�� ����� �ݾ��־�� �� 
	}
}
