package com.itvdn.models;

import javax.persistence.*;

@Entity
@Table(name = "student")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String fname;
    private String sname;
    private String lname;
    private String phone;

    public Student() {
    }

    public Student(String fname, String sname, String lname, String phone) {

        this.fname = fname;
        this.sname = sname;
        this.lname = lname;
        this.phone = phone;
    }

    public Student(long id, String fname, String sname, String lname, String phone) {
        this.id = id;
        this.fname = fname;
        this.sname = sname;
        this.lname = lname;
        this.phone = phone;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }


    @Override
    public String toString() {
        return "Students{" +
                "id=" + id +

                ", fname='" + fname + '\'' +
                ", sname='" + sname + '\'' +
                ", lname='" + lname + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}