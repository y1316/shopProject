package com.shop.ssm.sys.or.model;

import java.math.BigDecimal;

public class OrOrder {
    private Integer oid;

    private Integer nid;

    private Integer oestado;

    private BigDecimal osum;

    public OrOrder(Integer oid, Integer nid, Integer oestado, BigDecimal osum) {
        this.oid = oid;
        this.nid = nid;
        this.oestado = oestado;
        this.osum = osum;
    }

    public OrOrder() {
        super();
    }

    public Integer getOid() {
        return oid;
    }

    public void setOid(Integer oid) {
        this.oid = oid;
    }

    public Integer getNid() {
        return nid;
    }

    public void setNid(Integer nid) {
        this.nid = nid;
    }

    public Integer getOestado() {
        return oestado;
    }

    public void setOestado(Integer oestado) {
        this.oestado = oestado;
    }

    public BigDecimal getOsum() {
        return osum;
    }

    public void setOsum(BigDecimal osum) {
        this.osum = osum;
    }
}