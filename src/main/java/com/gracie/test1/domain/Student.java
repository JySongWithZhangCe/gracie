package com.gracie.test1.domain;

import java.util.Date;

public class Student {
    private Integer stuid;

    private String stuname;

    private String stusex;

    private Date stubirthday;

    public Student(Integer stuid, String stuname, String stusex, Date stubirthday) {
        this.stuid = stuid;
        this.stuname = stuname;
        this.stusex = stusex;
        this.stubirthday = stubirthday;
    }

    public Student() {
        super();
    }

    public Integer getStuid() {
        return stuid;
    }

    public void setStuid(Integer stuid) {
        this.stuid = stuid;
    }

    public String getStuname() {
        return stuname;
    }

    public void setStuname(String stuname) {
        this.stuname = stuname;
    }

    public String getStusex() {
        return stusex;
    }

    public void setStusex(String stusex) {
        this.stusex = stusex;
    }

    public Date getStubirthday() {
        return stubirthday;
    }

    public void setStubirthday(Date stubirthday) {
        this.stubirthday = stubirthday;
    }
}