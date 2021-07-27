package com.org.app.myfirstrestapi.entity;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("s")
public class SavingsAccount extends Account {
    private int interest;

    private String custid;

    public int getInterest() {
        return interest;
    }

    public void setInterest(int interest) {
        this.interest = interest;
    }

    public String getCustid() {
        return custid;
    }

    public void setCustid(String custid) {
        this.custid = custid;
    }

    @Override
    public String toString() {
        return "SavingsAccount [custid=" + custid + ", interest=" + interest + "]";
    }

    
}
