package com.day4;

public class Student {

    private String stuName;
    private int stuId;
    private String dept;
    private String college;

    public Student(){

    }

    public Student(String stuName, int stuId, String dept, String college) {
        super();
        this.stuName = stuName;
        this.stuId = stuId;
        this.dept = dept;
        this.college = college;
    }

    @Override
    public String toString() {
        return "\n\nStudent{" +
                "stuName='" + stuName + '\'' +
                ", stuId=" + stuId +
                ", dept='" + dept + '\'' +
                ", college='" + college + '\'' +
                '}';
    }

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    public int getStuId() {
        return stuId;
    }

    public void setStuId(int stuId) {
        this.stuId = stuId;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public String getCollege() {
        return college;
    }

    public void setCollege(String college) {
        this.college = college;
    }



}
