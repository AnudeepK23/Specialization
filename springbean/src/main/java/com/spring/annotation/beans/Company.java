package com.spring.annotation.beans;

public class Company {



    private String name;
    private String arealocation;



    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getAreaLocation() {
        return arealocation;
    }
    public void setLocation(String arealocation) {
        this.arealocation = arealocation;
    }



    @Override
    public String toString() {
        return "Company [name=" + name + ", arealocation=" + arealocation + "]";
    }



}