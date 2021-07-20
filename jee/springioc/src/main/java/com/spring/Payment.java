package com.spring;

public class Payment {
	

	
    public Payment(String type,String source) {
    	
        System.out.println("In Constructor...." + type + "," + source);
    }
    
    private PaymentStatus payStatus;

    public PaymentStatus getPayStatus() {
		return payStatus;
	}

	public void setPayStatus(PaymentStatus payStatus) {
		this.payStatus = payStatus;
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
