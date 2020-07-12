package com.yudong80.java.ch06.abs;

public class NovaPhone extends Phone{

	private static final String NOVA_PREFIX = "NOVA:";
	private static final String[] REGION_CODES = {
			"010",
			"011",
			"012",
			"016,"
	};
	
	public NovaPhone(String phoneNo, String modelNo) {
		super(phoneNo, modelNo);
		System.out.println(modelNo + "(" + phoneNo + ") �� �����Ǿ����ϴ� [�̰���]");
	}

	@Override
	boolean validate(String serialNo) {
		if (serialNo == null) {
			System.out.println("�Ϸ� ��ȣ�� ��� �ֽ��ϴ�. ���� ����!");
			return false;
		}
		
		if (serialNo.startsWith(NOVA_PREFIX)) {
			super.isValid = true;
			System.out.println(serialNo + "�� ���� �Ǿ����ϴ�.");
			return true;
		}
		
		System.out.println("������ �����Ͽ����ϴ�.");
		return false;
	}

	@Override
	boolean call(String phoneNo) {
		if (phoneNo == null) {
			System.out.println("��ȭ ��ȣ�� ��� �ֽ��ϴ�. ��ȭ ����!");
			return false;
		}
		
		for (String code : REGION_CODES) {
			if(phoneNo.startsWith(code)) {
				System.out.println(phoneNo + "�� ��ȭ �����Ͽ����ϴ�.");
				return true;
			}
		}
		
		System.out.println("���� �ڵ尡 ���� �ʽ��ϴ�.");
		return false;
	}
}



