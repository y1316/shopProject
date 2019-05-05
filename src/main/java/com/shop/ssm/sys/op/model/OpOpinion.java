package com.shop.ssm.sys.op.model;

public class OpOpinion {
    private Integer oid;

    private Integer uid;

    private String omessage;

    public OpOpinion(Integer oid, Integer uid, String omessage) {
        this.oid = oid;
        this.uid = uid;
        this.omessage = omessage;
    }

    public OpOpinion() {
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

    public String getOmessage() {
        return omessage;
    }

    public void setOmessage(String omessage) {
        this.omessage = omessage;
    }
}