package com.shop.ssm.sys.me.model;

import java.util.Date;

public class MeUser {
    private Integer uid;

    private String uname;

    private String usex;

    private String utel;

    private String uemail;

    private String uaddress;

    private Date utime;

    private Integer ustate;

    private String uremake;

    public MeUser(Integer uid, String uname, String usex, String utel, String uemail, String uaddress, Date utime, Integer ustate, String uremake) {
        this.uid = uid;
        this.uname = uname;
        this.usex = usex;
        this.utel = utel;
        this.uemail = uemail;
        this.uaddress = uaddress;
        this.utime = utime;
        this.ustate = ustate;
        this.uremake = uremake;
    }

    public MeUser() {
        super();
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getUsex() {
        return usex;
    }

    public void setUsex(String usex) {
        this.usex = usex;
    }

    public String getUtel() {
        return utel;
    }

    public void setUtel(String utel) {
        this.utel = utel;
    }

    public String getUemail() {
        return uemail;
    }

    public void setUemail(String uemail) {
        this.uemail = uemail;
    }

    public String getUaddress() {
        return uaddress;
    }

    public void setUaddress(String uaddress) {
        this.uaddress = uaddress;
    }

    public Date getUtime() {
        return utime;
    }

    public void setUtime(Date utime) {
        this.utime = utime;
    }

    public Integer getUstate() {
        return ustate;
    }

    public void setUstate(Integer ustate) {
        this.ustate = ustate;
    }

    public String getUremake() {
        return uremake;
    }

    public void setUremake(String uremake) {
        this.uremake = uremake;
    }
}