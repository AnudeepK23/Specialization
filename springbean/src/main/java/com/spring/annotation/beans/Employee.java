package com.spring.annotation.beans;

import javax.annotation.Resource;



public class Employee {
    private String eid;
    private String name;



    @Resource(name = "mycompany")
    private Company company;



    public String getId() {
        return eid;
    }



    public void setId(String eid) {
        this.eid = eid;
    }



    public String getName() {
        return name;
    }



    public void setName(String name) {
        this.name=name;
    }



    @Override
    public String toString() {
        return "Employee{" +
                "eid='" + eid + '\'' +
                ", name='" + name + '\'' +
                ", company=" + company +
                '}';
    }
}