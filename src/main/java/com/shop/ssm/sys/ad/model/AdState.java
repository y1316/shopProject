package com.shop.ssm.sys.ad.model;

public class AdState {
    private Integer sid;

    private String sname;

    public AdState(Integer sid, String sname) {
        this.sid = sid;
        this.sname = sname;
    }

    public AdState() {
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