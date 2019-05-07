package com.shop.ssm.sys.ad.model;

import java.util.Date;
import java.util.List;

public class AdAdmin {
    private Integer aid;

    private String aname;

    private String apwd;

    private String salt;

    private String asex;

    private Date atime;

    private Integer astate;

    private String atel;

    private String aemail;

    private String aremake;

    private AdState adState;

    private List<AdRole> adRoles;

    public AdAdmin(Integer aid, String aname, String apwd, String salt, String asex, Date atime, Integer astate, String atel, String aemail, String aremake) {
        this.aid = aid;
        this.aname = aname;
        this.apwd = apwd;
        this.salt = salt;
        this.asex = asex;
        this.atime = atime;
        this.astate = astate;
        this.atel = atel;
        this.aemail = aemail;
        this.aremake = aremake;
    }

    public AdAdmin() {
        super();
    }

    public List<AdRole> getAdRoles() {
        return adRoles;
    }

    public void setAdRoles(List<AdRole> adRoles) {
        this.adRoles = adRoles;
    }

    public AdState getAdState() {
        return adState;
    }

    public void setAdState(AdState adState) {
        this.adState = adState;
    }

    public Integer getAid() {
        return aid;
    }

    public void setAid(Integer aid) {
        this.aid = aid;
    }

    public String getAname() {
        return aname;
    }

    public void setAname(String aname) {
        this.aname = aname;
    }

    public String getApwd() {
        return apwd;
    }

    public void setApwd(String apwd) {
        this.apwd = apwd;
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
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

    public String getAremake() {
        return aremake;
    }

    public void setAremake(String aremake) {
        this.aremake = aremake;
    }
}