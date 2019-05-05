package com.shop.ssm.sys.me.model;

import java.util.Date;

public class MeShare {
    private Integer oid;

    private Integer uid;

    private String sip;

    private Date stime;

    public MeShare(Integer oid, Integer uid, String sip, Date stime) {
        this.oid = oid;
        this.uid = uid;
        this.sip = sip;
        this.stime = stime;
    }

    public MeShare() {
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

    public String getSip() {
        return sip;
    }

    public void setSip(String sip) {
        this.sip = sip;
    }

    public Date getStime() {
        return stime;
    }

    public void setStime(Date stime) {
        this.stime = stime;
    }
}