package com.shop.ssm.sys.me.model;

import java.util.Date;

public class MeBowse {
    private Integer oid;

    private Integer uid;

    private String bip;

    private Date btime;

    public MeBowse(Integer oid, Integer uid, String bip, Date btime) {
        this.oid = oid;
        this.uid = uid;
        this.bip = bip;
        this.btime = btime;
    }

    public MeBowse() {
        super();
    }

    public Integer getOid() {
        return oid;
    }

    public void setOid(Integer oid) {
        this.oid = oid;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getBip() {
        return bip;
    }

    public void setBip(String bip) {
        this.bip = bip;
    }

    public Date getBtime() {
        return btime;
    }

    public void setBtime(Date btime) {
        this.btime = btime;
    }
}