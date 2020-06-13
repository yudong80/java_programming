package com.yudong80.java.ch05;

class Car {
	String carNumber = "가1234";
	int cc = 2000;
	String fromDate = "202006"; //2020년 6월 
	int speed = 0;
	
	void start() {
		System.out.println("시동을 겁니다");
		speed = 10; //시속 10km
		System.out.println("시속: " + speed);
	}
	
	void accelerate() {
		speed += 10;
		System.out.println("시속: " + speed);
	}
	
	void decelerate() {
		speed *= 0.5;
		System.out.println("시속: " + speed);
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
