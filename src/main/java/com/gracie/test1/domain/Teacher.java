package com.gracie.test1.domain;

public class Teacher {
    private Integer teaid;

    private String teaname;

    private String teasex;

    public Teacher(Integer teaid, String teaname, String teasex) {
        this.teaid = teaid;
        this.teaname = teaname;
        this.teasex = teasex;
    }

    public Teacher() {
        super();
    }

    public Integer getTeaid() {
        return teaid;
    }

    public void setTeaid(Integer teaid) {
        this.teaid = teaid;
    }

    public String getTeaname() {
        return teaname;
    }

    public void setTeaname(String teaname) {
        this.teaname = teaname;
    }

    public String getTeasex() {
        return teasex;
    }

    public void setTeasex(String teasex) {
        this.teasex = teasex;
    }
}