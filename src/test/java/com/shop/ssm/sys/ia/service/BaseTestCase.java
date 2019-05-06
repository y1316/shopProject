package com.shop.ssm.sys.ia.service;

import com.shop.ssm.base.utils.PageBean;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:spring.xml"})
public class BaseTestCase {

    protected PageBean pageBean ;

    @Before
    public void before(){
        pageBean = new PageBean();
    }

}
