package com.shop.ssm.sys.ia.service.impl;

import com.shop.ssm.sys.ia.mapper.IaNewsMapper;
import com.shop.ssm.sys.ia.model.IaNews;
import com.shop.ssm.sys.ia.service.BaseTestCase;
import com.shop.ssm.sys.ia.service.IiaNewsService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import static org.junit.Assert.*;

public class IaNewsImplTest extends BaseTestCase {

    @Autowired
   private IiaNewsService iiaNewsService;
    private IaNews iaNews;

    @Override
    public void before() {
        super.before();
        iaNews=new IaNews();
    }

    @Test
    public void deleteByPrimaryKey() {
    }

    @Test
    public void insert() {
        iaNews.setNtitle("胖虎看彩虹");
        iaNews.setNbrieftitle("胖虎老弟");
        iaNews.setNtype(1);
        iaNews.setNabstract("萨瓦渡口");
        iaNews.setNwriter("轩轩");
        iaNews.setNsource("娱乐");
        iaNews.setNlimit(1);
        iaNews.setNviewed(1);
        iaNews.setNstate(1);
        iaNews.setContent("insaosdnaonsdsd撒旦卡死买点什么撒打算卡");
        iiaNewsService.insert(iaNews);

    }

    @Test
    public void selectByPrimaryKey() {
    }

    @Test
    public void updateByPrimaryKey() {
    }

    @Test
    public void list() {
    }
}