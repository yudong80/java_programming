package com.yudong80.java.ch06;

public class CarExampleV2 {
	public static void main(String[] args) {
		//Car ��ü ���� (����õ ���)
		Car car = new Car() {
			public void start() {
			}

			public void accelerate() {
			}

			public void accelerate(int km) {
			}

			public void decelerateHalf() {
			}

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
