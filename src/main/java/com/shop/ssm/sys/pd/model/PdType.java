package com.shop.ssm.sys.pd.model;

import lombok.ToString;
import org.springframework.stereotype.Component;

@Component
@ToString
public class PdType {
    private Integer tid;

    private String tname;

    private String tnote;

    public PdType(Integer tid, String tname, String tnote) {
        this.tid = tid;
        this.tname = tname;
        this.tnote = tnote;
    }

    public PdType() {
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

    public String getTnote() {
        return tnote;
    }

    public void setTnote(String tnote) {
        this.tnote = tnote;
    }
}