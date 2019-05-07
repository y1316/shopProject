package com.shop.ssm.sys.ad.model;

import lombok.ToString;
import org.springframework.stereotype.Component;

@Component
@ToString
public class AdAdminRole {
    private Integer urid;

    private Integer uid;

    private Integer rid;

    public AdAdminRole(Integer urid, Integer uid, Integer rid) {
        this.urid = urid;
        this.uid = uid;
        this.rid = rid;
    }

    public AdAdminRole() {
        super();
    }

    public Integer getUrid() {
        return urid;
    }

    public void setUrid(Integer urid) {
        this.urid = urid;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public Integer getRid() {
        return rid;
    }

    public void setRid(Integer rid) {
        this.rid = rid;
    }
}