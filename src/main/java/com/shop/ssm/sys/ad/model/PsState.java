package com.shop.ssm.sys.ad.model;

public class PsState {
    private Integer sid;

    private String sname;

    public PsState(Integer sid, String sname) {
        this.sid = sid;
        this.sname = sname;
    }

    public PsState() {
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