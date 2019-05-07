package com.shop.ssm.sys.ad.model;

import lombok.ToString;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@ToString
public class AdRole {
    private Integer rid;

    private String rname;

    private Integer astate;

    private String rdescribe;

    private List<AdAdmin> adAdmins;

    private RlState rlState;
    public AdRole(Integer rid, String rname, Integer astate, String rdescribe) {
        this.rid = rid;
        this.rname = rname;
        this.astate = astate;
        this.rdescribe = rdescribe;
    }

    public List<AdAdmin> getAdAdmins() {
        return adAdmins;
    }

    public void setAdAdmins(List<AdAdmin> adAdmins) {
        this.adAdmins = adAdmins;
    }

    public RlState getRlState() {
        return rlState;
    }

    public void setRlState(RlState rlState) {
        this.rlState = rlState;
    }

    public AdRole() {
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