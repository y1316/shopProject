package com.shop.ssm.sys.ad.model;

import java.util.Date;

public class AdAdmin {
    private Integer aid;

    private Integer rid;

    private String aname;

    private String asex;

    private Date atime;

    private Integer astate;

    private String atel;

    private String aemail;

    public AdAdmin(Integer aid, Integer rid, String aname, String asex, Date atime, Integer astate, String atel, String aemail) {
        this.aid = aid;
        this.rid = rid;
        this.aname = aname;
        this.asex = asex;
        this.atime = atime;
        this.astate = astate;
        this.atel = atel;
        this.aemail = aemail;
    }

    public AdAdmin() {
        super();
    }

    public Integer getAid() {
        return aid;
    }

    public void setAid(Integer aid) {
        this.aid = aid;
    }

    public Integer getRid() {
        return rid;
    }

    public void setRid(Integer rid) {
        this.rid = rid;
    }

    public String getAname() {
        return aname;
    }

    public void setAname(String aname) {
        this.aname = aname;
    }

    public String getAsex() {
        return asex;
    }

    public void setAsex(String asex) {
        this.asex = asex;
    }

    public Date getAtime() {
        return atime;
    }

    public void setAtime(Date atime) {
        this.atime = atime;
    }

    public Integer getAstate() {
        return astate;
    }

    public void setAstate(Integer astate) {
        this.astate = astate;
    }

    public String getAtel() {
        return atel;
    }

    public void setAtel(String atel) {
        this.atel = atel;
    }

    public String getAemail() {
        return aemail;
    }

    public void setAemail(String aemail) {
        this.aemail = aemail;
    }
}