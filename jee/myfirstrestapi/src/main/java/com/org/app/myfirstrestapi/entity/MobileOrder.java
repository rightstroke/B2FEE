package com.org.app.myfirstrestapi.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="tbl_mobileorder")
public class MobileOrder extends Order {
    private String is4g;

    private String model;

    public String getIs4g() {
        return is4g;
    }

    public void setIs4g(String is4g) {
        this.is4g = is4g;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    
}
