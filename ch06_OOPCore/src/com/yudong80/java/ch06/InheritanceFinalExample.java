package com.yudong80.java.ch06;

final class LastWarrior {
	public void attack(String castle) { 
		System.out.println("������ ���簡 " + castle + " ���� �����մϴ�.");
	}	
}

//final Ŭ������ ����� �� �����ϴ�. 
class NewWarrior /*extends LastWarrior*/ {
	
}

class BasicWarrior  {
	public final void attackNormal(String enemy) {
		System.out.println("���簡 " + enemy + "���� �Ϲ� ������ �մϴ�.");
	}		
}

class AdvancedWarrior extends BasicWarrior {
	public void attackCritical(String enemy) {
		System.out.println("���簡 " + enemy + "���� ġ������ ������ �մϴ�.");
	}
}

public class InheritanceFinalExample {
	public static void main(String[] args) {
		//1. final Ŭ������ ��� �Ұ� 
		LastWarrior warrior = new LastWarrior();
		warrior.attack("����");
		
		//2. final �޼���� �޼��� �������̵� �Ұ� 
		BasicWarrior basic = new BasicWarrior();
		basic.attackNormal("����");
		
		AdvancedWarrior advanced = new AdvancedWarrior();
		advanced.attackNormal("��ũ");
		advanced.attackCritical("��");
	}
}