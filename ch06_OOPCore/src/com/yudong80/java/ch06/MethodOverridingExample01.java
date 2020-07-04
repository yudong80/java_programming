package com.yudong80.java.ch06;

class ColoredParent {
	public String getPrimaryColor() {
		return "red";
	}
	
	public String getSecondaryColor() {
		return "blue";
	}
}

class PuppleChild extends ColoredParent {
	@Override
	public String getSecondaryColor() {
		return "pupple";
	}
}

public class MethodOverridingExample01 {
	public static void main(String[] args) {	
		//1. �θ� ��ü ����
		ColoredParent cp = new ColoredParent();
		System.out.println("1�� ����? " + cp.getPrimaryColor());
		System.out.println("2�� ����? " + cp.getSecondaryColor());
		
		//2. �ڽ� ��ü ����
		ColoredParent pupple = new PuppleChild();
		System.out.println("1�� ����? " + pupple.getPrimaryColor());
		System.out.println("2�� ����? " + pupple.getSecondaryColor()); 
	}
}
