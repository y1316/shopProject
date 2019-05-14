package com.shop.ssm.sys.or.model;

import lombok.ToString;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.Date;

@Component
@ToString
public class OrItem {
    private Integer iid;

    private Integer pid;

    private Date createdate;

    private Integer icount;

    private BigDecimal isum;

    public OrItem(Integer iid, Integer pid, Date createdate, Integer icount, BigDecimal isum) {
        this.iid = iid;
        this.pid = pid;
        this.createdate = createdate;
        this.icount = icount;
        this.isum = isum;
    }

    public OrItem() {
        super();
    }

    public Integer getIid() {
        return iid;
    }

    public void setIid(Integer iid) {
        this.iid = iid;
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public Date getCreatedate() {
        return createdate;
    }

    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }

    public Integer getIcount() {
        return icount;
    }

    public void setIcount(Integer icount) {
        this.icount = icount;
    }

    public BigDecimal getIsum() {
        return isum;
    }

    public void setIsum(BigDecimal isum) {
        this.isum = isum;
    }
}