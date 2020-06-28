package com.yudong80.java.ch06;

public class CarExampleV2 {
	public static void main(String[] args) {
		//Car 按眉 积己 (厚眠玫 规过)
		Car car = new Car() {

			@Override
			public void start() {
				
			}

			@Override
			public void accelerate() {
				
			}

			@Override
			public void accelerate(int km) {
				
			}

			@Override
			public void decelerateHalf() {
				
			}

			@Override
			public void decelerateAs(int km) {
				
			}			
		};
		
		car.start();
		car.accelerate();
		car.accelerate(70);
		car.decelerateAs(60);
		car.decelerateHalf();		
	}
}
