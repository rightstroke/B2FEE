package com.org.app.myfirstrestapi.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;
import javax.persistence.UniqueConstraint;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name = "tbl_student")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "fname", length = 100)
    private String firstname;

    @Column(name = "lname", length = 100)
    private String lastname;

    @Temporal(TemporalType.DATE)
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date dob;

    @Transient
    private int age;

    @Temporal(TemporalType.TIMESTAMP)
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date ts;

    //@ManyToOne(fetch = FetchType.EAGER,cascade = CascadeType.ALL)
    // @JoinColumn(name="cid")
    // private College college;


    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="type",referencedColumnName = "id")
    private StudentType sType;


    @ManyToMany(fetch = FetchType.EAGER,cascade = CascadeType.ALL)
    @JoinTable(name = "tbl_i_sub_stu",
        joinColumns = {@JoinColumn(name="stu_id",referencedColumnName = "id")},
        inverseJoinColumns = {@JoinColumn(name="sub_id",referencedColumnName = "id")},
        uniqueConstraints = @UniqueConstraint(columnNames = {"stu_id","sub_id"})
    )
    private List<Subject> subjects;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public Date getTs() {
        return ts;
    }

    public void setTs(Date ts) {
        this.ts = ts;
    }

    @Override
    public String toString() {
        return "Student [dob=" + dob + ", firstname=" + firstname + ", id=" + id + ", lastname=" + lastname + ", ts="
                + ts + "]";
    }

    public StudentType getsType() {
        return sType;
    }

    public void setsType(StudentType sType) {
        this.sType = sType;
    }

    public List<Subject> getSubjects() {
        return subjects;
    }

    public void setSubjects(List<Subject> subjects) {
        this.subjects = subjects;
    }

    // public College getCollege() {
    //     return college;
    // }

    // public void setCollege(College college) {
    //     this.college = college;
    // }
    

    public int getAge() {
        long ageInMillis = new Date().getTime() - getDob().getTime();
    
        Date age = new Date(ageInMillis);
    
        return age.getYear();
    }
}
