package com.shop.ssm.sys.ad.model;

import lombok.ToString;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@ToString
public class AdState {
    private Integer sid;

    private String sname;

    private List<AdAdmin> adAdmins;

    public AdState(Integer sid, String sname) {
        this.sid = sid;
        this.sname = sname;
    }

    public List<AdAdmin> getAdAdmins() {
        return adAdmins;
    }

    public void setAdAdmins(List<AdAdmin> adAdmins) {
        this.adAdmins = adAdmins;
    }

    public AdState() {
        super();
    }

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }
}