package com.shop.ssm.sys.ia.service.impl;

import com.shop.ssm.sys.ia.model.IaNews;
import com.shop.ssm.sys.ia.service.BaseTestCase;
import com.shop.ssm.sys.ia.service.IiaNewsService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.sql.Timestamp;
import java.util.List;

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

        for (int i=1;i<30;i++) {
            iaNews.setNtitle("胖虎看彩虹萨松看就看"+i);
            iaNews.setNbrieftitle("胖虎老弟");
            iaNews.setNtype(2);
            iaNews.setNabstract("萨瓦渡口");
            iaNews.setNwriter("轩轩");
            iaNews.setNsource("娱乐");
            iaNews.setUpdatetime(null);
            iaNews.setNlimit(2);
            iaNews.setNviewed(2);
            iaNews.setNstate(2);
            iaNews.setContent("insaosdnaosda撒大大买卡");
            iiaNewsService.insert(iaNews);
        }
    }

    @Test
    public void selectByPrimaryKey() {
        iaNews.setNid(2);
        IaNews iaNews = iiaNewsService.selectByPrimaryKey(this.iaNews);
        System.out.println(iaNews);
    }

    @Test
    public void updateByPrimaryKey() {
        iaNews.setNid(4);
        iaNews.setNtitle("胖虎看彩虹哈哈哈哈哈");
        iaNews.setNbrieftitle("胖虎老弟hjhhhh");
        iaNews.setNtype(1);
        iaNews.setNabstract("萨瓦渡口jjjj");
        iaNews.setNwriter("轩轩饲养员");
        iaNews.setNsource("娱乐云");
        iaNews.setUpdatetime(null);
        iaNews.setNlimit(2);
        iaNews.setNviewed(2);
        iaNews.setNstate(2);
        iaNews.setContent("insaosdn撒旦撒撒旦卡死买卡");
        iiaNewsService.updateByPrimaryKey(iaNews);
    }

    @Test
    public void list() {
        List<IaNews> list = iiaNewsService.list(iaNews, null);
            System.out.println(list);

    }
}