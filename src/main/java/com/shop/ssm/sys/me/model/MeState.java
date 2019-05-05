package com.shop.ssm.sys.me.model;

public class MeState {
    private Integer sid;

    private String sname;

    public MeState(Integer sid, String sname) {
        this.sid = sid;
        this.sname = sname;
    }

    public MeState() {
        super();
    }

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }
}