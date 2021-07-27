package com.org.app.myfirstrestapi.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="tbl_grocerryorder")
public class GrocerryOrder extends Order {
    private boolean isPerishable;

    private int quantity;

    public boolean isPerishable() {
        return isPerishable;
    }

    public void setPerishable(boolean isPerishable) {
        this.isPerishable = isPerishable;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    
}
