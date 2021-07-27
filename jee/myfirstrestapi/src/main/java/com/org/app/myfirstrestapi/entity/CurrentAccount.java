package com.org.app.myfirstrestapi.entity;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("c")
public class CurrentAccount extends Account {
    private int vendorId;

    @Override
    public String toString() {
        return "CurrentAccount [vendorId=" + vendorId + "]";
    }

    public int getVendorId() {
        return vendorId;
    }

    public void setVendorId(int vendorId) {
        this.vendorId = vendorId;
    }

    
}
