package com.shop.ssm.sys.pd.model;

public class PdBrand {
    private Integer bid;

    private String blogo;

    private String bname;

    private String describe;

    public PdBrand(Integer bid, String blogo, String bname, String describe) {
        this.bid = bid;
        this.blogo = blogo;
        this.bname = bname;
        this.describe = describe;
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

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }
}