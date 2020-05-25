package com.yudong80.java.ch03;

public class SwitchExtended {
	public static void main(String[] args) {
		String[] planets = {
				"荐己", "陛己", "瘤备", "拳己", "格己", "配己",
		};
		
		for (String planet : planets) {
			switch (planet) {
			case "荐己":	//fall-through
			case "陛己": //fall-through
			case "拳己": //fall-through
			case "格己": //fall-through
			case "配己":
				System.out.println(planet + "栏肺 快林 咯青 啊磊!");
				break;
			case "瘤备": 
				System.out.println(planet + "肺 快林 咯青 啊磊!");
			}	
		}
	}
}
