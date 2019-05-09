package com.shop.ssm.sys.ad.model;

import lombok.ToString;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@ToString
public class PsType {
    private Integer tid;

    private String tname;

private List<AdPermissions> adPermissions;
    public PsType(Integer tid, String tname) {
        this.tid = tid;
        this.tname = tname;
    }

    public List<AdPermissions> getAdPermissions() {
        return adPermissions;
    }

    public void setAdPermissions(List<AdPermissions> adPermissions) {
        this.adPermissions = adPermissions;
    }

    public PsType() {
        super();
    }

    public Integer getTid() {
        return tid;
    }

    public void setTid(Integer tid) {
        this.tid = tid;
    }

    public String getTname() {
        return tname;
    }

    public void setTname(String tname) {
        this.tname = tname;
    }

}