package com.shop.ssm.sys.ad.model;

public class Role {
    private Integer rid;

    private String rname;

    private Integer astate;

    private String rdescribe;

    public Role(Integer rid, String rname, Integer astate, String rdescribe) {
        this.rid = rid;
        this.rname = rname;
        this.astate = astate;
        this.rdescribe = rdescribe;
    }

    public Role() {
        super();
    }

    public Integer getRid() {
        return rid;
    }

    public void setRid(Integer rid) {
        this.rid = rid;
    }

    public String getRname() {
        return rname;
    }

    public void setRname(String rname) {
        this.rname = rname;
    }

    public Integer getAstate() {
        return astate;
    }

    public void setAstate(Integer astate) {
        this.astate = astate;
    }

    public String getRdescribe() {
        return rdescribe;
    }

    public void setRdescribe(String rdescribe) {
        this.rdescribe = rdescribe;
    }
}