package com.shop.ssm.sys.st.model;

public class ColType {
    private Integer tid;

    private String tname;

    public ColType(Integer tid, String tname) {
        this.tid = tid;
        this.tname = tname;
    }

    public ColType() {
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