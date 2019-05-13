package com.shop.ssm.sys.pd.model;

import lombok.ToString;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.Date;
@Component
@ToString
public class PdProduce {
    private Integer prid;

    private String prname;

    private String brieftitle;

    private Integer ptype;

    private Integer nlimit;

    private BigDecimal plength;

    private BigDecimal pwhidth;

    private BigDecimal pheight;

    private String paddress;

    private String ptexture;

    private String supplier;

    private String punit;

    private BigDecimal pkg;

    private BigDecimal marketprice;

    private BigDecimal costprice;

    private BigDecimal floorprice;

    private Date starttime;

    private String pname;

    private String pimage;

    private Integer pstate;

    private PdState pdState;

    public PdProduce(Integer prid, String prname, String brieftitle, Integer ptype, Integer nlimit, BigDecimal plength, BigDecimal pwhidth, BigDecimal pheight, String paddress, String ptexture, String supplier, String punit, BigDecimal pkg, BigDecimal marketprice, BigDecimal costprice, BigDecimal floorprice, Date starttime, String pname, String pimage, Integer pstate) {
        this.prid = prid;
        this.prname = prname;
        this.brieftitle = brieftitle;
        this.ptype = ptype;
        this.nlimit = nlimit;
        this.plength = plength;
        this.pwhidth = pwhidth;
        this.pheight = pheight;
        this.paddress = paddress;
        this.ptexture = ptexture;
        this.supplier = supplier;
        this.punit = punit;
        this.pkg = pkg;
        this.marketprice = marketprice;
        this.costprice = costprice;
        this.floorprice = floorprice;
        this.starttime = starttime;
        this.pname = pname;
        this.pimage = pimage;
        this.pstate = pstate;
    }

    public PdProduce() {
        super();
    }

    public Integer getPrid() {
        return prid;
    }

    public void setPrid(Integer prid) {
        this.prid = prid;
    }

    public String getPrname() {
        return prname;
    }

    public void setPrname(String prname) {
        this.prname = prname;
    }

    public String getBrieftitle() {
        return brieftitle;
    }

    public void setBrieftitle(String brieftitle) {
        this.brieftitle = brieftitle;
    }

    public Integer getPtype() {
        return ptype;
    }

    public void setPtype(Integer ptype) {
        this.ptype = ptype;
    }

    public Integer getNlimit() {
        return nlimit;
    }

    public void setNlimit(Integer nlimit) {
        this.nlimit = nlimit;
    }

    public BigDecimal getPlength() {
        return plength;
    }

    public void setPlength(BigDecimal plength) {
        this.plength = plength;
    }

    public BigDecimal getPwhidth() {
        return pwhidth;
    }

    public void setPwhidth(BigDecimal pwhidth) {
        this.pwhidth = pwhidth;
    }

    public BigDecimal getPheight() {
        return pheight;
    }

    public void setPheight(BigDecimal pheight) {
        this.pheight = pheight;
    }

    public String getPaddress() {
        return paddress;
    }

    public void setPaddress(String paddress) {
        this.paddress = paddress;
    }

    public String getPtexture() {
        return ptexture;
    }

    public void setPtexture(String ptexture) {
        this.ptexture = ptexture;
    }

    public String getSupplier() {
        return supplier;
    }

    public void setSupplier(String supplier) {
        this.supplier = supplier;
    }

    public String getPunit() {
        return punit;
    }

    public void setPunit(String punit) {
        this.punit = punit;
    }

    public BigDecimal getPkg() {
        return pkg;
    }

    public void setPkg(BigDecimal pkg) {
        this.pkg = pkg;
    }

    public BigDecimal getMarketprice() {
        return marketprice;
    }

    public void setMarketprice(BigDecimal marketprice) {
        this.marketprice = marketprice;
    }

    public BigDecimal getCostprice() {
        return costprice;
    }

    public void setCostprice(BigDecimal costprice) {
        this.costprice = costprice;
    }

    public BigDecimal getFloorprice() {
        return floorprice;
    }

    public void setFloorprice(BigDecimal floorprice) {
        this.floorprice = floorprice;
    }

    public Date getStarttime() {
        return starttime;
    }

    public void setStarttime(Date starttime) {
        this.starttime = starttime;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public String getPimage() {
        return pimage;
    }

    public void setPimage(String pimage) {
        this.pimage = pimage;
    }

    public Integer getPstate() {
        return pstate;
    }

    public void setPstate(Integer pstate) {
        this.pstate = pstate;
    }

    public PdState getPdState() {
        return pdState;
    }

    public void setPdState(PdState pdState) {
        this.pdState = pdState;
    }
}