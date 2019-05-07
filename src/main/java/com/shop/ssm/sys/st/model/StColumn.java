package com.shop.ssm.sys.st.model;

public class StColumn {
    private Integer cid;

    private String cname;

    private Integer level;

    private String alias;

    private String catalogue;

    private Integer pid;

    private Integer stype;

    public StColumn(Integer cid, String cname, Integer level, String alias, String catalogue, Integer pid, Integer stype) {
        this.cid = cid;
        this.cname = cname;
        this.level = level;
        this.alias = alias;
        this.catalogue = catalogue;
        this.pid = pid;
        this.stype = stype;
    }

    public StColumn() {
        super();
    }

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public String getCatalogue() {
        return catalogue;
    }

    public void setCatalogue(String catalogue) {
        this.catalogue = catalogue;
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public Integer getStype() {
        return stype;
    }

    public void setStype(Integer stype) {
        this.stype = stype;
    }
}