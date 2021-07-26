package com.org.app.myfirstrestapi.entity;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="tbl_bankaccount")
public class BankAccount {
    
    @EmbeddedId
    private BankAccountId bId;

    private int balance;
    
}
