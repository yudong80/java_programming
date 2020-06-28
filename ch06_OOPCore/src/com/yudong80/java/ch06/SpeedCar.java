package com.yudong80.java.ch06;

public class SpeedCar implements Car {
	private static final int DEFAULT_ACCEL = 10;
	private static final String SPEED_UNIT = "km/h";
	
	private String carNumber;
	private int speed = 0;
	
	public SpeedCar(String carNumber) {
		this.carNumber = carNumber;
	}
	
	@Override
	public void start() {
		System.out.println("���ǵ� ī " + carNumber + "�� �õ��� �̴ϴ�");
		accelerate();	
	}

	@Override
	public void accelerate() {
		accelerate(DEFAULT_ACCEL * 2); //2��! 		
	}

	@Override
	public void accelerate(int km) {
		speed += (km * 2); //2��!
		printSpeed(speed);		
	}

	@Override
	public void decelerateHalf() {
		speed *= 0.5;
		printSpeed(speed);
	}

	@Override
	public void decelerateAs(int km) {
		speed -= km;
		printSpeed(speed);		
	}
	
	private static void printSpeed(final int speed) {
		System.out.println("�ü�: " + speed + SPEED_UNIT);
	}
}
