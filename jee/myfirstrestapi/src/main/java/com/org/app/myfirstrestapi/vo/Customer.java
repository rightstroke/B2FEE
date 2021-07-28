package com.org.app.myfirstrestapi.vo;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

import io.swagger.annotations.ApiModelProperty;

public class Customer {

    @ApiModelProperty(notes = "Name of the Customer",name="name",required =true,value="A valid Customer Name")
    private String name;

    @JsonFormat(pattern = "yyyy-MM-dd")
    @ApiModelProperty(notes = "Customer DOB",name="dob",required =true,value="A valid Customer Date of Birth")
    private Date dob;

    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Customer [age=" + age + ", dob=" + dob + ", name=" + name + "]";
    }

    
}
