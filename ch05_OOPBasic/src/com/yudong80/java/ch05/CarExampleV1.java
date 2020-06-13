package com.yudong80.java.ch05;

class Car {
	String carNumber = "��1234";
	int cc = 2000;
	String fromDate = "202006"; //2020�� 6�� 
	int speed = 0;
	
	void start() {
		System.out.println("�õ��� �̴ϴ�");
		speed = 10; //�ü� 10km
		System.out.println("�ü�: " + speed);
	}
	
	void accelerate() {
		speed += 10;
		System.out.println("�ü�: " + speed);
	}
	
	void decelerate() {
		speed *= 0.5;
		System.out.println("�ü�: " + speed);
	}
}

public class CarExampleV1 {
	public static void main(String[] args) {
		Car car = new Car();
		car.start();
		car.accelerate();
		car.decelerate();
	}
}
