package com.yudong80.java.ch06;

class GreenGrass extends ColoredParent {
	@Override
	public String getPrimaryColor() {
		return "green";
	}
	
	@Override
	public String getSecondaryColor() {
		return "yellow";
	}
}

public class MethodOverridingExample02 {
	public static void main(String[] args) {	
		//1. �θ� Ŭ������ ����
		ColoredParent[] cps = {
			new ColoredParent(), 
			new PuppleChild(),
			new GreenGrass(),
		};
		
		for (ColoredParent cp: cps) {
			System.out.println("1�� ����? " + cp.getPrimaryColor());
			System.out.println("2�� ����? " + cp.getSecondaryColor());			
		}
	}
}
