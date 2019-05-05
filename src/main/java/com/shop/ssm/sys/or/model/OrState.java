package com.shop.ssm.sys.or.model;

public class OrState {
    private Integer sid;

    private String sname;

    public OrState(Integer sid, String sname) {
        this.sid = sid;
        this.sname = sname;
    }

    public OrState() {
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