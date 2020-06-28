package com.yudong80.java.ch06;

public class CarExampleV5 {
	public static void main(String[] args) {
		//1. MyCar, SpeedCar ��ü ���� 
		Car[] cars = {
			new MyCar("��1234"),
			new SpeedCar("��8322"),
		};
		
		//2. Car ��ü ȣ��
		for (Car car : cars) {
			car.start();
			car.accelerate();
			car.accelerate(70);
			car.decelerateAs(60);
			car.decelerateHalf();
		}		
	}
}
