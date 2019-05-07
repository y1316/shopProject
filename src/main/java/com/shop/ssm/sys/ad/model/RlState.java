package com.shop.ssm.sys.ad.model;

import lombok.ToString;
import org.springframework.stereotype.Component;

@Component
@ToString
public class RlState {
    private Integer sid;

    private String sname;


    public RlState(Integer sid, String sname) {
        this.sid = sid;
        this.sname = sname;
    }

    public RlState() {
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