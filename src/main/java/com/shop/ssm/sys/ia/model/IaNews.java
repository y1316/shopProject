package com.shop.ssm.sys.ia.model;

import lombok.ToString;
import org.springframework.stereotype.Component;

@Component
@ToString
public class IaNews {
    private Integer nid;

    private String ntitle;

    private String nbrieftitle;

    private Integer ntype;

    private String nabstract;

    private String nwriter;

    private String nsource;

    private Integer nlimit;

    private Integer nviewed;

    private Integer nstate;

    private String content;

    public IaNews(Integer nid, String ntitle, String nbrieftitle, Integer ntype, String nabstract, String nwriter, String nsource, Integer nlimit, Integer nviewed, Integer nstate, String content) {
        this.nid = nid;
        this.ntitle = ntitle;
        this.nbrieftitle = nbrieftitle;
        this.ntype = ntype;
        this.nabstract = nabstract;
        this.nwriter = nwriter;
        this.nsource = nsource;
        this.nlimit = nlimit;
        this.nviewed = nviewed;
        this.nstate = nstate;
        this.content = content;
    }

    public IaNews() {
        super();
    }

    public Integer getNid() {
        return nid;
    }

    public void setNid(Integer nid) {
        this.nid = nid;
    }

    public String getNtitle() {
        return ntitle;
    }

    public void setNtitle(String ntitle) {
        this.ntitle = ntitle;
    }

    public String getNbrieftitle() {
        return nbrieftitle;
    }

    public void setNbrieftitle(String nbrieftitle) {
        this.nbrieftitle = nbrieftitle;
    }

    public Integer getNtype() {
        return ntype;
    }

    public void setNtype(Integer ntype) {
        this.ntype = ntype;
    }

    public String getNabstract() {
        return nabstract;
    }

    public void setNabstract(String nabstract) {
        this.nabstract = nabstract;
    }

    public String getNwriter() {
        return nwriter;
    }

    public void setNwriter(String nwriter) {
        this.nwriter = nwriter;
    }

    public String getNsource() {
        return nsource;
    }

    public void setNsource(String nsource) {
        this.nsource = nsource;
    }

    public Integer getNlimit() {
        return nlimit;
    }

    public void setNlimit(Integer nlimit) {
        this.nlimit = nlimit;
    }

    public Integer getNviewed() {
        return nviewed;
    }

    public void setNviewed(Integer nviewed) {
        this.nviewed = nviewed;
    }

    public Integer getNstate() {
        return nstate;
    }

    public void setNstate(Integer nstate) {
        this.nstate = nstate;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}