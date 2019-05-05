package com.shop.ssm.sys.pd.model;

public class PdState {
    private Integer sid;

    private String sname;

    public PdState(Integer sid, String sname) {
        this.sid = sid;
        this.sname = sname;
    }

    public PdState() {
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