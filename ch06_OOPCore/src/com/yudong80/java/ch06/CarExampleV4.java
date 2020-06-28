package com.yudong80.java.ch06;

public class CarExampleV4 {
	public static void main(String[] args) {
		//1. MyCar 按眉 积己 
		MyCar car = new MyCar("啊1234");
		car.start();
		car.accelerate();
		car.accelerate(70);
		car.decelerateAs(60);
		car.decelerateHalf();
		
		//2. SpeedCar 按眉 积己
		SpeedCar speedCar = new SpeedCar("快8322");
		speedCar.start();
		speedCar.accelerate();
		speedCar.accelerate(70);
		speedCar.decelerateAs(60);
		speedCar.decelerateHalf();
	}
}
