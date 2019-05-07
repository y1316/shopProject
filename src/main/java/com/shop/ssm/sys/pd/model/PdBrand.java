package com.shop.ssm.sys.pd.model;

import lombok.ToString;
import org.springframework.stereotype.Component;

@Component
@ToString
public class PdBrand {
    private Integer bid;

    private String blogo;

    private String bname;

    private String bdescribe;

    public PdBrand(Integer bid, String blogo, String bname, String bdescribe) {
        this.bid = bid;
        this.blogo = blogo;
        this.bname = bname;
        this.bdescribe = bdescribe;
    }

    public PdBrand() {
        super();
    }

    public Integer getBid() {
        return bid;
    }

    public void setBid(Integer bid) {
        this.bid = bid;
    }

    public String getBlogo() {
        return blogo;
    }

    public void setBlogo(String blogo) {
        this.blogo = blogo;
    }

    public String getBname() {
        return bname;
    }

    public void setBname(String bname) {
        this.bname = bname;
    }

    public String getBdescribe() {
        return bdescribe;
    }

    public void setBdescribe(String describe) {
        this.bdescribe = describe;
    }
}