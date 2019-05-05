package com.shop.ssm.sys.st.model;

public class RcDistrict {
    private Short id;

    private Short pid;

    private String district;

    private Boolean level;

    public RcDistrict(Short id, Short pid, String district, Boolean level) {
        this.id = id;
        this.pid = pid;
        this.district = district;
        this.level = level;
    }

    public RcDistrict() {
        super();
    }

    public Short getId() {
        return id;
    }

    public void setId(Short id) {
        this.id = id;
    }

    public Short getPid() {
        return pid;
    }

    public void setPid(Short pid) {
        this.pid = pid;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public Boolean getLevel() {
        return level;
    }

    public void setLevel(Boolean level) {
        this.level = level;
    }
}