package com.shop.ssm.sys.ia.model;

import lombok.ToString;
import org.springframework.stereotype.Component;

import java.io.Serializable;
import java.util.List;

@Component
@ToString
public class IaType implements Serializable {
    private Integer tid;

    private String tname;

    private String tnote;

    private List<IaNews>iaNews;



    public IaType(Integer tid, String tname, String tnote) {
        this.tid = tid;
        this.tname = tname;
        this.tnote = tnote;
    }

    public List<IaNews> getIaNews() {
        return iaNews;
    }

    public void setIaNews(List<IaNews> iaNews) {
        this.iaNews = iaNews;
    }

    public IaType() {
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