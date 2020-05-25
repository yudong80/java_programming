package com.yudong80.java.ch03;

public class SwitchBasic {
	public static void main(String[] args) {
		String[] planets = {
				"荐己", "陛己", "瘤备", "拳己", "格己", "配己",
		};
		
		for (String planet : planets) {
			switch (planet) {
			case "瘤备": 
				System.out.println(planet + "肺 快林 咯青 啊磊!");
				break;
			default: 
				System.out.println(planet + "栏肺 快林 咯青 啊磊!");
			}	
		}
	}
}
