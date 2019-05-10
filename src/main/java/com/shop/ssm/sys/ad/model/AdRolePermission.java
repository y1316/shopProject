package com.shop.ssm.sys.ad.model;

public class AdRolePermission {
    private Integer rpid;

    private Integer rid;

    private Integer pid;

    public AdRolePermission(Integer rpid, Integer rid, Integer pid) {
        this.rpid = rpid;
        this.rid = rid;
        this.pid = pid;
    }

    public AdRolePermission() {
        super();
    }

    public Integer getRpid() {
        return rpid;
    }

    public void setRpid(Integer rpid) {
        this.rpid = rpid;
    }

    public Integer getRid() {
        return rid;
    }

    public void setRid(Integer rid) {
        this.rid = rid;
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }
}