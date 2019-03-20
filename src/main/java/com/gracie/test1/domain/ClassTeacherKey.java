package com.gracie.test1.domain;

public class ClassTeacherKey {
    private Integer ctid;

    private Integer classid;

    private Integer teaid;

    public ClassTeacherKey(Integer ctid, Integer classid, Integer teaid) {
        this.ctid = ctid;
        this.classid = classid;
        this.teaid = teaid;
    }

    public ClassTeacherKey() {
        super();
    }

    public Integer getCtid() {
        return ctid;
    }

    public void setCtid(Integer ctid) {
        this.ctid = ctid;
    }

    public Integer getClassid() {
        return classid;
    }

    public void setClassid(Integer classid) {
        this.classid = classid;
    }

    public Integer getTeaid() {
        return teaid;
    }

    public void setTeaid(Integer teaid) {
        this.teaid = teaid;
    }
}