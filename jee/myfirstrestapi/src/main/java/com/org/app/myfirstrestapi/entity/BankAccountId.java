package com.org.app.myfirstrestapi.entity;

import java.io.Serializable;

import javax.persistence.Embeddable;

@Embeddable
public class BankAccountId implements Serializable{
    private String accountnumber;

    private String branchCode;

    public String getAccountnumber() {
        return accountnumber;
    }

    public void setAccountnumber(String accountnumber) {
        this.accountnumber = accountnumber;
    }

    public String getBranchCode() {
        return branchCode;
    }

    public void setBranchCode(String branchCode) {
        this.branchCode = branchCode;
    }

    public BankAccountId(String accountnumber, String branchCode) {
        this.accountnumber = accountnumber;
        this.branchCode = branchCode;
    } 

    
}
