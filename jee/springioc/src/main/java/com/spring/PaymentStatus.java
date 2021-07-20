package com.spring;

import java.util.List;

public class PaymentStatus {
	public PaymentStatus() {
		System.out.println("In payment stauts const....");
	}

	private String status;
	
	private List names;

	public List getNames() {
		return names;
	}

	public void setNames(List names) {
		this.names = names;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
}
