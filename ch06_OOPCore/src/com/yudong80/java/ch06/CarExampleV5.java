package com.yudong80.java.ch06;

public class CarExampleV5 {
	public static void main(String[] args) {
		//1. MyCar, SpeedCar 按眉 积己 
		Car[] cars = {
			new MyCar("啊1234"),
			new SpeedCar("快8322"),
		};
		
		//2. Car 按眉 龋免
		for (Car car : cars) {
			car.start();
			car.accelerate();
			car.accelerate(70);
			car.decelerateAs(60);
			car.decelerateHalf();
		}		
	}
}
