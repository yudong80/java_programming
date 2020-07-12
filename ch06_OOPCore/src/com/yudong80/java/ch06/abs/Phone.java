package com.yudong80.java.ch06.abs;

abstract public class Phone {

	private String phoneNo;
	private String modelNo;
	protected boolean isValid;
	
	public Phone(String phoneNo, String modelNo) {
		this.phoneNo = phoneNo;
		this.modelNo = modelNo;
	}
	
	/** 
	 * ���� �����Ϸ��� ��Ż� ������ �Ϸ� ��ȣ�� �־�� �մϴ�.
	 * @param serialNo ���� �Ϸ� ��ȣ
	 * @return ���� ���� 
	 */
	abstract boolean validate(String serialNo);
	
	/** 
	 * ��ȭ�� �̴ϴ� 
	 * @param phoneNo
	 * @return ��ȭ ���� ����
	 */
	abstract boolean call(String phoneNo);
	
	public String getPhoneNumber() {
		return phoneNo;
	}
	
	public String getModelNo() {
		return modelNo;
	}
	
	public boolean isValid() {
		return isValid;
	}
}