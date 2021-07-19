package com.spring;

public class Payment {


    public Payment() {
        System.out.println("In Constructor....");
    }

    private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

	@Override
	public String toString() {
		return "Payment [message=" + " India " + "]";
	}
    
    
}
