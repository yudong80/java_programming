package com.yudong80.java.ch02;

public class ArrayDoubleExampleV1 {
	public static void main(String[] args) {
		double[] sensorData; 		//�迭 ����
		sensorData= new double[] {  //�迭 ���� 
				1.0, 
				2.2, 
				3.1,
		};
		
		int firstIndex = 0;
		int lastIndex = sensorData.length -1;
		
		System.out.println("ù��° ���� ������: " + sensorData[firstIndex]);
		System.out.println("������ ���� ������: " + sensorData[lastIndex]);
		System.out.println("���� ������ ����: " + sensorData.length);
	}
}
