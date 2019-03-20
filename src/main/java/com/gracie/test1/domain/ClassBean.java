package com.gracie.test1.domain;

public class ClassBean {
    private Integer classid;

    private String classname;

    public ClassBean(Integer classid, String classname) {
        this.classid = classid;
        this.classname = classname;
    }

    public ClassBean() {
        super();
    }

    public Integer getClassid() {
        return classid;
    }

    public void setClassid(Integer classid) {
        this.classid = classid;
    }

    public String getClassname() {
        return classname;
    }

    public void setClassname(String classname) {
        this.classname = classname;
    }
}