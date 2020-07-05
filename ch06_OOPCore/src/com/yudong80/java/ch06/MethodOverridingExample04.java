package com.yudong80.java.ch06;

class Ancestor {
	public String getName() { 
		return "name"; 
	}

	protected String getCity() { 
		return "seoul"; 
	}

	int getHeight() { 
		return 165; 
	}
	
	private String getAddress() { 
		return "secret"; 
	}
}

class Descendant extends Ancestor {
	@Override
	//public �� ���� 
	public String getName() {
		return "my name";
	}
	
	@Override
	//public, protected ����
	public String getCity() {
		return super.getCity();
	}

	@Override
	//public , protected, (default) ����
	protected int getHeight() { 	 
		return super.getHeight() + 10;
	}
	
	//private method�� �޼��� �������̵� �Ұ�
}

public class MethodOverridingExample04 {
	public static void main(String[] args) {
		Ancestor man = new Descendant();
		System.out.println("�̸�? " + man.getName());
		System.out.println("����? " + man.getCity());
		System.out.println("Ű? " + man.getHeight());
	}
}
