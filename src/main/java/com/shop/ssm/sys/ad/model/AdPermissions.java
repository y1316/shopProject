package com.shop.ssm.sys.ad.model;

public class AdPermissions {
    private Integer pid;

    private String pname;

    private String level;

    private Integer parenPid;

    private Integer pstate;

    private String rdescribe;

    public AdPermissions(Integer pid, String pname, String level, Integer parenPid, Integer pstate, String rdescribe) {
        this.pid = pid;
        this.pname = pname;
        this.level = level;
        this.parenPid = parenPid;
        this.pstate = pstate;
        this.rdescribe = rdescribe;
    }

    public AdPermissions() {
        super();
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public Integer getParenPid() {
        return parenPid;
    }

    public void setParenPid(Integer parenPid) {
        this.parenPid = parenPid;
    }

    public Integer getPstate() {
        return pstate;
    }

    public void setPstate(Integer pstate) {
        this.pstate = pstate;
    }

    public String getRdescribe() {
        return rdescribe;
    }

    public void setRdescribe(String rdescribe) {
        this.rdescribe = rdescribe;
    }
}