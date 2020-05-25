package com.yudong80.java.ch03;

public class DoWhileBasic {
	public static void main(String[] args) {
		String[] planets = {
			"荐己", "陛己", "瘤备", "拳己", "格己", "配己",
		};
		
		int i = 0;
		do { 
			String dest = planets[i];
		
			System.out.println(dest + "(栏)肺 快林 咯青阑 啊磊!");
			i += 1;
		} while (i < planets.length);
	}
}
