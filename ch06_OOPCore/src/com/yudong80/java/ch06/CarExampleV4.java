package com.yudong80.java.ch06;

public class CarExampleV4 {
	public static void main(String[] args) {
		//1. MyCar ��ü ���� 
		MyCar car = new MyCar("��1234");
		car.start();
		car.accelerate();
		car.accelerate(70);
		car.decelerateAs(60);
		car.decelerateHalf();
		
		//2. SpeedCar ��ü ����
		SpeedCar speedCar = new SpeedCar("��8322");
		speedCar.start();
		speedCar.accelerate();
		speedCar.accelerate(70);
		speedCar.decelerateAs(60);
		speedCar.decelerateHalf();
	}
}
