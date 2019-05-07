package com.shop.ssm.sys.ad.model;

public class PsType {
    private Integer tid;

    private String tname;

    public PsType(Integer tid, String tname) {
        this.tid = tid;
        this.tname = tname;
    }

    public PsType() {
        super();
    }

    public Integer getTid() {
        return tid;
    }

    public void setTid(Integer tid) {
        this.tid = tid;
    }

    public String getTname() {
        return tname;
    }

    public void setTname(String tname) {
        this.tname = tname;
    }
}