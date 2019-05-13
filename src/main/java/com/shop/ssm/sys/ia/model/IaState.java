package com.shop.ssm.sys.ia.model;

import lombok.ToString;
import org.springframework.stereotype.Component;

import java.io.Serializable;
import java.util.List;

@Component
@ToString
public class IaState implements Serializable {
    private Integer sid;

    private String sname;

    private List<IaNews> iaNews;

    public IaState(Integer sid, String sname) {
        this.sid = sid;
        this.sname = sname;
    }

    public List<IaNews> getIaNews() {
        return iaNews;
    }

    public void setIaNews(List<IaNews> iaNews) {
        this.iaNews = iaNews;
    }

    public IaState() {
        super();
    }

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }
}