package com.spring;

public class PaymentType {
	private String type;

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "PaymentType [type=" + type + "]";
	}
	
	
}
